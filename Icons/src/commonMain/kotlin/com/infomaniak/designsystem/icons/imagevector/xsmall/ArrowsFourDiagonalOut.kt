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
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.XSmall.ArrowsFourDiagonalOut: ImageVector
    get() {
        if (_ArrowsFourDiagonalOut != null) {
            return _ArrowsFourDiagonalOut!!
        }
        _ArrowsFourDiagonalOut = ImageVector.Builder(
            name = "XSmall.ArrowsFourDiagonalOut",
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
                moveToRelative(15f, 15f)
                lineToRelative(6f, 6f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                moveToRelative(-6f, -7f)
                lineToRelative(6f, -6f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                moveTo(8f, 21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 5f)
                lineToRelative(6f, -6f)
                moveTo(8f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -5f)
                lineToRelative(6f, 6f)
            }
        }.build()

        return _ArrowsFourDiagonalOut!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsFourDiagonalOut: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.ArrowsFourDiagonalOut,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
