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

public val EsdsIcons.ExtraLarge.EyeClosed: ImageVector
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
                arcToRelative(10.645f, 10.645f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                moveToRelative(-2f, 7f)
                lineToRelative(-1.726f, -2.05f)
                moveTo(4f, 15f)
                lineToRelative(1.726f, -2.05f)
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
