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

internal val EsdsIcons.ExtraLarge.EyeClosed: ImageVector
    get() {
        if (_EyeClosed != null) {
            return _EyeClosed!!
        }
        _EyeClosed = ImageVector.Builder(
            name = "ExtraLarge.EyeClosed",
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
                moveToRelative(15f, 18f)
                lineToRelative(-0.722f, -3.25f)
                moveTo(2f, 8f)
                arcToRelative(10.65f, 10.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.726f, 4.95f)
                moveToRelative(0f, 0f)
                quadToRelative(0.085f, 0.063f, 0.172f, 0.123f)
                arcToRelative(10.645f, 10.645f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.376f, -0.123f)
                moveToRelative(-12.548f, 0f)
                lineTo(4f, 15f)
                moveToRelative(1.726f, -2.05f)
                close()
                moveTo(18.274f, 12.95f)
                arcTo(10.65f, 10.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8f)
                moveToRelative(-3.726f, 4.95f)
                lineTo(20f, 15f)
                moveToRelative(-1.726f, -2.05f)
                close()
                moveTo(9f, 18f)
                lineToRelative(0.722f, -3.25f)
            }
        }.build()

        return _EyeClosed!!
    }

@Suppress("ObjectPropertyName")
private var _EyeClosed: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.EyeClosed,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
