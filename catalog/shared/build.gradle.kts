plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    id("com.infomaniak.designsystem.convention.android")
    id("com.infomaniak.designsystem.convention.compose.multiplatform.library")
}

kotlin {
    android {
        namespace = "com.infomaniak.designsystem.catalog.shared"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":Foundation"))

            implementation(libs.compose.multiplatform.ui.tooling.preview)
        }
    }
}

dependencies {
    androidRuntimeClasspath(libs.compose.multiplatform.ui.tooling)
}
