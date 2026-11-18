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

internal val EsdsIcons.Large.HashSign: ImageVector
    get() {
        if (_HashSign != null) {
            return _HashSign!!
        }
        _HashSign = ImageVector.Builder(
            name = "Large.HashSign",
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
                moveTo(4f, 9f)
                horizontalLineToRelative(5.333f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, 0f)
                lineTo(10f, 3f)
                moveToRelative(-0.667f, 6f)
                lineToRelative(-0.666f, 6f)
                moveToRelative(6.666f, -6f)
                horizontalLineTo(20f)
                moveToRelative(-4.667f, 0f)
                lineTo(16f, 3f)
                moveToRelative(-0.667f, 6f)
                lineToRelative(-0.666f, 6f)
                moveTo(4f, 15f)
                horizontalLineToRelative(4.667f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, 0f)
                lineTo(8f, 21f)
                moveToRelative(6.667f, -6f)
                horizontalLineTo(20f)
                moveToRelative(-5.333f, 0f)
                lineTo(14f, 21f)
            }
        }.build()

        return _HashSign!!
    }

@Suppress("ObjectPropertyName")
private var _HashSign: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.HashSign,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
