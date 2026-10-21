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
import com.infomaniak.designsystem.icons.PreviewIconSize

internal val EsdsIcons.Small.ListFilter: ImageVector
    get() {
        if (_ListFilter != null) {
            return _ListFilter!!
        }
        _ListFilter = ImageVector.Builder(
            name = "Small.ListFilter",
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
                moveTo(2f, 5f)
                horizontalLineToRelative(20f)
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
                moveToRelative(-9f, 7f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _ListFilter!!
    }

@Suppress("ObjectPropertyName")
private var _ListFilter: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.ListFilter,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
