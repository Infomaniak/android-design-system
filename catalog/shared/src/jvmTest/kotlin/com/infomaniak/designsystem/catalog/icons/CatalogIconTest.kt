package com.infomaniak.designsystem.catalog.icons

import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.Trash
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class CatalogIconTest {
    @Test
    fun allIconsAreFoundByReflection() {
        assertTrue(AllIcons.size > 100)
        assertEquals(AllIcons.size, AllIcons.map { it.name }.toSet().size)
        assertSame(EsdsIcons.Trash, findIcon("Trash")?.symbol)
    }
}
