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

public val EsdsIcons.ExtraSmall.Heading3: ImageVector
    get() {
        if (_Heading3 != null) {
            return _Heading3!!
        }
        _Heading3 = ImageVector.Builder(
            name = "ExtraSmall.Heading3",
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
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 6f)
                verticalLineTo(6f)
                moveToRelative(8f, 12f)
                verticalLineTo(6f)
                moveToRelative(5.5f, 4.5f)
                curveToRelative(1.7f, -1f, 3.5f, 0f, 3.5f, 1.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                curveToRelative(0f, 1.8f, -2f, 3f, -4f, 1.5f)
            }
        }.build()

        return _Heading3!!
    }

@Suppress("ObjectPropertyName")
private var _Heading3: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.Heading3,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
