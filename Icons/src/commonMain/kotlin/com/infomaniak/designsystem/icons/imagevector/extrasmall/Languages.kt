package com.infomaniak.designsystem.icons.imagevector.extrasmall

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

internal val EsdsIcons.ExtraSmall.Languages: ImageVector
    get() {
        if (_Languages != null) {
            return _Languages!!
        }
        _Languages = ImageVector.Builder(
            name = "ExtraSmall.Languages",
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
                moveToRelative(5f, 8f)
                lineToRelative(6f, 6f)
                moveToRelative(-7f, 0f)
                lineToRelative(6f, -6f)
                lineToRelative(2f, -3f)
                moveTo(2f, 5f)
                horizontalLineToRelative(12f)
                moveTo(7f, 2f)
                horizontalLineToRelative(1f)
                moveToRelative(14f, 20f)
                lineToRelative(-5f, -10f)
                lineToRelative(-5f, 10f)
                moveToRelative(2f, -4f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _Languages!!
    }

@Suppress("ObjectPropertyName")
private var _Languages: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraSmall.Languages,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
