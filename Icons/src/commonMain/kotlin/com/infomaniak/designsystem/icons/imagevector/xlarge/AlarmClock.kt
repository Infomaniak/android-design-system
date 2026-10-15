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

public val EsdsIcons.XLarge.AlarmClock: ImageVector
    get() {
        if (_AlarmClock != null) {
            return _AlarmClock!!
        }
        _AlarmClock = ImageVector.Builder(
            name = "XLarge.AlarmClock",
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
                moveTo(12f, 9f)
                verticalLineToRelative(4f)
                lineToRelative(2f, 2f)
                moveTo(5f, 3f)
                lineTo(2f, 6f)
                moveToRelative(20f, 0f)
                lineToRelative(-3f, -3f)
                moveTo(6.38f, 18.7f)
                lineTo(4f, 21f)
                moveToRelative(13.64f, -2.33f)
                lineTo(20f, 21f)
                moveToRelative(0f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
        }.build()

        return _AlarmClock!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClock: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.AlarmClock,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
