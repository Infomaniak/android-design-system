#!/usr/bin/env kotlin
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.File

/**
 * The repository root, resolved independently of the current working directory so the script can be
 * run from anywhere (e.g. the repo root or the /scripts folder). We walk up from the working
 * directory until we find the folder containing `settings.gradle.kts` (the project root marker).
 * Every output/input path below is anchored to this folder instead of the CWD.
 */
val repoRoot: File = generateSequence(File(System.getProperty("user.dir")).absoluteFile) { it.parentFile }
    .firstOrNull { File(it, "settings.gradle.kts").exists() }
    ?: error("Could not locate the repository root (no settings.gradle.kts found in any parent folder).")

/*
 * Parses the Figma color-tokens export and generates Material 3 ColorScheme
 * declarations as Kotlin source code.
 *
 * The export is made of three "collections":
 *   - Primitives : the raw, constant palettes (Red / Orange / Gray ...). Leaf values are hex colors.
 *   - Product    : the per-product "Accent" palette (Calendar, Infomaniak ...). Leaf values are hex colors.
 *                  Accent is the dynamic-palette hack, but it is just another constant palette here.
 *   - Theme      : the Material color roles (Primary, OnPrimary, Surface ...) for every theme mode
 *                  (Light, Dark, and their Medium/High Contrast variants). Each role is a *reference*
 *                  to a Primitive or a Product constant, e.g. {Accent.40} or {Gray.98}.
 *
 * Only the groups configured in `groupConfigs` are generated (currently "Schemes" and "Extended Colors").
 * Other Theme groups (State Layers, Surfaces, Add-ons, …) are ignored.
 *
 * For every reference the script emits an intermediate `val` so the chain
 *   role -> constant (-> deeper constant)
 * stays visible in the output, and those `val`s are emitted in dependency order.
 */

// ---------------------------------------------------------------------------
// Configuration
// ---------------------------------------------------------------------------

/**
 * Material role names to leave out of a generated group. Some roles exist in Figma but not in the
 * Material builder functions (e.g. "Shadow" is not a parameter of lightColorScheme/darkColorScheme),
 * so they must be excluded. Add more names here if other roles ever need to be filtered out.
 */
val excludedRoles = setOf("Shadow")

data class ThemeMode(val jsonName: String, val suffix: String, val builder: String)

/** Theme modes, in output order, mapped to (kotlin name suffix, Material builder function). */
val themeModes = listOf(
    ThemeMode(jsonName = "Light", suffix = "Light", builder = "lightColorScheme"),
    ThemeMode(jsonName = "Light Medium Contrast", suffix = "LightMediumContrast", builder = "lightColorScheme"),
    ThemeMode(jsonName = "Light High Contrast", suffix = "LightHighContrast", builder = "lightColorScheme"),
    ThemeMode(jsonName = "Dark", suffix = "Dark", builder = "darkColorScheme"),
    ThemeMode(jsonName = "Dark Medium Contrast", suffix = "DarkMediumContrast", builder = "darkColorScheme"),
    ThemeMode(jsonName = "Dark High Contrast", suffix = "DarkHighContrast", builder = "darkColorScheme"),
)

/**
 * How a token group is materialised in Kotlin:
 *  - [Framework] reuses a type that already exists in the framework (e.g. Material's ColorScheme,
 *    built with lightColorScheme/darkColorScheme). No type definition is generated.
 *  - [GeneratedDataClass] generates its own `data class` definition (in its own module/path) and the
 *    instances are built by calling that data class' constructor.
 */
sealed interface GroupKind {
    /** Constructor/builder used to build one instance of [mode]. */
    fun constructorFor(mode: ThemeMode): String

    /** Imports the instance file needs to build an instance of [mode]. */
    fun importsFor(mode: ThemeMode): List<String>

    class Framework(val builderForMode: (ThemeMode) -> String) : GroupKind {
        override fun constructorFor(mode: ThemeMode) = builderForMode(mode)
        override fun importsFor(mode: ThemeMode) = listOf("androidx.compose.material3.${builderForMode(mode)}")
    }

    class GeneratedDataClass(val name: String, val packageName: String, val outputDir: File) : GroupKind {
        override fun constructorFor(mode: ThemeMode) = name
        override fun importsFor(mode: ThemeMode) = listOf("$packageName.$name")
    }
}

/**
 * A group of theme tokens to generate. Each group produces, per product and per theme mode, one
 * independent `internal val` instance file.
 *
 * - jsonGroupName  : the group name inside each Theme mode ("Schemes", "Extended Colors", ...).
 * - instanceSuffix : suffix of the generated val/file name, e.g. "ColorScheme" -> CalendarLightColorScheme.
 * - subPackage     : sub-folder/sub-package appended to each product's location so a group's instances
 *                    get their own path, e.g. "material" -> generated/calendar/material + ....calendar.material.
 *                    Use "" to keep the instances directly in the product's own folder/package.
 * - excluded       : role names to skip for this group.
 * - kind           : how instances are built (framework type vs generated data class).
 */
data class GroupConfig(
    val jsonGroupName: String,
    val instanceSuffix: String,
    val excluded: Set<String>,
    val kind: GroupKind,
    val subPackage: String? = null,
)

val groupConfigs = listOf(
    GroupConfig(
        jsonGroupName = "Schemes",
        instanceSuffix = "ColorScheme",
        subPackage = "material",
        excluded = excludedRoles,
        kind = GroupKind.Framework(builderForMode = { it.builder }),
    ),
    GroupConfig(
        jsonGroupName = "Extended Colors",
        instanceSuffix = "ExtendedColors",
        subPackage = "extended",
        excluded = emptySet(),
        kind = GroupKind.GeneratedDataClass(
            name = "ExtendedColors",
            packageName = "com.infomaniak.designsystem.core.tokens",
            outputDir = repoRoot.resolve("Foundation/src/main/kotlin/com/infomaniak/designsystem/core/tokens"),
        ),
    ),
)

/**
 * The shared color-primitives module. All products' constants (the shared Gray/Red/Orange ramps and
 * every product's prefixed Accent ramp) are emitted once here so theme modules can reference them
 * instead of duplicating colors.
 *
 * - objectName  : name of the generated palette object.
 * - packageName : the Kotlin package of the generated palette file.
 * - outputDir   : the folder where the palette file is written (created if missing).
 */
data class SharedPaletteConfig(val objectName: String, val packageName: String, val outputDir: File)

val sharedPalette = SharedPaletteConfig(
    objectName = "ColorPrimitives",
    packageName = "com.infomaniak.designsystem.primitivetokens",
    outputDir = repoRoot.resolve("PrimitiveTokens/src/main/kotlin/com/infomaniak/designsystem/primitivetokens"),
)

/**
 * One entry per "theme module" to generate. Each product gets its own output folder containing one
 * independent instance file per group and per theme mode, all referencing the shared [sharedPalette]
 * object.
 *
 * - product     : the Product mode name as written in the JSON ("Calendar", "Infomaniak", ...).
 * - packageName : the Kotlin package shared by every instance file generated for this product.
 * - outputDir   : the folder where the instance files are written (created if missing).
 *
 * Add another entry (e.g. for "Infomaniak") to generate its module too.
 */
data class ProductConfig(val product: String, val packageName: String, val outputDir: File)

val productConfigs = listOf(
    ProductConfig(
        product = "Calendar",
        packageName = "com.infomaniak.designsystem.calendar",
        outputDir = repoRoot.resolve("ThemeCalendar/src/main/kotlin/com/infomaniak/designsystem/calendar"),
    ),
)

// ---------------------------------------------------------------------------
// Input
// ---------------------------------------------------------------------------

val tokenSourceDir = repoRoot.resolve("token-source")
val inputFile = File(tokenSourceDir, "android_specific_tokens.json")
    .takeIf { it.exists() }
    ?: error("Could not find android_specific_tokens.json in ${tokenSourceDir.path}.")

val root = Json.parseToJsonElement(inputFile.readText()).jsonArray

/** Collections are an array of single-key objects: [{Primitives:..}, {Product:..}, {Theme:..}]. */
val collections: Map<String, JsonObject> = root.associate { element ->
    val obj = element.jsonObject
    val name = obj.keys.first()
    name to obj.getValue(name).jsonObject.getValue("modes").jsonObject
}

val primitivesGroups = collections.getValue("Primitives").getValue("Value").jsonObject
val productModes = collections.getValue("Product")
val themeModesJson = collections.getValue("Theme")

// ---------------------------------------------------------------------------
// Model
// ---------------------------------------------------------------------------

/** A constant `val` to emit, e.g. `Gray98 = Color(0xFFFFF8F7)` or `Accent50 = Red50`. */
class ConstantVal(val name: String, val rhs: String, val deps: List<String>)

/**
 * Resolves token references into a single shared palette so the color primitives can live in one
 * module reused by every product. Primitive constants keep their plain name (e.g. `Gray98`) while
 * product-specific accents are prefixed with the product (e.g. `CalendarAccent50`). Every reached
 * constant is registered once (recursively) so chains stay visible and can be emitted in dependency order.
 */
class ConstantRegistry {

    private val constants = LinkedHashMap<String, ConstantVal>()

    /**
     * Resolves a `{Group.Key}` reference to the name of the `val` that holds its color.
     * [product] is the product whose Accent palette is used for `Product`-collection references.
     */
    fun resolveReference(collectionName: String, reference: String, product: String): String {
        val path = reference.trim().removePrefix("{").removeSuffix("}").split(".")
        return register(collectionName, path, product)
    }

    /** Product-specific constants are prefixed; shared primitives are not. */
    private fun nameFor(collectionName: String, path: List<String>, product: String): String {
        val body = path.joinToString("") { sanitize(it) }
        return if (collectionName == "Product") "${sanitize(product)}$body" else body
    }

    private fun register(collectionName: String, path: List<String>, product: String): String {
        val varName = nameFor(collectionName, path, product)
        if (varName in constants) return varName

        val node = lookup(collectionName, path, product)
        val value = node.getValue("\$value").jsonPrimitive.content

        val constant = if (value.startsWith("{")) {
            // The constant is itself a reference: emit `val A = B` and make sure B exists first.
            val targetCollection = node["\$collectionName"]?.jsonPrimitive?.content ?: collectionName
            val depName = resolveReference(targetCollection, value, product)
            ConstantVal(varName, depName, listOf(depName))
        } else {
            ConstantVal(varName, colorLiteral(value), emptyList())
        }
        constants[varName] = constant
        return varName
    }

    private fun lookup(collectionName: String, path: List<String>, product: String): JsonObject {
        val base = when (collectionName) {
            "Primitives" -> primitivesGroups
            "Product" -> productModes.getValue(product).jsonObject
            else -> error("Unsupported collection referenced: $collectionName")
        }
        var current: JsonObject = base
        for (segment in path) {
            current = current.getValue(segment).jsonObject
        }
        return current
    }

    /** Constants ordered so every `val` is declared before anything that references it. */
    fun orderedConstants(): List<ConstantVal> {
        val ordered = LinkedHashMap<String, ConstantVal>()
        fun visit(name: String) {
            if (name in ordered) return
            val constant = constants.getValue(name)
            constant.deps.forEach { visit(it) }
            ordered[name] = constant
        }
        constants.keys.forEach { visit(it) }
        return ordered.values.toList()
    }
}

// ---------------------------------------------------------------------------
// Helpers
// ---------------------------------------------------------------------------

/** "#e72143" -> "Color(0xFFE72143)". Only opaque 6-digit hex is used by the Material roles. */
fun colorLiteral(hex: String): String {
    val clean = hex.removePrefix("#").uppercase()
    require(clean.length == 6) { "Unexpected color format: $hex" }
    return "Color(0xFF$clean)"
}

/** Keeps only identifier-safe characters: "Surface Container" -> "SurfaceContainer". */
fun sanitize(raw: String): String =
    raw.split(" ", "-", "/").filter { it.isNotEmpty() }.joinToString("") {
        it.replaceFirstChar { c -> c.uppercaseChar() }
    }

/** Material role name from Figma: "On Primary" -> "onPrimary", "Surface Container Highest" -> "surfaceContainerHighest". */
fun roleParameterName(jsonName: String): String {
    val pascal = sanitize(jsonName)
    return pascal.replaceFirstChar { it.lowercaseChar() }
}

/**
 * Flattens a nested role path into a single camelCase parameter name:
 * ["Feedback", "Important", "Warning"] -> "feedbackImportantWarning".
 */
fun flattenedParameterName(path: List<String>): String {
    val pascal = path.joinToString("") { sanitize(it) }
    return pascal.replaceFirstChar { it.lowercaseChar() }
}

// ---------------------------------------------------------------------------
// Generation
// ---------------------------------------------------------------------------

class GeneratedFile(val name: String, val content: String)

fun header(packageName: String) = buildString {
    appendLine("/*")
    appendLine("  Do not edit directly, this file was auto-generated.")
    appendLine("  Source: ${inputFile.name}")
    appendLine("*/")
    appendLine()
    appendLine("package $packageName")
    appendLine()
}

/** A single resolved token: the role's kotlin parameter/field name and the palette constant it maps to. */
class ResolvedRole(val parameter: String, val constantName: String)

/**
 * Resolves one group of one product, for every theme mode, into the shared [registry].
 * Returns mode -> list of resolved roles.
 *
 * Roles can be nested under arbitrary subgroups (e.g. "Feedback" > "Warning" > "Warning"). The
 * resolver recurses into every non-leaf object and flattens the path of names into a single
 * camelCase parameter, so `Feedback > Important > Warning` becomes `feedbackImportantWarning`.
 * A leaf is identified as an object containing a `$value` entry. The exclusion set is matched
 * against any segment of the path so a whole subgroup can be skipped by name too.
 */
fun resolveGroup(
    registry: ConstantRegistry,
    product: String,
    group: GroupConfig,
): Map<ThemeMode, List<ResolvedRole>> = themeModes.associateWith { mode ->
    val root = themeModesJson.getValue(mode.jsonName).jsonObject.getValue(group.jsonGroupName).jsonObject
    val resolved = mutableListOf<ResolvedRole>()
    fun walk(node: JsonObject, path: List<String>) {
        if ("\$value" in node) {
            val collectionName = node.getValue("\$collectionName").jsonPrimitive.content
            val reference = node.getValue("\$value").jsonPrimitive.content
            resolved += ResolvedRole(
                parameter = flattenedParameterName(path),
                constantName = registry.resolveReference(collectionName, reference, product),
            )
            return
        }
        node.entries.forEach { (childName, child) ->
            if (childName in group.excluded) return@forEach
            walk(child.jsonObject, path + childName)
        }
    }
    walk(root, emptyList())
    resolved
}

/** The shared palette file holding every constant used by any configured product/group. */
fun generateSharedPaletteFile(registry: ConstantRegistry): GeneratedFile = GeneratedFile(
    name = "${sharedPalette.objectName}.kt",
    content = buildString {
        append(header(sharedPalette.packageName))
        appendLine("import androidx.compose.ui.graphics.Color")
        appendLine()
        appendLine("object ${sharedPalette.objectName} {")
        registry.orderedConstants().forEach { constant ->
            appendLine("    val ${constant.name} = ${constant.rhs}")
        }
        appendLine("}")
    },
)

/** The `data class` definition for a generated-data-class group (Color-typed field per role). */
fun generateDataClassFile(kind: GroupKind.GeneratedDataClass, fields: List<String>): GeneratedFile = GeneratedFile(
    name = "${kind.name}.kt",
    content = buildString {
        append(header(kind.packageName))
        appendLine("import androidx.compose.runtime.Immutable")
        appendLine("import androidx.compose.ui.graphics.Color")
        appendLine()
        appendLine("@Immutable")
        appendLine("data class ${kind.name}(")
        fields.forEach { field -> appendLine("    val $field: Color,") }
        appendLine(")")
    },
)

/** Appends a sub-package segment to a package/dir, ignoring blank segments. */
fun subPackageOf(packageName: String, segment: String?): String =
    if (segment.isNullOrBlank()) packageName else "$packageName.$segment"

fun subDirOf(dir: File, segment: String?): File = if (segment.isNullOrBlank()) dir else File(dir, segment)

/** One independent `internal val` instance file per theme mode for one product/group. */
fun generateInstanceFiles(
    config: ProductConfig,
    group: GroupConfig,
    resolvedByMode: Map<ThemeMode, List<ResolvedRole>>,
): List<GeneratedFile> = themeModes.map { mode ->
    val instanceName = "${config.product}${mode.suffix}${group.instanceSuffix}"
    val constructor = group.kind.constructorFor(mode)
    GeneratedFile(
        name = "$instanceName.kt",
        content = buildString {
            append(header(subPackageOf(config.packageName, group.subPackage)))
            (group.kind.importsFor(mode) + "${sharedPalette.packageName}.${sharedPalette.objectName}")
                .sorted()
                .forEach { appendLine("import $it") }
            appendLine()
            appendLine("internal val $instanceName = $constructor(")
            resolvedByMode.getValue(mode).forEach { role ->
                appendLine("    ${role.parameter} = ${sharedPalette.objectName}.${role.constantName},")
            }
            appendLine(")")
        },
    )
}

// ---------------------------------------------------------------------------
// Output
// ---------------------------------------------------------------------------

fun writeFile(dir: File, file: GeneratedFile) {
    dir.mkdirs()
    val target = File(dir, file.name)
    target.writeText(file.content)
    println("Generated ${target.path}")
}

val registry = ConstantRegistry()

// Resolve every product x group up-front so the shared palette captures all referenced constants.
val resolved: Map<String, Map<GroupConfig, Map<ThemeMode, List<ResolvedRole>>>> =
    productConfigs.associate { config ->
        config.product to groupConfigs.associateWith { group -> resolveGroup(registry, config.product, group) }
    }

// 1. Shared color-primitives module.
writeFile(sharedPalette.outputDir, generateSharedPaletteFile(registry))

// 2. One data class definition per generated-data-class group (fields taken from the first mode).
groupConfigs.forEach { group ->
    val kind = group.kind
    if (kind is GroupKind.GeneratedDataClass) {
        val fields = resolved.values.first().getValue(group).getValue(themeModes.first()).map { it.parameter }
        writeFile(kind.outputDir, generateDataClassFile(kind, fields))
    }
}

// 3. Per product, per group: the independent instance files, each in the group's own sub-folder.
productConfigs.forEach { config ->
    groupConfigs.forEach { group ->
        val dir = subDirOf(config.outputDir, group.subPackage)
        generateInstanceFiles(config, group, resolved.getValue(config.product).getValue(group)).forEach { file ->
            writeFile(dir, file)
        }
    }
}
