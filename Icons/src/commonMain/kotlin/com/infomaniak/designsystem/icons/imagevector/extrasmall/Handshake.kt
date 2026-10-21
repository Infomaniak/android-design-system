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

internal val EsdsIcons.ExtraSmall.Handshake: ImageVector
    get() {
        if (_Handshake != null) {
            return _Handshake!!
        }
        _Handshake = ImageVector.Builder(
            name = "ExtraSmall.Handshake",
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
                moveToRelative(11f, 17f)
                lineToRelative(2f, 2f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3f)
                moveToRelative(-2f, -2f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(2.121f, 2.121f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineToRelative(-3.88f, -3.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-0.88f, 0.88f)
                arcToRelative(2.121f, 2.121f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineToRelative(2.81f, -2.81f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.06f, -0.87f)
                lineToRelative(0.47f, 0.28f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0.25f)
                lineTo(21f, 4f)
                moveToRelative(0f, -1f)
                lineToRelative(1f, 11f)
                horizontalLineToRelative(-2f)
                moveTo(3f, 3f)
                lineTo(2f, 14f)
                lineToRelative(6.5f, 6.5f)
                arcToRelative(2.121f, 2.121f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                moveTo(3f, 4f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _Handshake!!
    }

@Suppress("ObjectPropertyName")
private var _Handshake: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.Handshake,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
