package com.infomaniak.designsystem.catalog.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.infomaniak.designsystem.catalog.icons.IconsSection
import com.infomaniak.designsystem.catalog.theme.ThemeNavKey
import com.infomaniak.designsystem.icons.symbols.Symbol
import kotlinx.serialization.modules.PolymorphicModuleBuilder

/**
 * A top-level area of the catalog (icons, components, …), reachable from the navigation bar.
 *
 * To add one, implement this interface next to its screens (see [IconsSection]) and add it to [CatalogSections].
 * The navigation bar is shown automatically as soon as there is more than one section.
 * Destinations shared by every section, like [ThemeNavKey], can be pushed on the back stack from any of them.
 */
internal interface CatalogSection {
    val title: String
    val icon: Symbol

    /** Destination shown when the section is selected. */
    val startKey: NavKey

    /** Registers the section's `@Serializable` [NavKey]s, e.g. `subclassesOfSealed<MyNavKey>()`, to save the back stack. */
    fun PolymorphicModuleBuilder<NavKey>.registerNavKeys()

    /** Declares the screen of each of the section's [NavKey]s, e.g. `entry<MyNavKey.Home> { HomeScreen() }`. */
    fun EntryProviderScope<NavKey>.entries(backStack: NavBackStack<NavKey>)
}

/** Every section of the catalog, in navigation bar order. The first one is the start destination. */
internal val CatalogSections: List<CatalogSection> = listOf(
    IconsSection,
)
