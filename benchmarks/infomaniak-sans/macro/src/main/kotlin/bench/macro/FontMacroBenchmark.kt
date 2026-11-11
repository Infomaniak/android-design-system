package bench.macro

import android.content.Intent
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.MacrobenchmarkScope
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.StartupTimingMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

private const val PKG = "bench.font"

@RunWith(Parameterized::class)
class FontMacroBenchmark(private val font: String) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "font={0}")
        fun params() = listOf("default", "res", "cmp")
    }

    @get:Rule
    val rule = MacrobenchmarkRule()

    private fun MacrobenchmarkScope.launch() {
        startActivityAndWait(Intent().setClassName(PKG, "$PKG.MainActivity").putExtra("font", font))
    }

    @Test
    fun startupColdFull() = rule.measureRepeated(
        packageName = PKG,
        metrics = listOf(StartupTimingMetric()),
        compilationMode = CompilationMode.Full(),
        startupMode = StartupMode.COLD,
        iterations = 15,
    ) { launch() }

    @Test
    fun startupColdNone() = rule.measureRepeated(
        packageName = PKG,
        metrics = listOf(StartupTimingMetric()),
        compilationMode = CompilationMode.None(),
        startupMode = StartupMode.COLD,
        iterations = 15,
    ) { launch() }

    @Test
    fun scrollFull() = rule.measureRepeated(
        packageName = PKG,
        metrics = listOf(FrameTimingMetric()),
        compilationMode = CompilationMode.Full(),
        startupMode = StartupMode.COLD,
        iterations = 8,
        setupBlock = { launch() },
    ) {
        val x = device.displayWidth / 2
        val h = device.displayHeight
        // Fast swipes = flings through the 200-item list (new items composed/measured/drawn every frame).
        repeat(6) { device.swipe(x, h * 4 / 5, x, h / 5, 8); Thread.sleep(700) }
        repeat(2) { device.swipe(x, h / 5, x, h * 4 / 5, 8); Thread.sleep(700) }
    }
}
