package com.infomaniak.designsystem.icons.imagevector.small

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.Small.ProductSwisstransfer: ImageVector
    get() {
        if (_ProductSwisstransfer != null) {
            return _ProductSwisstransfer!!
        }
        _ProductSwisstransfer = ImageVector.Builder(
            name = "Small.ProductSwisstransfer",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.95f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(8.833f, 2.5f)
                lineToRelative(10.43f, 3.355f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.97f, 1.332f)
                verticalLineToRelative(11.146f)
                moveTo(3.767f, 5.45f)
                curveToRelative(0f, -0.706f, 0.666f, -1.21f, 1.324f, -1.003f)
                lineTo(16.344f, 8f)
                curveToRelative(0.43f, 0.136f, 0.723f, 0.543f, 0.723f, 1.003f)
                verticalLineTo(20.45f)
                curveToRelative(0f, 0.706f, -0.666f, 1.21f, -1.324f, 1.003f)
                lineTo(4.489f, 17.9f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.722f, -1.003f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(11.715f, 9.537f)
                curveToRelative(0.086f, 0.08f, 0.157f, 0.183f, 0.204f, 0.295f)
                lineToRelative(1.81f, 7.13f)
                curveToRelative(0.136f, 0.32f, 0.045f, 0.636f, -0.203f, 0.704f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.245f, -0.012f)
                lineToRelative(-1.644f, -0.547f)
                lineToRelative(0.078f, -2.5f)
                lineToRelative(-1.487f, 2.064f)
                lineToRelative(-3.053f, -1.049f)
                curveToRelative(-0.283f, -0.094f, -0.512f, -0.425f, -0.512f, -0.739f)
                quadToRelative(0f, -0.132f, 0.053f, -0.234f)
                lineToRelative(1.03f, -2.805f)
                curveToRelative(0.125f, -0.24f, 0.432f, -0.253f, 0.685f, -0.03f)
                curveToRelative(0.1f, 0.089f, 0.182f, 0.207f, 0.232f, 0.335f)
                lineToRelative(0.562f, 1.05f)
                lineToRelative(1.796f, -3.666f)
                curveToRelative(0.135f, -0.23f, 0.446f, -0.229f, 0.694f, 0.004f)
            }
        }.build()

        return _ProductSwisstransfer!!
    }

@Suppress("ObjectPropertyName")
private var _ProductSwisstransfer: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ProductSwisstransfer,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
