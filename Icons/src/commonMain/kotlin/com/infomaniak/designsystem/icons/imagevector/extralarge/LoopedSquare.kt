package com.infomaniak.designsystem.icons.imagevector.extralarge

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

public val EsdsIcons.ExtraLarge.LoopedSquare: ImageVector
    get() {
        if (_LoopedSquare != null) {
            return _LoopedSquare!!
        }
        _LoopedSquare = ImageVector.Builder(
            name = "ExtraLarge.LoopedSquare",
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
                moveTo(15f, 9f)
                lineTo(15f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(15f, 9f)
                verticalLineToRelative(6f)
                moveToRelative(0f, -6f)
                lineTo(9f, 9f)
                moveToRelative(6f, 6f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3f)
                close()
                moveTo(15f, 15f)
                lineTo(9f, 15f)
                moveToRelative(0f, 0f)
                lineTo(6f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                close()
                moveTo(9f, 15f)
                lineTo(9f, 9f)
                moveToRelative(0f, 0f)
                lineTo(9f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 3f)
                close()
            }
        }.build()

        return _LoopedSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LoopedSquare: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.LoopedSquare,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
