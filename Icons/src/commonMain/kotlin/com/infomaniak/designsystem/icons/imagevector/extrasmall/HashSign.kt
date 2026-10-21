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

internal val EsdsIcons.ExtraSmall.HashSign: ImageVector
    get() {
        if (_HashSign != null) {
            return _HashSign!!
        }
        _HashSign = ImageVector.Builder(
            name = "ExtraSmall.HashSign",
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
                moveTo(4f, 9f)
                horizontalLineToRelative(16f)
                moveTo(4f, 15f)
                horizontalLineToRelative(16f)
                moveTo(10f, 3f)
                lineTo(8f, 21f)
                moveToRelative(8f, -18f)
                lineToRelative(-2f, 18f)
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
            imageVector = EsdsIcons.ExtraSmall.HashSign,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
