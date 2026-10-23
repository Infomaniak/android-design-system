package com.infomaniak.designsystem.catalog.navigation

import androidx.navigation3.runtime.NavKey
import androidx.savedstate.serialization.SavedStateConfiguration
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

/** Every destination of the catalog app. New screens only need a new `@Serializable` subtype here. */
@Serializable
sealed interface CatalogNavKey : NavKey {

    @Serializable
    data object AllIcons : CatalogNavKey

    /** [iconName] is the simple icon name, e.g. `Bell` for `EsdsIcons.Medium.Bell`. */
    @Serializable
    data class IconDetail(val iconName: String) : CatalogNavKey
}

// Required to save/restore the back stack on non-Android targets, where NavKey subtypes can't be resolved by reflection.
@OptIn(ExperimentalSerializationApi::class)
internal val CatalogSavedStateConfiguration = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclassesOfSealed<CatalogNavKey>()
        }
    }
}
