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

internal val EsdsIcons.ExtraSmall.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) {
            return _ArrowUp!!
        }
        _ArrowUp = ImageVector.Builder(
            name = "ExtraSmall.ArrowUp",
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
                moveToRelative(19f, 12f)
                lineToRelative(-7f, -7f)
                lineToRelative(-7f, 7f)
                moveToRelative(7f, -7f)
                verticalLineToRelative(14f)
            }
        }.build()

        return _ArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.ArrowUp,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
