package com.infomaniak.designsystem.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class ThemeModuleConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply("org.jetbrains.kotlin.multiplatform")
            apply("com.android.kotlin.multiplatform.library")
            apply("com.infomaniak.designsystem.convention.android")
            apply("com.infomaniak.designsystem.convention.compose.multiplatform.library")
            apply("com.infomaniak.designsystem.convention.compose.multiplatform.preview")
            apply("com.infomaniak.designsystem.convention.publishing")
        }

        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.commonMain.dependencies {
                // Exposed as "api" because theme modules expose public vals of type EsdsTheme.Values
                // (defined in Foundation) directly as part of their public API.
                api(project(":Foundation"))
                implementation(project(":PrimitiveTokens"))

            }
        }
    }
}
