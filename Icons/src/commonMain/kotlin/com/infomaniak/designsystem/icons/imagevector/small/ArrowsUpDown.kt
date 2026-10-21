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

internal val EsdsIcons.Small.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) {
            return _ArrowsUpDown!!
        }
        _ArrowsUpDown = ImageVector.Builder(
            name = "Small.ArrowsUpDown",
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
                moveToRelative(13f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                verticalLineTo(4f)
                moveToRelative(-6f, 4f)
                lineTo(7f, 4f)
                lineTo(3f, 8f)
                moveToRelative(4f, -4f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _ArrowsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsUpDown: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ArrowsUpDown,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
