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

internal val EsdsIcons.Large.LinkBroken: ImageVector
    get() {
        if (_LinkBroken != null) {
            return _LinkBroken!!
        }
        _LinkBroken = ImageVector.Builder(
            name = "Large.LinkBroken",
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
                moveToRelative(18.84f, 12.25f)
                lineToRelative(1.72f, -1.71f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(5.004f, 5.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, -7.07f)
                arcToRelative(5.006f, 5.006f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.95f, 0f)
                lineToRelative(-1.72f, 1.71f)
                moveToRelative(-6.58f, 6.57f)
                lineToRelative(-1.71f, 1.71f)
                arcToRelative(5.004f, 5.004f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 7.07f)
                arcToRelative(5.006f, 5.006f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 0f)
                lineToRelative(1.71f, -1.71f)
                moveTo(8f, 2f)
                verticalLineToRelative(3f)
                moveTo(2f, 8f)
                horizontalLineToRelative(3f)
                moveToRelative(11f, 11f)
                verticalLineToRelative(3f)
                moveToRelative(3f, -6f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _LinkBroken!!
    }

@Suppress("ObjectPropertyName")
private var _LinkBroken: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.LinkBroken,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
