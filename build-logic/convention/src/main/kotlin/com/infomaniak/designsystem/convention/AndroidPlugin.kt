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
                version = release(ANDROID_COMPILE_SDK)
            }
            defaultConfig.apply {
                minSdk = ANDROID_MIN_SDK
            }
            compileOptions.apply {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }

        pluginManager.apply("com.infomaniak.designsystem.convention.ktlint")
    }

    private fun Project.configureMultiplatformAndroidLibrary() {
        val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
        kotlin.apply {
            this.extensions.configure<KotlinMultiplatformAndroidLibraryTarget>("android") {
                compileSdk = ANDROID_COMPILE_SDK
                minSdk = ANDROID_MIN_SDK
                compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }
        pluginManager.apply("com.infomaniak.designsystem.convention.ktlint")
    }

    companion object AndroidSdk {
        const val ANDROID_MIN_SDK = 27
        const val ANDROID_COMPILE_SDK = 37
    }
}
