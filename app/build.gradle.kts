plugins {
    alias(libs.plugins.android.application)
    id("com.infomaniak.designsystem.convention.android")
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.infomaniak.generateddstokens"

    defaultConfig {
        applicationId = "com.infomaniak.generateddstokens"
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":Foundation"))

    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.core.ktx)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.tooling.preview)
}
