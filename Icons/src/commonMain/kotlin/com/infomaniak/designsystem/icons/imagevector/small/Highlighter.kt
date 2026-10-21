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

internal val EsdsIcons.Small.Highlighter: ImageVector
    get() {
        if (_Highlighter != null) {
            return _Highlighter!!
        }
        _Highlighter = ImageVector.Builder(
            name = "Small.Highlighter",
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
                moveToRelative(9f, 11f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                lineToRelative(3f, -3f)
                moveToRelative(7f, -5f)
                lineToRelative(-4.6f, 4.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.8f, 0f)
                lineToRelative(-5.2f, -5.2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.8f)
                lineTo(14f, 4f)
            }
        }.build()

        return _Highlighter!!
    }

@Suppress("ObjectPropertyName")
private var _Highlighter: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.Highlighter,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
