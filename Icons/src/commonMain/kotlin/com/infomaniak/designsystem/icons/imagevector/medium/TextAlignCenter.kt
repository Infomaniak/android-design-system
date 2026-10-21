package com.infomaniak.designsystem.icons.imagevector.medium

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

internal val EsdsIcons.Medium.TextAlignCenter: ImageVector
    get() {
        if (_TextAlignCenter != null) {
            return _TextAlignCenter!!
        }
        _TextAlignCenter = ImageVector.Builder(
            name = "Medium.TextAlignCenter",
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
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                moveToRelative(14f, 7f)
                horizontalLineTo(7f)
                moveToRelative(12f, 7f)
                horizontalLineTo(5f)
            }
        }.build()

        return _TextAlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignCenter: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.TextAlignCenter,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
