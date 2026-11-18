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

internal val EsdsIcons.Small.TextX: ImageVector
    get() {
        if (_TextX != null) {
            return _TextX!!
        }
        _TextX = ImageVector.Builder(
            name = "Small.TextX",
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
                moveTo(4f, 7f)
                verticalLineTo(4f)
                horizontalLineToRelative(9f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                moveToRelative(-7f, -3f)
                lineTo(8f, 20f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(4f, -5f)
                lineToRelative(2.5f, 2.5f)
                moveToRelative(0f, 0f)
                lineTo(20f, 20f)
                moveToRelative(-2.5f, -2.5f)
                lineTo(20f, 15f)
                moveToRelative(-2.5f, 2.5f)
                lineTo(15f, 20f)
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
            imageVector = EsdsIcons.Small.TextX,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
