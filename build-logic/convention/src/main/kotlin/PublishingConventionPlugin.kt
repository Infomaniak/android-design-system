import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension

/**
 * Applied to every module that should be published to Maven Central (Foundation, PrimitiveTokens,
 * and each Theme* module). Configures the release AAR + sources jar publication, its POM metadata,
 * GPG signing, and registers the module with the nmcp aggregation at the root project.
 */
class PublishingConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply("maven-publish")
            apply("signing")
            apply("com.gradleup.nmcp")
        }

        group = "com.infomaniak.designsystem"
        version = getPropertyValue("designsystem.version") ?: "unspecified"

        extensions.configure<LibraryExtension> {
            publishing {
                singleVariant("release") {
                    withSourcesJar()
                }
            }
        }

        afterEvaluate {
            extensions.configure<PublishingExtension> {
                publications {
                    create<MavenPublication>("release") {
                        from(components["release"])

                        pom {
                            name.set(project.name)
                            description.set("Infomaniak Android Design System - ${project.name} module")
                            url.set("https://github.com/Infomaniak/android-design-system")
                            licenses {
                                license {
                                    name.set("GPL-3.0")
                                    url.set("https://www.gnu.org/licenses/gpl-3.0.html")
                                }
                            }
                            issueManagement {
                                system.set("Github")
                                url.set("https://github.com/Infomaniak/android-design-system/issues")
                            }
                            scm {
                                connection.set("https://github.com/Infomaniak/android-design-system.git")
                                url.set("https://github.com/Infomaniak/android-design-system")
                            }
                            organization {
                                name.set("Infomaniak Network SA")
                                url.set("https://www.infomaniak.com/")
                            }
                            developers {
                                developer {
                                    id.set("Infomaniak")
                                    email.set("mobile+libraries@infomaniak-dev.ch")
                                    name.set("Infomaniak Development Team")
                                    url.set("https://www.infomaniak.com/")
                                }
                            }
                        }
                    }
                }
            }

            extensions.configure<SigningExtension> {
                val keyId: String = getPropertyValue("GPG_key_id") ?: return@configure
                val ringFile: String = getPropertyValue("GPG_private_key")?.replace('#', '\n') ?: return@configure
                val password: String = getPropertyValue("GPG_private_password") ?: return@configure

                isRequired = true
                useInMemoryPgpKeys(keyId, ringFile, password)
                sign(extensions.getByType<PublishingExtension>().publications)

                // Workaround for a Gradle bug, the issue is still open.
                // https://github.com/gradle/gradle/issues/26091#issuecomment-1722947958
                tasks.withType<AbstractPublishToMaven>().configureEach {
                    val signingTasks = tasks.withType<Sign>()
                    mustRunAfter(signingTasks)
                }
            }
        }
    }

    private fun Project.getPropertyValue(propertyName: String): String? {
        if (project.hasProperty(propertyName)) return project.property(propertyName) as String
        return System.getenv(propertyName)
    }
}
