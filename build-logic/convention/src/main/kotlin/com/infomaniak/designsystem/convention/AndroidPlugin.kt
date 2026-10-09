package com.infomaniak.designsystem.convention

import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class AndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.withPlugin("com.android.application") { configureAndroid() }
        pluginManager.withPlugin("com.android.kotlin.multiplatform.library") {
            configureMultiplatformAndroidLibrary()
        }
    }

    private fun Project.configureAndroid() {
        extensions.configure<CommonExtension> {
            compileSdk {
                version = release(37)
            }
            defaultConfig.apply {
                minSdk = 27
            }
            compileOptions.apply {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }

        pluginManager.apply("org.jlleitschuh.gradle.ktlint")
        extensions.configure<KtlintExtension> {
            version.set("1.8.0")
        }
    }

    private fun Project.configureMultiplatformAndroidLibrary() {
        val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
        kotlin.apply {
            this.extensions.configure<KotlinMultiplatformAndroidLibraryTarget>("android") {
                compileSdk = 37
                minSdk = 27
                compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }

        pluginManager.apply("org.jlleitschuh.gradle.ktlint")
    }

    companion object {
        const val ANDROID_MIN_SDK = 27
        const val ANDROID_COMPILE_SDK = 37
    }
}
