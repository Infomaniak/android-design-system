plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("android") {
            id = "com.infomaniak.designsystem.convention.android"
            implementationClass = "AndroidPlugin"
        }
        register("themeModule") {
            id = "com.infomaniak.designsystem.convention.theme"
            implementationClass = "ThemeModuleConventionPlugin"
        }
    }
}
