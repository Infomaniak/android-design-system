plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    id("com.infomaniak.designsystem.convention.compose.multiplatform.library")
    id("com.infomaniak.designsystem.convention.publishing")
}

kotlin {
    android {
        namespace = "com.infomaniak.designsystem.primitivetokens"
    }
}
