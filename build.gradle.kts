// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// Prints "groupId:artifactId:version" for every module actually published to Reposilite (i.e.
// every module applying the publishing convention plugin), one per line. Used by the snapshot and
// release workflows to build the KChat notification without having to hardcode the module list.
tasks.register("listPublishedModules") {
    doLast {
        subprojects
            .filter { it.pluginManager.hasPlugin("com.infomaniak.designsystem.convention.publishing") }
            .sortedBy { it.name }
            .forEach { println("${it.group}:${it.name}:${it.version}") }
    }
}
