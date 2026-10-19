package com.infomaniak.designsystem.icons.imagevector.extrasmall

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

public val EsdsIcons.ExtraSmall.KeyOptionApple: ImageVector
    get() {
        if (_KeyOptionApple != null) {
            return _KeyOptionApple!!
        }
        _KeyOptionApple = ImageVector.Builder(
            name = "ExtraSmall.KeyOptionApple",
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
                moveTo(3f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(6f, 18f)
                horizontalLineToRelative(6f)
                moveTo(14f, 3f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _KeyOptionApple!!
    }

@Suppress("ObjectPropertyName")
private var _KeyOptionApple: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.KeyOptionApple,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
