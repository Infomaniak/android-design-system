package com.infomaniak.designsystem.icons.imagevector.large

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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Large.TreePalm: ImageVector
    get() {
        if (_TreePalm != null) {
            return _TreePalm!!
        }
        _TreePalm = ImageVector.Builder(
            name = "Large.TreePalm",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(10f, 8f)
                horizontalLineTo(6f)
                lineTo(5f, 7f)
                lineTo(4f, 8f)
                horizontalLineTo(2f)
                curveToRelative(0f, -2.76f, 2.46f, -5f, 5.5f, -5f)
                reflectiveCurveTo(13f, 5.24f, 13f, 8f)
                curveToRelative(0.5f, 2f, 3f, 8.5f, 1f, 14f)
                horizontalLineToRelative(-4f)
                curveToRelative(0.83f, -2f, 1.5f, -4f, 1f, -6.5f)
                moveToRelative(2f, -8.36f)
                arcTo(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 6f)
                curveToRelative(3.04f, 0f, 5.5f, 2.24f, 5.5f, 5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3f)
                moveTo(5.89f, 9.71f)
                curveToRelative(-2.15f, 2.15f, -2.3f, 5.47f, -0.35f, 7.43f)
                lineToRelative(4.24f, -4.25f)
                lineToRelative(3.53f, -3.53f)
                curveToRelative(-1.95f, -1.96f, -5.27f, -1.8f, -7.42f, 0.35f)
            }
        }.build()

        return _TreePalm!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalm: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.TreePalm,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
