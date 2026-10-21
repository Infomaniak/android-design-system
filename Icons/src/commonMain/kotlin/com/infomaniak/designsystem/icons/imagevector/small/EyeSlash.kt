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

internal val EsdsIcons.Small.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) {
            return _EyeSlash!!
        }
        _EyeSlash = ImageVector.Builder(
            name = "Small.EyeSlash",
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
                moveTo(10.733f, 5.076f)
                arcToRelative(10.744f, 10.744f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.205f, 6.575f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.696f)
                arcToRelative(10.8f, 10.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.444f, 2.49f)
                moveToRelative(-6.41f, -0.679f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.242f, -4.242f)
                moveToRelative(7.637f, 7.583f)
                arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.417f, -5.151f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.696f)
                arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.446f, -5.143f)
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()

        return _EyeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlash: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.EyeSlash,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
