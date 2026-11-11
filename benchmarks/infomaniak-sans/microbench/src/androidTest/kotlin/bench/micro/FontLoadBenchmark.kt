package bench.micro

import android.graphics.Typeface
import android.graphics.fonts.Font as PlatformFont
import android.graphics.fonts.FontFamily as PlatformFontFamily
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import java.io.File
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FontLoadBenchmark {
    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val context = InstrumentationRegistry.getInstrumentation().targetContext

    private fun platformTypeface(font: PlatformFont): Typeface =
        Typeface.CustomFallbackBuilder(PlatformFontFamily.Builder(font).build()).build()

    // --- Uncached platform loads (what happens once per process on first use) ---

    /** Read the (deflate-compressed) font from the APK + apply wght variation. Same mechanism as res/font and CMP asset first load. */
    @Test
    fun platformLoad_infomaniak_fromApkAsset_wght500() {
        benchmarkRule.measureRepeated {
            val font = PlatformFont.Builder(context.assets, CMP_ASSET_PATH).setFontVariationSettings("'wght' 500").setWeight(500).build()
            assertNotNull(platformTypeface(font))
        }
    }

    /** Same font from an uncompressed file (mmap). Shows the cost of decompression/copy vs mmap. */
    @Test
    fun platformLoad_infomaniak_fromFileMmap_wght500() {
        val file = File(context.cacheDir, "infomaniak_sans.ttf")
        if (!file.exists()) context.assets.open(CMP_ASSET_PATH).use { i -> file.outputStream().use { i.copyTo(it) } }
        benchmarkRule.measureRepeated {
            val font = PlatformFont.Builder(file).setFontVariationSettings("'wght' 500").setWeight(500).build()
            assertNotNull(platformTypeface(font))
        }
    }

    /** System Roboto loaded from scratch from /system/fonts (normally never needed: preloaded in zygote). */
    @Test
    fun platformLoad_systemRoboto_fromFileMmap_wght500() {
        val file = File("/system/fonts/Roboto-Regular.ttf")
        benchmarkRule.measureRepeated {
            val font = PlatformFont.Builder(file).setFontVariationSettings("'wght' 500").setWeight(500).build()
            assertNotNull(platformTypeface(font))
        }
    }

    /** What FontFamily.Default + weight actually does on the platform (system font already in memory). */
    @Test
    fun platformDerive_systemDefault_w500() {
        benchmarkRule.measureRepeated {
            assertNotNull(Typeface.create(Typeface.DEFAULT, 500, false))
        }
    }

    // --- Compose FontFamily.Resolver paths ---

    @Test
    fun composeResolve_default_freshResolver_3weights() = resolveFresh { FontFamily.Default }

    @Test
    fun composeResolve_res_freshResolver_3weights() = resolveFresh { resFamily() }

    @Test
    fun composeResolve_cmpAsset_freshResolver_3weights() = resolveFresh { cmpAssetFamily(context) }

    /** Fresh resolver per iteration. Note: Compose's TypefaceRequestCache is process-global, so this is the warm path. */
    private fun resolveFresh(familyFactory: () -> FontFamily) {
        val family = familyFactory()
        benchmarkRule.measureRepeated {
            val resolver = createFontFamilyResolver(context)
            WEIGHTS.forEach { assertNotNull(resolver.resolve(family, FontWeight(it)).value) }
        }
    }

    /**
     * Defeats Compose's global typeface cache with a unique wght value each iteration, so every iteration goes through
     * AndroidFontLoader -> load + apply variation. For res fonts the base Typeface stays cached by Resources; for asset
     * fonts (CMP) the file is re-read by Typeface.Builder each time.
     */
    @Test
    fun composeResolve_res_uncachedVariation() = resolveUncached { w -> Font(R.font.infomaniak_sans, FontWeight(500), variationSettings = FontVariation.Settings(FontVariation.weight(w))) }

    @Test
    fun composeResolve_cmpAsset_uncachedVariation() = resolveUncached { w -> Font(CMP_ASSET_PATH, context.assets, FontWeight(500), variationSettings = FontVariation.Settings(FontVariation.weight(w))) }

    private fun resolveUncached(fontFactory: (Int) -> Font) {
        val resolver = createFontFamilyResolver(context)
        var i = 0
        benchmarkRule.measureRepeated {
            val family = runWithMeasurementDisabled { i++; FontFamily(fontFactory(100 + (i % 800))) }
            assertNotNull(resolver.resolve(family, FontWeight(500)).value)
        }
    }
}
