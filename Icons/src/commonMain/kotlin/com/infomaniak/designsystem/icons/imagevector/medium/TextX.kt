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

public val EsdsIcons.Medium.TextX: ImageVector
    get() {
        if (_TextX != null) {
            return _TextX!!
        }
        _TextX = ImageVector.Builder(
            name = "Medium.TextX",
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
                moveTo(4f, 7f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                moveTo(5f, 20f)
                horizontalLineToRelative(6f)
                moveToRelative(2f, -16f)
                lineTo(8f, 20f)
                moveToRelative(7f, -5f)
                lineToRelative(5f, 5f)
                moveToRelative(0f, -5f)
                lineToRelative(-5f, 5f)
            }
        }.build()

        return _TextX!!
    }

@Suppress("ObjectPropertyName")
private var _TextX: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.TextX,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
