import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class ThemeModuleConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply("com.android.library")
            apply("com.infomaniak.designsystem.convention.android")
            apply("com.infomaniak.designsystem.convention.publishing")
        }

        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        dependencies {
            // Exposed as "api" because theme modules expose public vals of type EsdsTheme.Values
            // (defined in Foundation) directly as part of their public API.
            add("api", project(":Foundation"))
            add("implementation", project(":PrimitiveTokens"))

            add("implementation", libs.findLibrary("androidx-core-ktx").get())

            add("implementation", platform(libs.findLibrary("androidx-compose-bom").get()))
            add("implementation", libs.findLibrary("androidx-compose-material3").get())
            add("implementation", libs.findLibrary("androidx-compose-ui").get())
            add("implementation", libs.findLibrary("androidx-compose-ui-graphics").get())
        }
    }
}
