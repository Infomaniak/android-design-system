package com.infomaniak.designsystem.icons.imagevector

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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.CalendarDots: ImageVector
    get() {
        if (_CalendarDots != null) {
            return _CalendarDots!!
        }
        _CalendarDots = ImageVector.Builder(
            name = "CalendarDots",
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
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(8f, -4f)
                verticalLineToRelative(4f)
                moveTo(3f, 10f)
                horizontalLineToRelative(18f)
                moveTo(8f, 14f)
                horizontalLineToRelative(0.01f)
                moveTo(12f, 14f)
                horizontalLineToRelative(0.01f)
                moveTo(16f, 14f)
                horizontalLineToRelative(0.01f)
                moveTo(8f, 18f)
                horizontalLineToRelative(0.01f)
                moveTo(12f, 18f)
                horizontalLineToRelative(0.01f)
                moveTo(16f, 18f)
                horizontalLineToRelative(0.01f)
                moveTo(5f, 4f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
            }
        }.build()

        return _CalendarDots!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDots: ImageVector? = null

@Preview
@Composable
private fun preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.CalendarDots,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
