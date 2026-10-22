package com.infomaniak.designsystem.icons.imagevector.extrasmall

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

internal val EsdsIcons.ExtraSmall.ProductKmeetFilled: ImageVector
    get() {
        if (_ProductKmeetFilled != null) {
            return _ProductKmeetFilled!!
        }
        _ProductKmeetFilled = ImageVector.Builder(
            name = "ExtraSmall.ProductKmeetFilled",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.95f, 3.525f)
                curveToRelative(0.2f, 0f, 0.385f, 0.033f, 0.548f, 0.081f)
                lineToRelative(0.008f, 0.003f)
                lineToRelative(11.206f, 3.41f)
                lineToRelative(0.049f, 0.013f)
                arcTo(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.1f, 8.835f)
                verticalLineToRelative(9.522f)
                arcToRelative(1.894f, 1.894f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.9f, 1.886f)
                quadToRelative(-0.278f, 0f, -0.546f, -0.08f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(-1.898f, -0.574f)
                verticalLineToRelative(1.404f)
                arcToRelative(1.386f, 1.386f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.508f, 0.811f)
                lineToRelative(-2.74f, -3.749f)
                lineToRelative(-4.135f, -1.32f)
                horizontalLineToRelative(-0.003f)
                arcTo(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.05f, 14.94f)
                verticalLineTo(5.41f)
                curveToRelative(0f, -1.053f, 0.864f, -1.885f, 1.9f, -1.885f)
                moveToRelative(2.51f, 5.124f)
                curveToRelative(-0.218f, -0.062f, -0.395f, 0.057f, -0.395f, 0.268f)
                verticalLineToRelative(4.196f)
                curveToRelative(0f, 0.209f, 0.177f, 0.431f, 0.395f, 0.493f)
                lineToRelative(4.09f, 1.152f)
                curveToRelative(0.218f, 0.062f, 0.393f, -0.057f, 0.393f, -0.268f)
                verticalLineToRelative(-1.486f)
                lineToRelative(2f, 1.922f)
                curveToRelative(0.053f, 0.044f, 0.114f, 0.06f, 0.163f, 0.04f)
                curveToRelative(0.05f, -0.021f, 0.08f, -0.073f, 0.08f, -0.14f)
                lineToRelative(0.058f, -3.803f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.078f, -0.186f)
                curveToRelative(-0.05f, -0.048f, -0.11f, -0.07f, -0.163f, -0.054f)
                lineToRelative(-2.06f, 0.888f)
                verticalLineToRelative(-1.377f)
                curveToRelative(0f, -0.208f, -0.175f, -0.43f, -0.393f, -0.492f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.156f, 2.237f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.098f, -0.572f)
                lineTo(19.45f, 4.87f)
                arcToRelative(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 2.043f)
                verticalLineToRelative(9.502f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 0f)
                verticalLineTo(6.913f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.275f, -0.374f)
                lineTo(8.729f, 3.334f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.573f, -1.097f)
            }
        }.build()

        return _ProductKmeetFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ProductKmeetFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.ProductKmeetFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
