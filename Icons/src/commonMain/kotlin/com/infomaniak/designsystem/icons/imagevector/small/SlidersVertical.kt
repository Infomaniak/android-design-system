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

internal val EsdsIcons.Small.SlidersVertical: ImageVector
    get() {
        if (_SlidersVertical != null) {
            return _SlidersVertical!!
        }
        _SlidersVertical = ImageVector.Builder(
            name = "Small.SlidersVertical",
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
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, 13f)
                verticalLineToRelative(-9f)
                moveToRelative(0f, -4f)
                verticalLineTo(3f)
                moveToRelative(5f, 13f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, -4f)
                verticalLineTo(3f)
                moveToRelative(0f, 18f)
                verticalLineToRelative(-5f)
                moveTo(3f, 14f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, -4f)
                verticalLineTo(3f)
                moveToRelative(0f, 18f)
                verticalLineToRelative(-7f)
            }
        }.build()

        return _SlidersVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SlidersVertical: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.SlidersVertical,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
