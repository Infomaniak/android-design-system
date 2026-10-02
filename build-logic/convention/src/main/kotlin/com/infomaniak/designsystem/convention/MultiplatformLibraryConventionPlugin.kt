package com.infomaniak.designsystem.convention

import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MultiplatformLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project): Unit = with(target) {
        pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            configureKotlinMultiplatform()
        }
        pluginManager.withPlugin("com.android.kotlin.multiplatform.library") {
            configureAndroid()
        }

        pluginManager.apply("org.jetbrains.kotlin.plugin.compose")
        pluginManager.apply("com.infomaniak.designsystem.convention.ktlint")

        tasks.withType<JavaCompile>().configureEach {
            options.release.set(17)
        }
    }

    private fun Project.configureKotlinMultiplatform() {
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

    private fun Project.configureAndroid() {
        val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
        kotlin.apply {
            this.extensions.configure<KotlinMultiplatformAndroidLibraryTarget>("android") {
                compileSdk = 37
                minSdk = 27
                compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }
    }
}
