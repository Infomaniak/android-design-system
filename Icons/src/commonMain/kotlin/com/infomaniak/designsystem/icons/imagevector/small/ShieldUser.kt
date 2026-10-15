package com.infomaniak.designsystem.icons.imagevector.small

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

public val EsdsIcons.Small.ShieldUser: ImageVector
    get() {
        if (_ShieldUser != null) {
            return _ShieldUser!!
        }
        _ShieldUser = ImageVector.Builder(
            name = "Small.ShieldUser",
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
                moveTo(6.376f, 18.91f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.249f, 0.003f)
                moveTo(20f, 13f)
                curveToRelative(0f, 5f, -3.5f, 7.5f, -7.66f, 8.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.01f)
                curveTo(7.5f, 20.5f, 4f, 18f, 4f, 13f)
                lineTo(4f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(16f, 11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            }
        }.build()

        return _ShieldUser!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldUser: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ShieldUser,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
