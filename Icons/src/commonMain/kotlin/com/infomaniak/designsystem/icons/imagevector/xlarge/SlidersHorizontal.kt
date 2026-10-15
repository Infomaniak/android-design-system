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
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.XLarge.SlidersHorizontal: ImageVector
    get() {
        if (_SlidersHorizontal != null) {
            return _SlidersHorizontal!!
        }
        _SlidersHorizontal = ImageVector.Builder(
            name = "XLarge.SlidersHorizontal",
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
                moveTo(10f, 5f)
                horizontalLineTo(3f)
                moveToRelative(9f, 14f)
                horizontalLineTo(3f)
                moveTo(14f, 3f)
                verticalLineToRelative(4f)
                moveToRelative(2f, 10f)
                verticalLineToRelative(4f)
                moveToRelative(5f, -9f)
                horizontalLineToRelative(-9f)
                moveToRelative(9f, 7f)
                horizontalLineToRelative(-5f)
                moveToRelative(5f, -14f)
                horizontalLineToRelative(-7f)
                moveToRelative(-6f, 5f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -2f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SlidersHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _SlidersHorizontal: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.SlidersHorizontal,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
