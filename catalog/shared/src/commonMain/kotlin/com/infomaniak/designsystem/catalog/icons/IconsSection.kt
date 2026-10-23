package com.infomaniak.designsystem.catalog.icons

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.infomaniak.designsystem.catalog.navigation.CatalogSection
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.SquaresFour
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.PolymorphicModuleBuilder

@Serializable
internal sealed interface IconsNavKey : NavKey {
    @Serializable
    data object Grid : IconsNavKey

    /** [iconName] is the name of the `EsdsIcons` property, e.g. `Bell` for `EsdsIcons.Bell`. */
    @Serializable
    data class Detail(val iconName: String) : IconsNavKey
}

internal object IconsSection : CatalogSection {
    override val title = "Icons"
    override val icon = EsdsIcons.SquaresFour
    override val startKey = IconsNavKey.Grid

    @OptIn(ExperimentalSerializationApi::class)
    override fun PolymorphicModuleBuilder<NavKey>.registerNavKeys() = subclassesOfSealed<IconsNavKey>()

    override fun EntryProviderScope<NavKey>.entries(backStack: NavBackStack<NavKey>) {
        entry<IconsNavKey.Grid> {
            IconsScreen(onIconClick = { icon -> backStack.add(IconsNavKey.Detail(icon.name)) })
        }
        entry<IconsNavKey.Detail> { key ->
            IconDetailScreen(iconName = key.iconName, onBack = { backStack.removeLastOrNull() })
        }
    }
}
