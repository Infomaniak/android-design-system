package com.infomaniak.designsystem.icons.imagevector.medium

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

internal val EsdsIcons.Medium.ToolCase: ImageVector
    get() {
        if (_ToolCase != null) {
            return _ToolCase!!
        }
        _ToolCase = ImageVector.Builder(
            name = "Medium.ToolCase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.75f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                moveToRelative(0.817f, -4.005f)
                lineToRelative(-0.971f, -1.45f)
                lineToRelative(1.034f, -1.232f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.025f, -3.238f)
                lineToRelative(-1.82f, 0.364f)
                lineTo(9.91f, 3.885f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.625f, 0.748f)
                lineTo(6.141f, 6.55f)
                lineToRelative(-1.725f, 0.426f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.19f, 3.756f)
                lineToRelative(0.657f, 0.27f)
                moveToRelative(13.939f, -0.007f)
                lineToRelative(2.26f, -5.38f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.557f, -1.318f)
                lineTo(16.954f, 2.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.281f, 0.533f)
                lineToRelative(-0.924f, 2.122f)
                moveTo(4f, 12.006f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.994f, 11f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()

        return _ToolCase!!
    }

@Suppress("ObjectPropertyName")
private var _ToolCase: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.ToolCase,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
