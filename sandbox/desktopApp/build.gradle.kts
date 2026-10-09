import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

compose.desktop {
    application {
        mainClass = "com.infomaniak.designsystem.sandbox.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.infomaniak.designsystem.sandbox"
            packageVersion = "1.0.0"
        }
    }
}

dependencies {
    implementation(project(":sandbox:shared"))

    implementation(compose.desktop.currentOs)
    implementation(libs.compose.multiplatform.ui.tooling.preview)
}
