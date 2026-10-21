package com.infomaniak.designsystem.icons.imagevector.extralarge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

internal val EsdsIcons.ExtraLarge.MousePointerSparkle: ImageVector
    get() {
        if (_MousePointerSparkle != null) {
            return _MousePointerSparkle!!
        }
        _MousePointerSparkle = ImageVector.Builder(
            name = "ExtraLarge.MousePointerSparkle",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.35f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(14f, 4.1f)
                lineTo(12f, 6f)
                moveTo(5.1f, 8f)
                lineToRelative(-2.9f, -0.8f)
                moveTo(6f, 12f)
                lineToRelative(-1.9f, 2f)
                moveTo(7.2f, 2.2f)
                lineTo(8f, 5.1f)
                moveToRelative(1.037f, 4.59f)
                arcToRelative(0.498f, 0.498f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.653f, -0.653f)
                lineToRelative(11f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.074f, 0.949f)
                lineToRelative(-4.349f, 1.041f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, 0.739f)
                lineToRelative(-1.04f, 4.35f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.95f, 0.074f)
                close()
            }
        }.build()

        return _MousePointerSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointerSparkle: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.MousePointerSparkle,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
