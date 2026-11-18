package com.infomaniak.designsystem.icons.imagevector.extrasmall

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

internal val EsdsIcons.ExtraSmall.CakeCandles: ImageVector
    get() {
        if (_CakeCandles != null) {
            return _CakeCandles!!
        }
        _CakeCandles = ImageVector.Builder(
            name = "ExtraSmall.CakeCandles",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(20f, 21f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 5f)
                horizontalLineTo(4f)
                moveToRelative(16f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-2f, -5f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-1f)
                moveToRelative(3f, 5f)
                reflectiveCurveToRelative(-0.5f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2.5f, -2f, -4f, -2f)
                reflectiveCurveToRelative(-2.5f, 2f, -4f, 2f)
                reflectiveCurveToRelative(-2.5f, -2f, -4f, -2f)
                reflectiveCurveToRelative(-2f, 1f, -2f, 1f)
                moveToRelative(13f, -5f)
                horizontalLineToRelative(-5f)
                moveToRelative(5f, 0f)
                verticalLineTo(8f)
                moveToRelative(-5f, 3f)
                horizontalLineTo(7f)
                moveToRelative(5f, 0f)
                verticalLineTo(8f)
                moveToRelative(-5f, 3f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(3f)
                moveToRelative(3f, -5f)
                verticalLineTo(8f)
                moveToRelative(-3f, 8f)
                verticalLineToRelative(5f)
                moveToRelative(0f, 0f)
                horizontalLineTo(2f)
                moveTo(7f, 4f)
                horizontalLineToRelative(0.01f)
                moveTo(12f, 4f)
                horizontalLineToRelative(0.01f)
                moveTo(17f, 4f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _CakeCandles!!
    }

@Suppress("ObjectPropertyName")
private var _CakeCandles: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.CakeCandles,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
