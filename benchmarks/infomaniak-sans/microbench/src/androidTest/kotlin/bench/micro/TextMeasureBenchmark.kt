package bench.micro

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.sp
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class TextMeasureBenchmark(private val familyName: String) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "font={0}")
        fun params() = listOf("default", "res", "cmpAsset")
    }

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val context = InstrumentationRegistry.getInstrumentation().targetContext
    private lateinit var measurer: TextMeasurer
    private lateinit var family: FontFamily
    private val constraints = Constraints(maxWidth = 1000)

    @Before
    fun setup() {
        family = family(familyName, context)
        measurer = TextMeasurer(
            defaultFontFamilyResolver = createFontFamilyResolver(context),
            defaultDensity = Density(context),
            defaultLayoutDirection = LayoutDirection.Ltr,
            cacheSize = 0,
        )
        // Warm typeface caches once so we measure layout, not first font load.
        WEIGHTS.forEach { measurer.measure(SHORT_TEXT, TextStyle(fontFamily = family, fontWeight = FontWeight(it))) }
    }

    @Test
    fun measureShort_w500() {
        val style = TextStyle(fontFamily = family, fontWeight = FontWeight.Medium, fontSize = 16.sp)
        benchmarkRule.measureRepeated {
            val r = measurer.measure(SHORT_TEXT, style, constraints = constraints)
            assertTrue(r.size.width > 0)
        }
    }

    @Test
    fun measureLong_w400() {
        val style = TextStyle(fontFamily = family, fontWeight = FontWeight.Normal, fontSize = 14.sp, lineHeight = 20.sp)
        benchmarkRule.measureRepeated {
            val r = measurer.measure(LONG_TEXT, style, constraints = constraints)
            assertTrue(r.lineCount > 1)
        }
    }

    @Test
    fun measureLong_w700() {
        val style = TextStyle(fontFamily = family, fontWeight = FontWeight.Bold, fontSize = 14.sp, lineHeight = 20.sp)
        benchmarkRule.measureRepeated {
            val r = measurer.measure(LONG_TEXT, style, constraints = constraints)
            assertTrue(r.lineCount > 1)
        }
    }
}
