plugins {
    alias(libs.plugins.android.library)
    id("com.infomaniak.designsystem.convention.android")
}

android {
    namespace = "com.infomaniak.designsystem.primitivetokens"
}

dependencies {
    implementation(libs.androidx.core.ktx)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.tooling.preview)
}
