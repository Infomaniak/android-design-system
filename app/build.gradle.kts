plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.infomaniak.generateddstokens"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.infomaniak.generateddstokens"
        minSdk = 27
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(project(":Core"))
    implementation(project(":PrimitiveTokens"))
    implementation(project(":ThemeDrive"))
    implementation(project(":ThemeMail"))

    implementation(libs.androidx.core.ktx)
}
