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

internal val EsdsIcons.ExtraSmall.PencilSparkles: ImageVector
    get() {
        if (_PencilSparkles != null) {
            return _PencilSparkles!!
        }
        _PencilSparkles = ImageVector.Builder(
            name = "ExtraSmall.PencilSparkles",
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
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                moveToRelative(7.007f, 2.008f)
                lineToRelative(3.987f, 3.986f)
                moveTo(20f, 15f)
                verticalLineToRelative(4f)
                moveToRelative(2f, -2f)
                horizontalLineToRelative(-4f)
                moveTo(4f, 5f)
                verticalLineToRelative(4f)
                moveToRelative(2f, -2f)
                horizontalLineTo(2f)
                moveToRelative(7f, -5f)
                verticalLineToRelative(2f)
                moveToRelative(12.174f, 2.813f)
                arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.986f, -3.987f)
                lineTo(3.842f, 16.175f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.83f)
                lineToRelative(-1.321f, 4.352f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.623f, 0.622f)
                lineToRelative(4.353f, -1.32f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, -0.497f)
                close()
            }
        }.build()

        return _PencilSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSparkles: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.PencilSparkles,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
