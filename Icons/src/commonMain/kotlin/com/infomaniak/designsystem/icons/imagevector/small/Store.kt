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

internal val EsdsIcons.Small.Store: ImageVector
    get() {
        if (_Store != null) {
            return _Store!!
        }
        _Store = ImageVector.Builder(
            name = "Small.Store",
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
                moveTo(15f, 21f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                moveToRelative(8.774f, -10.69f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.451f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.548f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.452f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.77f, -3.248f)
                lineToRelative(2.889f, -4.184f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.653f, 0.873f)
                lineToRelative(2.895f, 4.192f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.774f, 3.244f)
                moveTo(4f, 10.95f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-8.05f)
            }
        }.build()

        return _Store!!
    }

@Suppress("ObjectPropertyName")
private var _Store: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.Store,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
