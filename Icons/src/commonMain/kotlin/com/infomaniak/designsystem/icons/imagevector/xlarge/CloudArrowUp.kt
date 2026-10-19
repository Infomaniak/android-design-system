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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XLarge.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) {
            return _CloudArrowUp!!
        }
        _CloudArrowUp = ImageVector.Builder(
            name = "XLarge.CloudArrowUp",
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
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
                moveToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                moveToRelative(-4f, -2.101f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.71f, -6.9f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 8.243f)
            }
        }.build()

        return _CloudArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowUp: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.CloudArrowUp,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
