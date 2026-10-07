#!/usr/bin/env kotlin
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

import java.io.File
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

val repoRoot: File = generateSequence(File(System.getProperty("user.dir")).absoluteFile) { it.parentFile }
    .firstOrNull { File(it, "settings.gradle.kts").exists() }
    ?: error("Could not locate the repository root (no settings.gradle.kts found in any parent folder).")

val versions = Json.parseToJsonElement(repoRoot.resolve("package-versions.json").readText()).jsonObject
val lines = versions.mapNotNull { (packageName, version) ->
    version.jsonPrimitive.contentOrNull
        ?.takeIf { it.isNotEmpty() }
        ?.let { "`$packageName`: $it" }
}

if (lines.isNotEmpty()) {
    println("### Versions\n\n" + lines.joinToString("\n\n"))
}
