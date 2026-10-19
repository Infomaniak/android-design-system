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

public val EsdsIcons.XLarge.SquareSplitTop: ImageVector
    get() {
        if (_SquareSplitTop != null) {
            return _SquareSplitTop!!
        }
        _SquareSplitTop = ImageVector.Builder(
            name = "XLarge.SquareSplitTop",
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
                moveTo(9f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(6f, -6f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(4f)
                moveTo(9f, 3f)
                verticalLineToRelative(6f)
                moveTo(3f, 9f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(4f)
                moveTo(3f, 9f)
                horizontalLineToRelative(6f)
                moveToRelative(12f, 0f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(9f)
                moveTo(21f, 9f)
                horizontalLineTo(9f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _SquareSplitTop!!
    }

@Suppress("ObjectPropertyName")
private var _SquareSplitTop: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.SquareSplitTop,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
