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

public val EsdsIcons.Medium.ZigzagArrowUpRight: ImageVector
    get() {
        if (_ZigzagArrowUpRight != null) {
            return _ZigzagArrowUpRight!!
        }
        _ZigzagArrowUpRight = ImageVector.Builder(
            name = "Medium.ZigzagArrowUpRight",
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
                moveToRelative(20.996f, 12.6f)
                lineToRelative(-8.375f, 8.396f)
                moveToRelative(8.375f, -3.598f)
                verticalLineTo(12.6f)
                horizontalLineToRelative(-4.798f)
                moveToRelative(1.2f, -9.596f)
                verticalLineToRelative(3.598f)
                horizontalLineTo(12.6f)
                verticalLineTo(11.4f)
                horizontalLineTo(7.802f)
                verticalLineToRelative(4.798f)
                horizontalLineTo(3.004f)
                verticalLineToRelative(4.798f)
            }
        }.build()

        return _ZigzagArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ZigzagArrowUpRight: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.ZigzagArrowUpRight,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
