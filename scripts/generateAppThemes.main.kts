#!/usr/bin/env kotlin
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File

/**
 * The repository root, resolved independently of the current working directory so the script can be
 * run from anywhere (e.g. the repo root or the /scripts folder). We walk up from the working
 * directory until we find the folder containing `settings.gradle.kts` (the project root marker).
 */
val repoRoot: File = generateSequence(File(System.getProperty("user.dir")).absoluteFile) { it.parentFile }
    .firstOrNull { File(it, "settings.gradle.kts").exists() }
    ?: error("Could not locate the repository root (no settings.gradle.kts found in any parent folder).")

/*
 * Reads `token-source/app_themes.json` and generates one `{ThemeName}Theme.kt` file per theme.
 *
 * Each file contains one `internal val {ThemeName}{Dimension}Theme = EsdsTheme.Values(…)` per
 * dimension. Dimensions are resolved in priority order:
 *   1. Theme-specific `dimensions` list (if present)
 *   2. `default.dimensions` list (fallback for all themes without their own)
 *
 * Token types are always the fixed set matching EsdsTheme.Values parameters:
 *   icon, spacing, radius, materialColorScheme
 *
 * The file is placed alongside the other token files:
 *   Theme{ThemeName}/src/main/kotlin/com/infomaniak/designsystem/{themeName.lowercase()}/{ThemeName}Theme.kt
 */

// ---------------------------------------------------------------------------
// Token type → parameter name + val suffix mapping
// ---------------------------------------------------------------------------

data class TokenTypeMapping(
    /** Parameter name in EsdsTheme.Values constructor. */
    val paramName: String,
    /**
     * Suffix appended to `{ThemeName}{Dimension}` to form the val reference.
     * e.g. "BorderTokens" → CalendarLightBorderTokens
     */
    val valSuffix: String,
    /**
     * Sub-package relative to the theme package where this val lives, or null if it
     * lives in the theme package itself.
     */
    val subPackage: String? = null,
)

/** Fixed token types matching EsdsTheme.Values parameters — identical for every theme. */
val tokenTypeMappings: LinkedHashMap<String, TokenTypeMapping> = linkedMapOf(
    "icon"                to TokenTypeMapping("icon",                "IconTokens"),
    "spacing"             to TokenTypeMapping("spacing",             "SpacingTokens"),
    "radius"              to TokenTypeMapping("radius",              "RadiusTokens"),
    "materialColorScheme" to TokenTypeMapping("materialColorScheme", "ColorScheme",  subPackage = "material"),
)

// ---------------------------------------------------------------------------
// Helpers
// ---------------------------------------------------------------------------

val json = Json { ignoreUnknownKeys = true }

fun packageNameFor(themeName: String) =
    "com.infomaniak.designsystem.${themeName.lowercase()}"

fun outputDirFor(themeName: String): File =
    repoRoot.resolve(
        "Theme$themeName/src/main/kotlin/com/infomaniak/designsystem/${themeName.lowercase()}"
    )

fun header(packageName: String) = buildString {
    appendLine("/*")
    appendLine("  Do not edit directly, this file was auto-generated.")
    appendLine("*/")
    appendLine()
    appendLine("package $packageName")
}

/**
 * Returns the base dimension for contrast variants, or null if the dimension is already a base.
 * e.g. "LightMediumContrast" → "Light", "DarkHighContrast" → "Dark", "Light" → null
 */
fun baseDimensionOf(dimension: String): String? {
    val base = dimension.removeSuffix("MediumContrast").removeSuffix("HighContrast")
    return if (base != dimension) base else null
}

/**
 * Returns the token file for a given theme, dimension, and mapping (null subPackage = theme dir,
 * non-null subPackage = sub-directory inside the theme dir).
 */
fun tokenFileFor(outputDir: File, themeName: String, dimension: String, mapping: TokenTypeMapping): File {
    val dir = if (mapping.subPackage != null) File(outputDir, mapping.subPackage) else outputDir
    return File(dir, "$themeName$dimension${mapping.valSuffix}.kt")
}

/**
 * Resolves the val reference to use for a given dimension + tokenType.
 * Falls back to the base dimension val if the token file for [dimension] does not exist.
 */
fun resolveValRef(
    outputDir: File,
    themeName: String,
    dimension: String,
    mapping: TokenTypeMapping,
): String {
    val file = tokenFileFor(outputDir, themeName, dimension, mapping)
    if (file.exists()) return "$themeName$dimension${mapping.valSuffix}"

    val base = baseDimensionOf(dimension)
        ?: return "$themeName$dimension${mapping.valSuffix}" // base dimension, no fallback
    return "$themeName$base${mapping.valSuffix}"
}

// ---------------------------------------------------------------------------
// Code generation
// ---------------------------------------------------------------------------

fun generateThemeFile(
    themeName: String,
    dimensions: List<String>,
    outputDir: File,
): String {
    val packageName = packageNameFor(themeName)

    // Collect needed imports (EsdsTheme + sub-package vals, resolved with fallback)
    val imports = buildList {
        add("com.infomaniak.designsystem.core.theme.EsdsTheme")
        tokenTypeMappings.values.filter { it.subPackage != null }.forEach { mapping ->
            dimensions.forEach { dim ->
                val valRef = resolveValRef(outputDir, themeName, dim, mapping)
                add("$packageName.${mapping.subPackage}.$valRef")
            }
        }
    }.distinct().sorted()

    return buildString {
        append(header(packageName))
        appendLine()
        imports.forEach { appendLine("import $it") }
        appendLine()

        dimensions.forEach { dimension ->
            appendLine("val $themeName${dimension}Theme = EsdsTheme.Values(")
            tokenTypeMappings.forEach { (_, mapping) ->
                val valRef = resolveValRef(outputDir, themeName, dimension, mapping)
                appendLine("    ${mapping.paramName} = $valRef,")
            }
            appendLine(")")
            appendLine()
        }
    }.trimEnd() + "\n"
}

fun writeFile(dir: File, fileName: String, content: String) {
    dir.mkdirs()
    val file = File(dir, fileName)
    file.writeText(content)
    println("Written: ${file.relativeTo(repoRoot)}")
}

fun updateSettingsGradle(enabledThemes: List<String>) {
    val settingsFile = repoRoot.resolve("settings.gradle.kts")
    val lines = settingsFile.readLines()

    // Replace all include(":Theme*") lines with the current enabled set
    val themeIncludeRegex = Regex("""^include\(":Theme\w+"\)$""")
    val newIncludes = enabledThemes.map { """include(":Theme$it")""" }

    val updatedLines = mutableListOf<String>()
    var alreadyInserted = false

    for (line in lines) {
        if (themeIncludeRegex.matches(line.trim())) {
            // Replace the first match with all new includes, skip subsequent matches
            if (!alreadyInserted) {
                updatedLines.addAll(newIncludes)
                alreadyInserted = true
            }
        } else {
            updatedLines.add(line)
        }
    }

    // If no existing Theme include was found, append at the end
    if (!alreadyInserted) {
        updatedLines.addAll(newIncludes)
    }

    settingsFile.writeText(updatedLines.joinToString("\n") + "\n")
    println("Updated: settings.gradle.kts — enabled themes: ${enabledThemes.joinToString()}")
}

// ---------------------------------------------------------------------------
// Main
// ---------------------------------------------------------------------------

val appThemesJson = repoRoot.resolve("token-source/app_themes.json")
    .also { check(it.exists()) { "token-source/app_themes.json not found at ${it.absolutePath}" } }

val root = json.parseToJsonElement(appThemesJson.readText()).jsonObject
val default = root["default"]?.jsonObject
    ?: error("Missing 'default' array in app_themes.json")
val defaultDimensions = default["dimensions"]!!.jsonArray.map { it.jsonPrimitive.content }

val themes = root["themes"]?.jsonArray
    ?: error("Missing 'themes' array in app_themes.json")

val enabledThemes = mutableListOf<String>()

themes.forEach { themeElement ->
    val themeObj = themeElement.jsonObject

    val themeName  = themeObj["name"]!!.jsonPrimitive.content
    val enabled    = themeObj["enabled"]?.jsonPrimitive?.content?.toBoolean() ?: true
    val dimensions = themeObj["dimensions"]?.jsonArray?.map { it.jsonPrimitive.content } ?: defaultDimensions

    if (enabled) {
        enabledThemes.add(themeName)
        val outputDir = outputDirFor(themeName)
        val content = generateThemeFile(themeName, dimensions, outputDir)
        writeFile(outputDir, "${themeName}Theme.kt", content)
    } else {
        println("Skipped (disabled): $themeName")
    }
}

updateSettingsGradle(enabledThemes)

println("Done — generated ${enabledThemes.size}/${themes.size} theme file(s).")
