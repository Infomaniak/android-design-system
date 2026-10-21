package com.infomaniak.designsystem.icons.imagevector.extralarge

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

internal val EsdsIcons.ExtraLarge.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "ExtraLarge.Pen",
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
                moveToRelative(15f, 5f)
                lineToRelative(4f, 4f)
                moveToRelative(2.174f, -2.188f)
                arcToRelative(2.819f, 2.819f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.986f, -3.987f)
                lineTo(3.842f, 16.174f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.83f)
                lineToRelative(-1.32f, 4.352f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.622f, 0.622f)
                lineToRelative(4.353f, -1.32f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, -0.497f)
                close()
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.Pen,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
