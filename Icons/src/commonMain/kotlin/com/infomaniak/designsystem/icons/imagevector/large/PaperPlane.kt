package com.infomaniak.designsystem.icons.imagevector.large

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

internal val EsdsIcons.Large.PaperPlane: ImageVector
    get() {
        if (_PaperPlane != null) {
            return _PaperPlane!!
        }
        _PaperPlane = ImageVector.Builder(
            name = "Large.PaperPlane",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(10.914f, 13.085f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, -0.44f)
                lineToRelative(-7.93f, -3.18f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.024f, -0.938f)
                lineToRelative(19f, -6.5f)
                arcToRelative(0.496f, 0.496f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.635f, 0.635f)
                lineToRelative(-6.5f, 19f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.937f, 0.024f)
                lineToRelative(-3.18f, -7.932f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.442f, -0.669f)
                moveToRelative(0f, 0f)
                lineToRelative(10.94f, -10.938f)
            }
        }.build()

        return _PaperPlane!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlane: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.PaperPlane,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
