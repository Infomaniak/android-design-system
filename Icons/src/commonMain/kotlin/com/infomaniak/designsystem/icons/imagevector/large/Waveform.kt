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

internal val EsdsIcons.Large.Waveform: ImageVector
    get() {
        if (_Waveform != null) {
            return _Waveform!!
        }
        _Waveform = ImageVector.Builder(
            name = "Large.Waveform",
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
                moveTo(2f, 10f)
                verticalLineToRelative(3f)
                moveToRelative(4f, -7f)
                verticalLineToRelative(11f)
                moveToRelative(4f, -14f)
                verticalLineToRelative(18f)
                moveToRelative(4f, -13f)
                verticalLineToRelative(7f)
                moveToRelative(4f, -10f)
                verticalLineToRelative(13f)
                moveToRelative(4f, -8f)
                verticalLineToRelative(3f)
            }
        }.build()

        return _Waveform!!
    }

@Suppress("ObjectPropertyName")
private var _Waveform: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.Waveform,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
