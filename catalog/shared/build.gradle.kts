plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.kotlin.serialization)
    id("com.infomaniak.designsystem.convention.android")
    id("com.infomaniak.designsystem.convention.compose.multiplatform.library")
    id("com.infomaniak.designsystem.convention.compose.multiplatform.preview")
}

kotlin {
    android {
        namespace = "com.infomaniak.designsystem.catalog.shared"
        // Required by the catalog's newer material3 (see catalogAndroidxMaterial3).
        compileSdk {
            version = release(37) { minorApiLevel = 2 }
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":Foundation"))
            implementation(project(":Icons"))

            implementation(libs.kotlinx.serialization.core)
            implementation(libs.navigation3.ui)

            // Expressive material3 APIs (e.g. SegmentedListItem), only used by the catalog.
            implementation(libs.catalog.compose.multiplatform.material3)
        }
        // Used to list every icon from the sealed `Symbol` interface.
        androidMain.dependencies {
            implementation(libs.catalog.androidx.compose.material3)
            implementation(libs.kotlin.reflect)
        }
        jvmMain.dependencies {
            implementation(libs.kotlin.reflect)
        }
        jvmTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
