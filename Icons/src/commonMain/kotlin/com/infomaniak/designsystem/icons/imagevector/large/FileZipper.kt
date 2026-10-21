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

internal val EsdsIcons.Large.FileZipper: ImageVector
    get() {
        if (_FileZipper != null) {
            return _FileZipper!!
        }
        _FileZipper = ImageVector.Builder(
            name = "Large.FileZipper",
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
                moveTo(13.659f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(8f)
                moveToRelative(0f, 0f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                moveToRelative(6f, 6f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(2f)
                moveToRelative(0f, 0f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(11.5f)
                moveTo(8f, 12f)
                verticalLineToRelative(-1f)
                moveToRelative(0f, 7f)
                verticalLineToRelative(-2f)
                moveToRelative(0f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                moveTo(8f, 7f)
                verticalLineTo(6f)
            }
        }.build()

        return _FileZipper!!
    }

@Suppress("ObjectPropertyName")
private var _FileZipper: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.FileZipper,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
