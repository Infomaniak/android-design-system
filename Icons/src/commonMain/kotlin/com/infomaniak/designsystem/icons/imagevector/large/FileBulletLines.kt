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

internal val EsdsIcons.Large.FileBulletLines: ImageVector
    get() {
        if (_FileBulletLines != null) {
            return _FileBulletLines!!
        }
        _FileBulletLines = ImageVector.Builder(
            name = "Large.FileBulletLines",
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
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(8f)
                moveToRelative(-6f, -6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.704f, 0.706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                moveToRelative(-6f, -6f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(5f)
                moveTo(8f, 13f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-8f, 4f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
            }
        }.build()

        return _FileBulletLines!!
    }

@Suppress("ObjectPropertyName")
private var _FileBulletLines: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.FileBulletLines,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
