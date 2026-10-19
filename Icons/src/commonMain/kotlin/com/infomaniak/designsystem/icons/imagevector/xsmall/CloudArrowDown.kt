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

public val EsdsIcons.XSmall.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) {
            return _CloudArrowDown!!
        }
        _CloudArrowDown = ImageVector.Builder(
            name = "XSmall.CloudArrowDown",
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
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
                moveToRelative(4f, -4f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                moveToRelative(-3.607f, -1.73f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.436f, 8.284f)
            }
        }.build()

        return _CloudArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowDown: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.CloudArrowDown,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
