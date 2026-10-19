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

public val EsdsIcons.XLarge.CircleArrowAnticlockwise: ImageVector
    get() {
        if (_CircleArrowAnticlockwise != null) {
            return _CircleArrowAnticlockwise!!
        }
        _CircleArrowAnticlockwise = ImageVector.Builder(
            name = "XLarge.CircleArrowAnticlockwise",
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
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, -9f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.74f, 2.74f)
                lineTo(3f, 8f)
                moveToRelative(5f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
            }
        }.build()

        return _CircleArrowAnticlockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CircleArrowAnticlockwise: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.CircleArrowAnticlockwise,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
