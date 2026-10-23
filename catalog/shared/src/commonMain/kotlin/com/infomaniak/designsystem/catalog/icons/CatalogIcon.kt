package com.infomaniak.designsystem.catalog.icons

import com.infomaniak.designsystem.icons.symbols.Symbol

/** [name] is the name of the `EsdsIcons` property, e.g. `Bell` for `EsdsIcons.Bell`. */
internal class CatalogIcon(val name: String, val symbol: Symbol) {
    val sharedElementKey: String get() = "icon-$name"
}

/** Every icon of the design system, sorted by name. */
internal val AllIcons: List<CatalogIcon> by lazy {
    // Generated symbols are named `<IconName>Symbol`.
    allSymbols().map { CatalogIcon(it::class.simpleName!!.removeSuffix("Symbol"), it) }.sortedBy { it.name }
}

internal fun findIcon(name: String): CatalogIcon? = AllIcons.firstOrNull { it.name == name }

/** Every implementation of the sealed [Symbol] interface, found by reflection. */
internal expect fun allSymbols(): List<Symbol>
