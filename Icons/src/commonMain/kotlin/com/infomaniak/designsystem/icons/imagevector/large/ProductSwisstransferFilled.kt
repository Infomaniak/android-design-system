package com.infomaniak.designsystem.icons.imagevector.large

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

public val EsdsIcons.Large.ProductSwisstransferFilled: ImageVector
    get() {
        if (_ProductSwisstransferFilled != null) {
            return _ProductSwisstransferFilled!!
        }
        _ProductSwisstransferFilled = ImageVector.Builder(
            name = "Large.ProductSwisstransferFilled",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.892f, 5.45f)
                curveToRelative(0f, -1.266f, 1.21f, -2.233f, 2.462f, -1.838f)
                lineToRelative(11.253f, 3.553f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.334f, 1.837f)
                lineTo(17.941f, 20.45f)
                curveToRelative(0f, 1.266f, -1.21f, 2.232f, -2.461f, 1.837f)
                lineTo(4.226f, 18.735f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.334f, -1.838f)
                close()
                moveTo(11.715f, 9.537f)
                curveToRelative(-0.248f, -0.233f, -0.56f, -0.235f, -0.694f, -0.004f)
                lineToRelative(-1.796f, 3.665f)
                lineToRelative(-0.562f, -1.049f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.231f, -0.335f)
                curveToRelative(-0.254f, -0.223f, -0.56f, -0.21f, -0.686f, 0.03f)
                lineToRelative(-1.03f, 2.805f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.053f, 0.235f)
                curveToRelative(0f, 0.314f, 0.23f, 0.645f, 0.512f, 0.739f)
                lineToRelative(3.052f, 1.048f)
                lineToRelative(1.488f, -2.064f)
                lineToRelative(-0.078f, 2.5f)
                lineToRelative(1.644f, 0.547f)
                quadToRelative(0.13f, 0.042f, 0.245f, 0.012f)
                curveToRelative(0.248f, -0.069f, 0.339f, -0.384f, 0.204f, -0.704f)
                lineToRelative(-1.811f, -7.13f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.204f, -0.295f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2.232f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.102f, -0.565f)
                lineTo(19.53f, 5.022f)
                arcToRelative(2.275f, 2.275f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.578f, 2.165f)
                verticalLineToRelative(11.146f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 0f)
                verticalLineTo(7.187f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.364f, -0.5f)
                lineTo(8.565f, 3.333f)
                arcTo(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2.233f)
            }
        }.build()

        return _ProductSwisstransferFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ProductSwisstransferFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ProductSwisstransferFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
