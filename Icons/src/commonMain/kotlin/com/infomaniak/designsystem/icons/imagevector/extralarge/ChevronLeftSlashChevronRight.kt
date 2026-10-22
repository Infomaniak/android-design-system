package com.infomaniak.designsystem.icons.imagevector.extralarge

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

internal val EsdsIcons.ExtraLarge.ChevronLeftSlashChevronRight: ImageVector
    get() {
        if (_ChevronLeftSlashChevronRight != null) {
            return _ChevronLeftSlashChevronRight!!
        }
        _ChevronLeftSlashChevronRight = ImageVector.Builder(
            name = "ExtraLarge.ChevronLeftSlashChevronRight",
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
                moveToRelative(18f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                moveTo(6f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                moveToRelative(8.5f, -12f)
                lineToRelative(-5f, 16f)
            }
        }.build()

        return _ChevronLeftSlashChevronRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftSlashChevronRight: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.ChevronLeftSlashChevronRight,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
