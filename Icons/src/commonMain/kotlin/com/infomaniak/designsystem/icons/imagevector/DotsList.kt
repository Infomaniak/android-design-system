package com.infomaniak.designsystem.icons.imagevector

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

public val EsdsIcons.DotsList: ImageVector
    get() {
        if (_DotsList != null) {
            return _DotsList!!
        }
        _DotsList = ImageVector.Builder(
            name = "DotsList",
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
                moveTo(3f, 5f)
                horizontalLineToRelative(0.01f)
                moveTo(3f, 12f)
                horizontalLineToRelative(0.01f)
                moveTo(3f, 19f)
                horizontalLineToRelative(0.01f)
                moveTo(8f, 5f)
                horizontalLineToRelative(13f)
                moveTo(8f, 12f)
                horizontalLineToRelative(13f)
                moveTo(8f, 19f)
                horizontalLineToRelative(13f)
            }
        }.build()

        return _DotsList!!
    }

@Suppress("ObjectPropertyName")
private var _DotsList: ImageVector? = null

@Preview
@Composable
private fun preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.DotsList,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
