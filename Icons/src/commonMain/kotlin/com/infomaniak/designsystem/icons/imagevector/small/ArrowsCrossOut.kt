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

public val EsdsIcons.Small.ArrowsCrossOut: ImageVector
    get() {
        if (_ArrowsCrossOut != null) {
            return _ArrowsCrossOut!!
        }
        _ArrowsCrossOut = ImageVector.Builder(
            name = "Small.ArrowsCrossOut",
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
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
                moveToRelative(3f, -17f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                moveToRelative(0f, 14f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                moveToRelative(4f, -4f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                horizontalLineTo(2f)
                moveToRelative(3f, 3f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
        }.build()

        return _ArrowsCrossOut!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsCrossOut: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ArrowsCrossOut,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
