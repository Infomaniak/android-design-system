package com.infomaniak.designsystem.icons.imagevector.xsmall

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

public val EsdsIcons.XSmall.CircleArrowsAnticlockwise: ImageVector
    get() {
        if (_CircleArrowsAnticlockwise != null) {
            return _CircleArrowsAnticlockwise!!
        }
        _CircleArrowsAnticlockwise = ImageVector.Builder(
            name = "XSmall.CircleArrowsAnticlockwise",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.74f, 2.74f)
                lineTo(3f, 8f)
                moveToRelative(5f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveToRelative(0f, 9f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.74f, -2.74f)
                lineTo(21f, 16f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
            }
        }.build()

        return _CircleArrowsAnticlockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CircleArrowsAnticlockwise: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.CircleArrowsAnticlockwise,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
