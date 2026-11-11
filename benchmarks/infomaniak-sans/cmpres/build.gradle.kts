plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kmp.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    android {
        namespace = "bench.cmpres"
        compileSdk = 37
        minSdk = 27
        androidResources { enable = true }
    }
    sourceSets {
        commonMain.dependencies {
            api(libs.cmp.runtime)
            api(libs.cmp.ui)
            api(libs.cmp.components.resources)
        }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "bench.cmpres.generated"
}
