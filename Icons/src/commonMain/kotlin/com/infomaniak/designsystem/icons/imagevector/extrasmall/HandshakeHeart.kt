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

internal val EsdsIcons.ExtraSmall.HandshakeHeart: ImageVector
    get() {
        if (_HandshakeHeart != null) {
            return _HandshakeHeart!!
        }
        _HandshakeHeart = ImageVector.Builder(
            name = "ExtraSmall.HandshakeHeart",
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
                moveTo(12.409f, 5.824f)
                lineTo(9.586f, 8.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.828f, 2.828f)
                lineToRelative(1.71f, -1.71f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.409f, 0f)
                lineToRelative(1.881f, 1.882f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.828f)
                curveTo(21f, 12.828f, 22f, 11.5f, 22f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.591f, -3.676f)
                moveToRelative(7.005f, 8.59f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.927f, 0.074f)
                moveTo(12.41f, 5.824f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.5f)
                curveToRelative(0f, 2.3f, 1.5f, 4f, 3f, 5.5f)
                lineToRelative(5.535f, 5.362f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.879f, 0.052f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.072f, -2.92f)
                moveToRelative(0f, 0f)
                close()
                moveTo(13.486f, 17.494f)
                arcToRelative(2.124f, 2.124f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.001f, -3.006f)
                moveToRelative(0f, 0f)
                close()
            }
        }.build()

        return _HandshakeHeart!!
    }

@Suppress("ObjectPropertyName")
private var _HandshakeHeart: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.HandshakeHeart,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
