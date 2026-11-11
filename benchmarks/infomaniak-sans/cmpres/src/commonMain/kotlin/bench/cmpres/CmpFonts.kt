package bench.cmpres

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import bench.cmpres.generated.Res
import bench.cmpres.generated.infomaniak_sans
import org.jetbrains.compose.resources.Font

@OptIn(androidx.compose.ui.text.ExperimentalTextApi::class)
@Composable
fun infomaniakSansCmp(): FontFamily = FontFamily(
    listOf(400, 500, 700).map { w ->
        Font(
            Res.font.infomaniak_sans,
            weight = FontWeight(w),
            variationSettings = FontVariation.Settings(FontVariation.weight(w)),
        )
    }
)
