pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "font-bench"
include(":cmpres", ":app", ":microbench", ":macro")

// Fonts are not committed: download them first with scripts/fetch_fonts.sh
listOf(
    "app/src/main/res/font/infomaniak_sans.ttf",
    "microbench/src/main/res/font/infomaniak_sans.ttf",
    "cmpres/src/commonMain/composeResources/font/infomaniak_sans.ttf",
).filterNot { file(it).exists() }.takeIf { it.isNotEmpty() }?.let { missing ->
    throw GradleException("Missing fonts $missing. Run ./scripts/fetch_fonts.sh first.")
}
