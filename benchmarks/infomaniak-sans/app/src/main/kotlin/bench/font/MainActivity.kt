package bench.font

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.unit.dp
import bench.cmpres.infomaniakSansCmp

val infomaniakSansRes: FontFamily = FontFamily(
    listOf(400, 500, 700).map { w ->
        Font(
            R.font.infomaniak_sans,
            weight = FontWeight(w),
            variationSettings = FontVariation.Settings(FontVariation.weight(w)),
        )
    }
)

fun Typography.withFamily(family: FontFamily): Typography {
    fun TextStyle.f() = copy(fontFamily = family)
    return Typography(
        displayLarge.f(), displayMedium.f(), displaySmall.f(),
        headlineLarge.f(), headlineMedium.f(), headlineSmall.f(),
        titleLarge.f(), titleMedium.f(), titleSmall.f(),
        bodyLarge.f(), bodyMedium.f(), bodySmall.f(),
        labelLarge.f(), labelMedium.f(), labelSmall.f(),
    )
}

const val CMP_PATH = "composeResources/bench.cmpres.generated/font/infomaniak_sans.ttf"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val variant = intent.getStringExtra("font") ?: "default"
        if (intent.getBooleanExtra("probe", false)) {
            // Cold font resolution in a fresh process, through Compose's FontFamily.Resolver.
            val family = when (variant) {
                "res" -> infomaniakSansRes
                // Same Font that org.jetbrains.compose.resources.Font() builds on Android (asset font).
                "cmp" -> FontFamily(listOf(400, 500, 700).map { w ->
                    Font(CMP_PATH, assets, FontWeight(w), variationSettings = FontVariation.Settings(FontVariation.weight(w)))
                })
                else -> FontFamily.Default
            }
            val resolver = createFontFamilyResolver(this)
            val t0 = SystemClock.elapsedRealtimeNanos()
            resolver.resolve(family, FontWeight(400))
            val t1 = SystemClock.elapsedRealtimeNanos()
            resolver.resolve(family, FontWeight(500))
            resolver.resolve(family, FontWeight(700))
            val t2 = SystemClock.elapsedRealtimeNanos()
            Log.i("FontBench", "probe variant=$variant first400_us=${(t1 - t0) / 1000} next2_us=${(t2 - t1) / 1000}")
        }
        setContent {
            val family = when (variant) {
                "res" -> infomaniakSansRes
                "cmp" -> infomaniakSansCmp()
                else -> FontFamily.Default
            }
            MaterialTheme(typography = MaterialTheme.typography.withFamily(family)) {
                Surface(Modifier.fillMaxSize().semantics { testTagsAsResourceId = true }) {
                    ListScreen()
                }
            }
        }
    }
}

private val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Àéèüöß 0123456789 — kSuite, kDrive, Infomaniak."

@Composable
fun ListScreen() {
    LazyColumn(Modifier.fillMaxSize().testTag("list")) {
        items((0 until 200).toList()) { i ->
            Column(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                Text("Item #$i — Title", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium))
                Text(body, style = MaterialTheme.typography.bodyMedium)
                Text("LABEL $i", style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold))
            }
            HorizontalDivider()
        }
    }
}
