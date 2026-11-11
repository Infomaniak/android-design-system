package bench.micro

import android.content.Context
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight

const val CMP_ASSET_PATH = "composeResources/bench.cmpres.generated/font/infomaniak_sans.ttf"
val WEIGHTS = listOf(400, 500, 700)

fun resFamily(): FontFamily = FontFamily(
    WEIGHTS.map { w ->
        Font(R.font.infomaniak_sans, FontWeight(w), variationSettings = FontVariation.Settings(FontVariation.weight(w)))
    }
)

/** Exactly what org.jetbrains.compose.resources.Font(...) returns on Android: an asset Font. */
fun cmpAssetFamily(context: Context): FontFamily = FontFamily(
    WEIGHTS.map { w ->
        Font(CMP_ASSET_PATH, context.assets, FontWeight(w), variationSettings = FontVariation.Settings(FontVariation.weight(w)))
    }
)

fun family(name: String, context: Context): FontFamily = when (name) {
    "default" -> FontFamily.Default
    "res" -> resFamily()
    "cmpAsset" -> cmpAssetFamily(context)
    else -> error(name)
}

const val SHORT_TEXT = "Infomaniak kDrive 42" // 20 chars
val LONG_TEXT: String = (
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
        "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex " +
        "ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
        "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim " +
        "id est laborum. Àéèüöß ÇÑ 0123456789 — « Genève », kSuite & kChat, Infomaniak SA."
    ).take(500)
