package com.infomaniak.designsystem.icons.imagevector.xlarge

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

public val EsdsIcons.XLarge.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "XLarge.Rocket",
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
                moveTo(12f, 15f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(3.03f, -0.55f, 4f, -2f)
                curveToRelative(1.08f, -1.62f, 0f, -5f, 0f, -5f)
                moveToRelative(-4f, 2f)
                arcToRelative(22.4f, 22.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -2f)
                moveToRelative(-4f, 2f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -3.95f)
                arcTo(12.88f, 12.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 2f)
                curveToRelative(0f, 2.72f, -0.78f, 7.5f, -6f, 11f)
                moveToRelative(-7f, -1f)
                horizontalLineTo(4f)
                reflectiveCurveToRelative(0.55f, -3.03f, 2f, -4f)
                curveToRelative(1.62f, -1.08f, 5f, 0.05f, 5f, 0.05f)
                moveTo(4.5f, 16.5f)
                curveToRelative(-1.5f, 1.26f, -2f, 5f, -2f, 5f)
                reflectiveCurveToRelative(3.74f, -0.5f, 5f, -2f)
                curveToRelative(0.71f, -0.84f, 0.7f, -2.13f, -0.09f, -2.91f)
                arcToRelative(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, -0.09f)
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.Rocket,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
