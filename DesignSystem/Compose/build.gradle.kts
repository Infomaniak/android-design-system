plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.infomaniak.designsystem.compose"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        minSdk = 27
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}
