import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

compose.desktop {
    application {
        mainClass = "com.infomaniak.designsystem.catalog.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.infomaniak.designsystem.catalog"
            packageVersion = "1.0.0"
        }
    }
}

dependencies {
    implementation(project(":catalog:shared"))

    implementation(compose.desktop.currentOs)
    implementation(libs.compose.multiplatform.ui.tooling.preview)
}
