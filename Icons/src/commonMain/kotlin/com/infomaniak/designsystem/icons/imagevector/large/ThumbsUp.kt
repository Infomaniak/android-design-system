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

public val EsdsIcons.Large.ThumbsUp: ImageVector
    get() {
        if (_ThumbsUp != null) {
            return _ThumbsUp!!
        }
        _ThumbsUp = ImageVector.Builder(
            name = "Large.ThumbsUp",
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
                moveTo(7f, 10f)
                verticalLineToRelative(12f)
                moveToRelative(8f, -16.12f)
                lineTo(14f, 10f)
                horizontalLineToRelative(5.83f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.92f, 2.56f)
                lineToRelative(-2.33f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(2.76f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -1.11f)
                lineTo(12f, 2f)
                arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3.88f)
            }
        }.build()

        return _ThumbsUp!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsUp: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ThumbsUp,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
