import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class AndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.withPlugin("com.android.library") { configureAndroid() }
        pluginManager.withPlugin("com.android.application") { configureAndroid() }
    }

    private fun Project.configureAndroid() {
        extensions.configure<CommonExtension> {
            compileSdk {
                version = release(36)
            }
            defaultConfig.apply {
                minSdk = 27
            }
            compileOptions.apply {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }

        pluginManager.apply("org.jlleitschuh.gradle.ktlint")
        extensions.configure<KtlintExtension> {
            version.set("1.8.0")
        }
    }
}
