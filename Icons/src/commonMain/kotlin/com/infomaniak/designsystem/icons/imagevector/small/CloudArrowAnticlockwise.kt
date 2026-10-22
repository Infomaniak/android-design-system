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

internal val EsdsIcons.Small.CloudArrowAnticlockwise: ImageVector
    get() {
        if (_CloudArrowAnticlockwise != null) {
            return _CloudArrowAnticlockwise!!
        }
        _CloudArrowAnticlockwise = ImageVector.Builder(
            name = "Small.CloudArrowAnticlockwise",
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
                moveTo(21f, 15.25f)
                arcTo(4.499f, 4.499f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 8f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(6.999f, 6.999f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.377f, -0.111f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13.607f)
                moveTo(11f, 15f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 4f)
                lineToRelative(2.09f, -2.09f)
                arcToRelative(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, -1.41f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 3f)
            }
        }.build()

        return _CloudArrowAnticlockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowAnticlockwise: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.CloudArrowAnticlockwise,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
