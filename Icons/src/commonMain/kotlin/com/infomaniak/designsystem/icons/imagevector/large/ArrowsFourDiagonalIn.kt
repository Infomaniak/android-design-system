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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Large.ArrowsFourDiagonalIn: ImageVector
    get() {
        if (_ArrowsFourDiagonalIn != null) {
            return _ArrowsFourDiagonalIn!!
        }
        _ArrowsFourDiagonalIn = ImageVector.Builder(
            name = "Large.ArrowsFourDiagonalIn",
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
                moveToRelative(15f, 15f)
                lineToRelative(6f, 6f)
                moveToRelative(-1.2f, -6f)
                horizontalLineTo(15f)
                verticalLineToRelative(4.8f)
                moveTo(4.2f, 15f)
                horizontalLineTo(9f)
                verticalLineToRelative(4.8f)
                moveTo(9f, 15f)
                lineToRelative(-6f, 6f)
                moveTo(19.8f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(4.2f)
                moveTo(15f, 9f)
                lineToRelative(6f, -6f)
                moveTo(4.2f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(4.2f)
                moveTo(9f, 9f)
                lineTo(3f, 3f)
            }
        }.build()

        return _ArrowsFourDiagonalIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsFourDiagonalIn: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ArrowsFourDiagonalIn,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
