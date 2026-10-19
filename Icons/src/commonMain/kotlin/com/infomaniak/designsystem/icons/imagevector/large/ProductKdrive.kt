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

public val EsdsIcons.Large.ProductKdrive: ImageVector
    get() {
        if (_ProductKdrive != null) {
            return _ProductKdrive!!
        }
        _ProductKdrive = ImageVector.Builder(
            name = "Large.ProductKdrive",
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
                moveTo(7.99f, 4.946f)
                verticalLineTo(3.588f)
                curveToRelative(0f, -0.624f, 0.483f, -1.088f, 1.022f, -1.088f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.395f, 0.084f)
                lineToRelative(1.764f, 0.784f)
                curveToRelative(0.27f, 0.12f, 0.48f, 0.356f, 0.575f, 0.65f)
                lineToRelative(0.678f, 1.965f)
                curveToRelative(0.113f, 0.353f, 0.386f, 0.618f, 0.726f, 0.706f)
                lineToRelative(7.339f, 1.828f)
                lineToRelative(-0.003f, -0.006f)
                curveToRelative(0.459f, 0.12f, 0.805f, 0.772f, 0.805f, 1.272f)
                verticalLineToRelative(9.184f)
                moveToRelative(-2.748f, 1.9f)
                verticalLineToRelative(-9.591f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.588f, -0.748f)
                lineToRelative(-7.667f, -1.855f)
                arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -0.873f)
                lineToRelative(-0.734f, -2.12f)
                arcToRelative(0.78f, 0.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.434f, -0.46f)
                lineToRelative(-1.843f, -0.76f)
                arcToRelative(0.78f, 0.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.606f, 0.009f)
                lineToRelative(-0.013f, 0.005f)
                lineToRelative(-0.02f, 0.01f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.425f, 0.685f)
                verticalLineToRelative(3.886f)
                moveToRelative(13.3f, 11.875f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.015f, -0.113f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-2.16f, -7.425f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.271f, -0.47f)
                curveToRelative(-0.051f, -0.053f, -0.114f, -0.095f, -0.173f, -0.136f)
                quadToRelative(-0.036f, -0.023f, -0.072f, -0.042f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.196f, -0.087f)
                curveToRelative(-0.006f, 0f, -0.012f, -0.006f, -0.018f, -0.006f)
                lineTo(4.043f, 9.509f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.287f, -0.042f)
                curveToRelative(-0.69f, 0f, -1.233f, 0.714f, -0.986f, 1.437f)
                lineToRelative(2.186f, 6.039f)
                curveToRelative(0.11f, 0.323f, 0.364f, 0.57f, 0.683f, 0.672f)
                lineToRelative(12.224f, 3.861f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.155f, 0.024f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.519f, -0.493f)
                verticalLineToRelative(-0.078f)
                close()
            }
        }.build()

        return _ProductKdrive!!
    }

@Suppress("ObjectPropertyName")
private var _ProductKdrive: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ProductKdrive,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
