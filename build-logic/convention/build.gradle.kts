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
            implementationClass = "AndroidPlugin"
        }
        register("kmpLibrary") {
            id = "com.infomaniak.designsystem.convention.kmplibrary"
            implementationClass = "com.infomaniak.designsystem.convention.KmpLibraryConventionPlugin"
        }
        register("ktlint") {
            id = "com.infomaniak.designsystem.convention.ktlint"
            implementationClass = "KtlintConventionPlugin"
        }
        register("themeModule") {
            id = "com.infomaniak.designsystem.convention.theme"
            implementationClass = "com.infomaniak.designsystem.convention.ThemeModuleConventionPlugin"
        }
        register("publishing") {
            id = "com.infomaniak.designsystem.convention.publishing"
            implementationClass = "PublishingConventionPlugin"
        }
    }
}
