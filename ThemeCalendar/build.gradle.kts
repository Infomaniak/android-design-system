plugins {
    id("com.infomaniak.designsystem.convention.theme")
}

kotlin {
    android {
        namespace = "com.infomaniak.designsystem.calendar"
    }
}

dependencies {
    androidRuntimeClasspath("org.jetbrains.compose.ui:ui-tooling:1.10.0")
}
