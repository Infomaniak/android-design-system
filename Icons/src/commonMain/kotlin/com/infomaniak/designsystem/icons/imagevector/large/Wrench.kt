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

internal val EsdsIcons.Large.Wrench: ImageVector
    get() {
        if (_Wrench != null) {
            return _Wrench!!
        }
        _Wrench = ImageVector.Builder(
            name = "Large.Wrench",
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
                moveTo(14.7f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.4f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 0f)
                lineToRelative(3.106f, -3.105f)
                curveToRelative(0.32f, -0.322f, 0.863f, -0.22f, 0.983f, 0.218f)
                arcToRelative(6.001f, 6.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.259f, 7.057f)
                lineToRelative(-7.91f, 7.91f)
                arcToRelative(2.121f, 2.121f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.999f, -3f)
                lineToRelative(7.91f, -7.91f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.057f, -8.259f)
                curveToRelative(0.438f, 0.12f, 0.54f, 0.662f, 0.219f, 0.984f)
                close()
            }
        }.build()

        return _Wrench!!
    }

@Suppress("ObjectPropertyName")
private var _Wrench: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.Wrench,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
