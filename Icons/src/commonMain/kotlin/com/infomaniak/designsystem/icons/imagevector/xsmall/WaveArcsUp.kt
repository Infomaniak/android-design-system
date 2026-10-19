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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XSmall.WaveArcsUp: ImageVector
    get() {
        if (_WaveArcsUp != null) {
            return _WaveArcsUp!!
        }
        _WaveArcsUp = ImageVector.Builder(
            name = "XSmall.WaveArcsUp",
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
                moveTo(12f, 20f)
                horizontalLineToRelative(0.01f)
                moveTo(2f, 8.82f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 0f)
                moveTo(5f, 12.86f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                moveTo(8.5f, 16.43f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
            }
        }.build()

        return _WaveArcsUp!!
    }

@Suppress("ObjectPropertyName")
private var _WaveArcsUp: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.WaveArcsUp,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
