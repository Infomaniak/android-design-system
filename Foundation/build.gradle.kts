plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.compose.compiler)
    id("com.infomaniak.designsystem.convention.kmplibrary")
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

//dependencies {
//    implementation(project(":PrimitiveTokens"))
//
//    implementation(libs.androidx.core.ktx)
//
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.compose.material3)
//    implementation(libs.androidx.compose.ui)
//    implementation(libs.androidx.compose.ui.graphics)
//    implementation(libs.androidx.compose.ui.tooling)
//    implementation(libs.androidx.compose.ui.tooling.preview)
//}
