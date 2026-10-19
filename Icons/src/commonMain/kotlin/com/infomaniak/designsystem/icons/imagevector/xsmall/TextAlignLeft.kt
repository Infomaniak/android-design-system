package com.infomaniak.designsystem.icons.imagevector.xsmall

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

public val EsdsIcons.XSmall.TextAlignLeft: ImageVector
    get() {
        if (_TextAlignLeft != null) {
            return _TextAlignLeft!!
        }
        _TextAlignLeft = ImageVector.Builder(
            name = "XSmall.TextAlignLeft",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                moveToRelative(12f, 7f)
                horizontalLineTo(3f)
                moveToRelative(14f, 7f)
                horizontalLineTo(3f)
            }
        }.build()

        return _TextAlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignLeft: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.TextAlignLeft,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
