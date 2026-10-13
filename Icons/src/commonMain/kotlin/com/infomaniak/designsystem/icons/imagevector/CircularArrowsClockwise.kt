package com.infomaniak.designsystem.icons.imagevector

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

public val EsdsIcons.CircularArrowsClockwise: ImageVector
    get() {
        if (_CircularArrowsClockwise != null) {
            return _CircularArrowsClockwise!!
        }
        _CircularArrowsClockwise = ImageVector.Builder(
            name = "CircularArrowsClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.75f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(17f, 10f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(1f)
                moveToRelative(4f, 3f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                horizontalLineToRelative(14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineToRelative(-1f)
            }
        }.build()

        return _CircularArrowsClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CircularArrowsClockwise: ImageVector? = null

@Preview
@Composable
private fun preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.CircularArrowsClockwise,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
