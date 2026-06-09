plugins {
    `kotlin-dsl`
}

group = "com.infomaniak.designsystem.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
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
