package com.infomaniak.designsystem.catalog.settings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import okio.Path.Companion.toPath

internal const val CatalogPreferencesFileName = "catalog.preferences_pb"

/** Absolute path of the file storing the catalog preferences. */
@Composable
internal expect fun catalogPreferencesPath(): String

// DataStore only supports a single instance per file.
private var catalogDataStore: DataStore<Preferences>? = null

@Composable
internal fun rememberCatalogDataStore(): DataStore<Preferences> {
    val path = catalogPreferencesPath()
    return remember {
        catalogDataStore ?: PreferenceDataStoreFactory.createWithPath { path.toPath() }.also { catalogDataStore = it }
    }
}

// Last loaded preferences, so screens opened later directly start from the saved values instead of the defaults.
private var latestPreferences: Preferences? = null

// Nullable so screens still work outside of the app (e.g. in @Preview), where preferences are only kept in memory.
internal val LocalCatalogDataStore = staticCompositionLocalOf<DataStore<Preferences>?> { null }

/** Whether the preferences have been loaded, to avoid briefly showing defaults (e.g. the wrong theme) on launch. */
@Composable
internal fun rememberPreferencesLoaded(): Boolean {
    val dataStore = LocalCatalogDataStore.current ?: return true
    return remember(dataStore) { dataStore.data.onEach { latestPreferences = it }.map { true } }
        .collectAsState(initial = latestPreferences != null).value
}

/** User preference persisted under [key], [default] until it's loaded or if it was never set. */
@Composable
internal fun <T> rememberPreference(key: Preferences.Key<T>, default: T): MutableState<T> {
    val dataStore = LocalCatalogDataStore.current ?: return rememberSaveable { mutableStateOf(default) }
    val scope = rememberCoroutineScope()
    val state = remember(dataStore, key) {
        dataStore.data.onEach { latestPreferences = it }.map { it[key] ?: default }
    }.collectAsState(initial = latestPreferences?.get(key) ?: default)
    return remember(state, dataStore, key, scope) { PreferenceState(state, dataStore, key, scope) }
}

private class PreferenceState<T>(
    private val state: State<T>,
    private val dataStore: DataStore<Preferences>,
    private val key: Preferences.Key<T>,
    private val scope: CoroutineScope,
) : MutableState<T> {
    override var value: T
        get() = state.value
        set(value) {
            scope.launch { dataStore.edit { it[key] = value } }
        }

    override fun component1(): T = value

    override fun component2(): (T) -> Unit = { value = it }
}

/** User preference persisted under [name], holding one of the [entries] of an enum. */
@Composable
internal fun <E : Enum<E>> rememberEnumPreference(name: String, default: E, entries: List<E>): MutableState<E> {
    val nameState = rememberPreference(stringPreferencesKey(name), default.name)
    return remember(nameState, entries) { EnumPreferenceState(nameState, default, entries) }
}

private class EnumPreferenceState<E : Enum<E>>(
    private val nameState: MutableState<String>,
    private val default: E,
    private val entries: List<E>,
) : MutableState<E> {
    // Falls back to the default if the saved entry doesn't exist anymore.
    override var value: E
        get() = entries.firstOrNull { it.name == nameState.value } ?: default
        set(value) {
            nameState.value = value.name
        }

    override fun component1(): E = value

    override fun component2(): (E) -> Unit = { value = it }
}
