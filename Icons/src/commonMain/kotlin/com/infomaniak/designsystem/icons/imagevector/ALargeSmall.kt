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

public val EsdsIcons.ALargeSmall: ImageVector
    get() {
        if (_ALargeSmall != null) {
            return _ALargeSmall!!
        }
        _ALargeSmall = ImageVector.Builder(
            name = "ALargeSmall",
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
                moveToRelative(15f, 16f)
                lineToRelative(2.536f, -7.328f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.928f, 0f)
                lineTo(22f, 16f)
                moveToRelative(-6.303f, -2f)
                horizontalLineToRelative(5.606f)
                moveTo(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.923f, 0f)
                lineTo(11f, 16f)
                moveToRelative(-7.696f, -3f)
                horizontalLineToRelative(6.392f)
            }
        }.build()

        return _ALargeSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ALargeSmall: ImageVector? = null

@Preview
@Composable
private fun preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ALargeSmall,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
