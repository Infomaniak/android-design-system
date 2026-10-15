package com.infomaniak.designsystem.icons.imagevector.xsmall

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

public val EsdsIcons.XSmall.ArrowTurnUpRight: ImageVector
    get() {
        if (_ArrowTurnUpRight != null) {
            return _ArrowTurnUpRight!!
        }
        _ArrowTurnUpRight = ImageVector.Builder(
            name = "XSmall.ArrowTurnUpRight",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(15f, 7f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
                moveToRelative(5f, -5f)
                horizontalLineTo(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(2f)
            }
        }.build()

        return _ArrowTurnUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnUpRight: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.ArrowTurnUpRight,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
