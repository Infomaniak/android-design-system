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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.map
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

// Nullable so screens still work outside of the app (e.g. in @Preview), where preferences are only kept in memory.
internal val LocalCatalogDataStore = staticCompositionLocalOf<DataStore<Preferences>?> { null }

/** User preference persisted under [key], [default] until it's loaded or if it was never set. */
@Composable
internal fun <T> rememberPreference(key: Preferences.Key<T>, default: T): MutableState<T> {
    val dataStore = LocalCatalogDataStore.current ?: return rememberSaveable { mutableStateOf(default) }
    val scope = rememberCoroutineScope()
    val state = remember(dataStore, key) { dataStore.data.map { it[key] ?: default } }.collectAsState(default)
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
