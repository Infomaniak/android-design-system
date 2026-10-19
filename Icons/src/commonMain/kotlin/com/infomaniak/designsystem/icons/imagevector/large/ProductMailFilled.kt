package com.infomaniak.designsystem.icons.imagevector.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Large.ProductMailFilled: ImageVector
    get() {
        if (_ProductMailFilled != null) {
            return _ProductMailFilled!!
        }
        _ProductMailFilled = ImageVector.Builder(
            name = "Large.ProductMailFilled",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.986f, 16.603f)
                verticalLineTo(6.142f)
                lineToRelative(-0.003f, -0.039f)
                curveToRelative(0f, -0.718f, 0.38f, -1.321f, 0.916f, -1.666f)
                lineToRelative(0.08f, -0.044f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.597f, -0.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.162f, 0.029f)
                lineToRelative(13.816f, 3.81f)
                quadToRelative(0.151f, 0.015f, 0.292f, 0.083f)
                curveToRelative(0.223f, 0.078f, 0.395f, 0.24f, 0.494f, 0.439f)
                curveToRelative(0.256f, 0.331f, 0.413f, 0.746f, 0.413f, 1.196f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.164f, -0.975f, 1.994f, -2.028f, 1.994f)
                quadToRelative(-0.305f, 0f, -0.59f, -0.087f)
                lineToRelative(-12.708f, -3.78f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, -1.905f)
                moveToRelative(18.28f, 3.202f)
                verticalLineTo(7.485f)
                arcToRelative(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.318f, -0.416f)
                lineTo(6.219f, 3.345f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -1.69f)
                lineTo(20.406f, 5.38f)
                curveToRelative(0.95f, 0.258f, 1.61f, 1.12f, 1.61f, 2.105f)
                verticalLineToRelative(12.32f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 0f)
                moveTo(9.302f, 14.443f)
                arcToRelative(0.29f, 0.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.257f, 0.141f)
                curveToRelative(0.072f, 0f, 0.14f, -0.024f, 0.195f, -0.07f)
                lineToRelative(5.882f, -5.065f)
                lineTo(5.092f, 6.541f)
                close()
            }
        }.build()

        return _ProductMailFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ProductMailFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ProductMailFilled,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
