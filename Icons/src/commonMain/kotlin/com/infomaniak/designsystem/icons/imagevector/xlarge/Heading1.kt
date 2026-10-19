package com.infomaniak.designsystem.icons.imagevector.xlarge

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

public val EsdsIcons.XLarge.Heading1: ImageVector
    get() {
        if (_Heading1 != null) {
            return _Heading1!!
        }
        _Heading1 = ImageVector.Builder(
            name = "XLarge.Heading1",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.35f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 6f)
                verticalLineTo(6f)
                moveToRelative(8f, 12f)
                verticalLineTo(6f)
                moveToRelative(5f, 6f)
                lineToRelative(3f, -2f)
                verticalLineToRelative(8f)
            }
        }.build()

        return _Heading1!!
    }

@Suppress("ObjectPropertyName")
private var _Heading1: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.Heading1,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
