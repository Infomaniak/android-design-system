// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.nmcp.aggregation)
}

// Aggregates every publishable module (Foundation, PrimitiveTokens, and any Theme* module) into a
// single Maven Central deployment. Modules that don't apply the publishing convention plugin
// (com.gradleup.nmcp) are silently ignored by nmcpAggregation, so new Theme* modules are picked up
// automatically as soon as they apply "com.infomaniak.designsystem.convention.theme" — no need to
// edit this file when a new theme is added.
nmcpAggregation {
    centralPortal {
        username = getPropertyValue("ossrhUsername")
        password = getPropertyValue("ossrhPassword")
        publishingType = "AUTOMATIC"
    }
}

dependencies {
    subprojects.forEach { subproject ->
        nmcpAggregation(project(subproject.path))
    }
}

// Prints "groupId:artifactId:version" for every module actually published to Maven Central (i.e.
// every module applying the publishing convention plugin), one per line. Used by the snapshot and
// release workflows to build the KChat notification without having to hardcode the module list.
tasks.register("listPublishedModules") {
    doLast {
        subprojects
            .filter { it.pluginManager.hasPlugin("com.gradleup.nmcp") }
            .sortedBy { it.name }
            .forEach { println("${it.group}:${it.name}:${it.version}") }
    }
}

fun getPropertyValue(propertyName: String): String? {
    if (project.hasProperty(propertyName)) return project.property(propertyName) as String
    return System.getenv(propertyName)
}
