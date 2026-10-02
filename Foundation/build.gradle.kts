plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.compose.compiler)
    id("com.infomaniak.designsystem.convention.multiplatform.library")
    id("com.infomaniak.designsystem.convention.publishing")
}

kotlin {
    android {
        namespace = "com.infomaniak.designsystem.core"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":PrimitiveTokens"))
        }
    }
}
