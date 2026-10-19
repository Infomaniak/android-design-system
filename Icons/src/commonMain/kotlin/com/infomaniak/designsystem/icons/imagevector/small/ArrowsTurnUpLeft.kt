package com.infomaniak.designsystem.icons.imagevector.small

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

public val EsdsIcons.Small.ArrowsTurnUpLeft: ImageVector
    get() {
        if (_ArrowsTurnUpLeft != null) {
            return _ArrowsTurnUpLeft!!
        }
        _ArrowsTurnUpLeft = ImageVector.Builder(
            name = "Small.ArrowsTurnUpLeft",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.95f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(12f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                moveToRelative(-5f, -5f)
                horizontalLineToRelative(11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(2f)
                moveTo(7f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
        }.build()

        return _ArrowsTurnUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsTurnUpLeft: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ArrowsTurnUpLeft,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
