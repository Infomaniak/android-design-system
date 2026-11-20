package com.infomaniak.designsystem.catalog.icons

import com.infomaniak.designsystem.icons.symbols.Symbol

// Symbols are private objects, so their INSTANCE field has to be made accessible.
internal actual fun allSymbols(): List<Symbol> = Symbol::class.sealedSubclasses.map {
    it.java.getDeclaredField("INSTANCE").apply { isAccessible = true }.get(null) as Symbol
}
