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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XSmall.CloudSlash: ImageVector
    get() {
        if (_CloudSlash != null) {
            return _CloudSlash!!
        }
        _CloudSlash = ImageVector.Builder(
            name = "XSmall.CloudSlash",
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
                moveTo(10.94f, 5.274f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.71f, 10f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.222f, 6.057f)
                moveToRelative(-2.926f, 2.753f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19f)
                horizontalLineTo(9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.79f, 5.78f)
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()

        return _CloudSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSlash: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.CloudSlash,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
