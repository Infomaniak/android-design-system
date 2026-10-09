package com.infomaniak.designsystem.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class ComposeMultiplatformLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project): Unit = with(target) {
        pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            configureComposeMultiplatform()
        }
        pluginManager.apply("com.infomaniak.designsystem.convention.ktlint")

        tasks.withType<JavaCompile>().configureEach {
            options.release.set(17)
        }
    }

    private fun Project.configureComposeMultiplatform() {
        pluginManager.apply("org.jetbrains.kotlin.plugin.compose")

        val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        kotlin.apply {
            sourceSets.getByName("commonMain").dependencies {
                implementation(libs.findLibrary("compose-multiplatform-runtime").get())
                implementation(libs.findLibrary("compose-multiplatform-foundation").get())
                implementation(libs.findLibrary("compose-multiplatform-material3").get())
                implementation(libs.findLibrary("compose-multiplatform-ui").get())
                implementation(libs.findLibrary("compose-multiplatform-ui-graphics").get())
            }

            jvm {
                compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }
    }
}
