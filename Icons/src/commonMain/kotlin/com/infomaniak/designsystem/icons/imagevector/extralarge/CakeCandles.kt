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

internal val EsdsIcons.ExtraLarge.CakeCandles: ImageVector
    get() {
        if (_CakeCandles != null) {
            return _CakeCandles!!
        }
        _CakeCandles = ImageVector.Builder(
            name = "ExtraLarge.CakeCandles",
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
                moveTo(20f, 21f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(8f)
                moveToRelative(0f, -5f)
                reflectiveCurveToRelative(0.5f, -1f, 2f, -1f)
                reflectiveCurveToRelative(2.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(2.5f, -2f, 4f, -2f)
                reflectiveCurveToRelative(2.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(2f, -1f, 2f, -1f)
                moveTo(2f, 21f)
                horizontalLineToRelative(20f)
                moveTo(7f, 8f)
                verticalLineToRelative(3f)
                moveToRelative(5f, -3f)
                verticalLineToRelative(3f)
                moveToRelative(5f, -3f)
                verticalLineToRelative(3f)
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
            imageVector = EsdsIcons.ExtraLarge.CakeCandles,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
