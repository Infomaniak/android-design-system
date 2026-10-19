package com.infomaniak.designsystem.icons.imagevector.medium

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

public val EsdsIcons.Medium.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) {
            return _Lightbulb!!
        }
        _Lightbulb = ImageVector.Builder(
            name = "Medium.Lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.75f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(15f, 14f)
                curveToRelative(0.2f, -1f, 0.7f, -1.7f, 1.5f, -2.5f)
                curveToRelative(1f, -0.9f, 1.5f, -2.2f, 1.5f, -3.5f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 8f)
                curveToRelative(0f, 1f, 0.2f, 2.2f, 1.5f, 3.5f)
                curveToRelative(0.7f, 0.7f, 1.3f, 1.5f, 1.5f, 2.5f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(6f)
                moveToRelative(-5f, 4f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _Lightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.Lightbulb,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
