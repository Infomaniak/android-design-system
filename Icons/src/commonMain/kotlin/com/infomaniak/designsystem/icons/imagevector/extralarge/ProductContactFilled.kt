package com.infomaniak.designsystem.icons.imagevector.extralarge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

internal val EsdsIcons.ExtraLarge.ProductContactFilled: ImageVector
    get() {
        if (_ProductContactFilled != null) {
            return _ProductContactFilled!!
        }
        _ProductContactFilled = ImageVector.Builder(
            name = "ExtraLarge.ProductContactFilled",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.058f, 5.506f)
                curveToRelative(0f, -1.094f, 0.989f, -1.914f, 2.044f, -1.724f)
                lineToRelative(0.211f, 0.052f)
                lineToRelative(9.532f, 2.96f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.227f, 1.67f)
                verticalLineToRelative(12.158f)
                curveToRelative(0f, 1.167f, -1.125f, 2.023f, -2.256f, 1.672f)
                lineToRelative(-9.53f, -2.959f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.228f, -1.672f)
                close()
                moveTo(5.808f, 17.664f)
                lineTo(7.2f, 18.096f)
                lineTo(7.2f, 5.942f)
                lineTo(5.808f, 5.51f)
                close()
                moveTo(11.433f, 12.08f)
                arcToRelative(0.215f, 0.215f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 0.155f)
                lineToRelative(0.852f, -0.86f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.153f, 0f)
                lineToRelative(0.854f, 1.411f)
                arcToRelative(0.215f, 0.215f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, -0.154f)
                verticalLineToRelative(-4.57f)
                lineToRelative(-2.6f, -0.807f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.818f, 2.225f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.105f, -0.559f)
                lineToRelative(4.757f, 1.56f)
                lineToRelative(4.477f, 1.419f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.795f, 2.452f)
                verticalLineToRelative(11.406f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 0f)
                verticalLineTo(7.097f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.573f, -0.783f)
                lineTo(13.15f, 4.896f)
                lineToRelative(-0.008f, -0.003f)
                lineToRelative(-4.766f, -1.565f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.559f, -1.103f)
            }
        }.build()

        return _ProductContactFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ProductContactFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.ProductContactFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
