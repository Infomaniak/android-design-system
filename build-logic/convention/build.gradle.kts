plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    implementation(libs.ktlint.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("android") {
            id = "com.infomaniak.designsystem.convention.android"
            implementationClass = "com.infomaniak.designsystem.convention.AndroidPlugin"
        }
        register("composeMultiplatformLibrary") {
            id = "com.infomaniak.designsystem.convention.compose.multiplatform.library"
            implementationClass = "com.infomaniak.designsystem.convention.ComposeMultiplatformLibraryPlugin"
        }
        register("ktlint") {
            id = "com.infomaniak.designsystem.convention.ktlint"
            implementationClass = "com.infomaniak.designsystem.convention.KtlintConventionPlugin"
        }
        register("themeModule") {
            id = "com.infomaniak.designsystem.convention.theme"
            implementationClass = "com.infomaniak.designsystem.convention.ThemeModuleConventionPlugin"
        }
        register("publishing") {
            id = "com.infomaniak.designsystem.convention.publishing"
            implementationClass = "com.infomaniak.designsystem.convention.PublishingConventionPlugin"
        }
    }
}
