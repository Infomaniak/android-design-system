package com.infomaniak.designsystem.icons.imagevector.xlarge

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

public val EsdsIcons.XLarge.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "XLarge.Broom",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.35f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(16f, 22f)
                lineToRelative(-1f, -4f)
                moveToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                moveToRelative(14f, 0f)
                horizontalLineTo(5f)
                moveToRelative(14f, 0f)
                lineToRelative(1.973f, 6.767f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.973f, -1.233f)
                lineTo(5f, 14f)
                moveToRelative(3f, 8f)
                lineToRelative(1f, -4f)
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.Broom,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
