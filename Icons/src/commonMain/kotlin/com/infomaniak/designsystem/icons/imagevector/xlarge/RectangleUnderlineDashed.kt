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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XLarge.RectangleUnderlineDashed: ImageVector
    get() {
        if (_RectangleUnderlineDashed != null) {
            return _RectangleUnderlineDashed!!
        }
        _RectangleUnderlineDashed = ImageVector.Builder(
            name = "XLarge.RectangleUnderlineDashed",
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
                moveTo(4f, 21f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1f)
                moveTo(5f, 3f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
            }
        }.build()

        return _RectangleUnderlineDashed!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleUnderlineDashed: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.RectangleUnderlineDashed,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
