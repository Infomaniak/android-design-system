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

public val EsdsIcons.Small.Heading2: ImageVector
    get() {
        if (_Heading2 != null) {
            return _Heading2!!
        }
        _Heading2 = ImageVector.Builder(
            name = "Small.Heading2",
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
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 6f)
                verticalLineTo(6f)
                moveToRelative(8f, 12f)
                verticalLineTo(6f)
                moveToRelative(9f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -4f, 4f, -3f, 4f, -6f)
                curveToRelative(0f, -1.5f, -2f, -2.5f, -4f, -1f)
            }
        }.build()

        return _Heading2!!
    }

@Suppress("ObjectPropertyName")
private var _Heading2: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.Heading2,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
