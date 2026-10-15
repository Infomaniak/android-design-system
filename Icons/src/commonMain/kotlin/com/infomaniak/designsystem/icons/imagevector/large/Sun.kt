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

public val EsdsIcons.Large.Sun: ImageVector
    get() {
        if (_Sun != null) {
            return _Sun!!
        }
        _Sun = ImageVector.Builder(
            name = "Large.Sun",
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
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 16f)
                verticalLineToRelative(2f)
                moveTo(4.93f, 4.93f)
                lineToRelative(1.41f, 1.41f)
                moveToRelative(11.32f, 11.32f)
                lineToRelative(1.41f, 1.41f)
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
                moveToRelative(16f, 0f)
                horizontalLineToRelative(2f)
                moveTo(6.34f, 17.66f)
                lineToRelative(-1.41f, 1.41f)
                moveTo(19.07f, 4.93f)
                lineToRelative(-1.41f, 1.41f)
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            }
        }.build()

        return _Sun!!
    }

@Suppress("ObjectPropertyName")
private var _Sun: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.Sun,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
