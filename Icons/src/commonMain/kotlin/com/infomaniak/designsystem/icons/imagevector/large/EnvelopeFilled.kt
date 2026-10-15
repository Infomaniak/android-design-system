package com.infomaniak.designsystem.icons.imagevector.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.Large.EnvelopeFilled: ImageVector
    get() {
        if (_EnvelopeFilled != null) {
            return _EnvelopeFilled!!
        }
        _EnvelopeFilled = ImageVector.Builder(
            name = "Large.EnvelopeFilled",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.53f, 13.465f)
                lineToRelative(0.03f, 0.018f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, -0.018f)
                lineToRelative(9.388f, -5.98f)
                verticalLineToRelative(10.569f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.8f, 2.8f)
                horizontalLineTo(3.928f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.801f, -2.8f)
                verticalLineTo(7.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.068f, 3.146f)
                curveToRelative(1.374f, 0f, 2.514f, 0.99f, 2.752f, 2.294f)
                lineToRelative(-10.26f, 6.535f)
                arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.116f, -0.003f)
                lineTo(1.176f, 5.438f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.752f, -2.292f)
                close()
            }
        }.build()

        return _EnvelopeFilled!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.EnvelopeFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
