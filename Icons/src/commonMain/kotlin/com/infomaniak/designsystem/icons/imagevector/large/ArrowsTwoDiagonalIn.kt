package com.infomaniak.designsystem.icons.imagevector.large

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

internal val EsdsIcons.Large.ArrowsTwoDiagonalIn: ImageVector
    get() {
        if (_ArrowsTwoDiagonalIn != null) {
            return _ArrowsTwoDiagonalIn!!
        }
        _ArrowsTwoDiagonalIn = ImageVector.Builder(
            name = "Large.ArrowsTwoDiagonalIn",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(14f, 10f)
                lineToRelative(7f, -7f)
                moveToRelative(-7f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                moveTo(3f, 21f)
                lineToRelative(7f, -7f)
                moveToRelative(0f, 6f)
                verticalLineToRelative(-6f)
                horizontalLineTo(4f)
            }
        }.build()

        return _ArrowsTwoDiagonalIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsTwoDiagonalIn: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ArrowsTwoDiagonalIn,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
