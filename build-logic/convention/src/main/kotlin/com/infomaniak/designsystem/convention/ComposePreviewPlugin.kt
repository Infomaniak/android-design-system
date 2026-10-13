package com.infomaniak.designsystem.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class ComposePreviewPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.withPlugin("com.infomaniak.designsystem.convention.compose.multiplatform.library") {
            configureComposePreview()
        }
    }

    private fun Project.configureComposePreview() {
        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.commonMain.dependencies {
                implementation(libs.findLibrary("compose-multiplatform-ui-tooling-preview").get())
            }
        }

        dependencies {
            // Runtime-only, for Android Studio previews: not part of the published metadata.
            add("androidRuntimeClasspath", libs.findLibrary("compose-multiplatform-ui-tooling").get())
        }
    }
}
