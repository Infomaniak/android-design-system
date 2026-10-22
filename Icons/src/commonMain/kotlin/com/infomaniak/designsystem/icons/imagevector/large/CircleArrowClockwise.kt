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
import com.infomaniak.designsystem.icons.PreviewIconSize

internal val EsdsIcons.Large.CircleArrowClockwise: ImageVector
    get() {
        if (_CircleArrowClockwise != null) {
            return _CircleArrowClockwise!!
        }
        _CircleArrowClockwise = ImageVector.Builder(
            name = "Large.CircleArrowClockwise",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, -9f)
                curveToRelative(2.52f, 0f, 4.93f, 1f, 6.74f, 2.74f)
                lineTo(21f, 8f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
            }
        }.build()

        return _CircleArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CircleArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.CircleArrowClockwise,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
