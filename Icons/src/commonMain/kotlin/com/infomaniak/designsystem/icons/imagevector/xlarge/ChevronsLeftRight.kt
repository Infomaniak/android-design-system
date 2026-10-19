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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XLarge.ChevronsLeftRight: ImageVector
    get() {
        if (_ChevronsLeftRight != null) {
            return _ChevronsLeftRight!!
        }
        _ChevronsLeftRight = ImageVector.Builder(
            name = "XLarge.ChevronsLeftRight",
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
                moveToRelative(9f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                moveToRelative(6f, -10f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
            }
        }.build()

        return _ChevronsLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsLeftRight: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.ChevronsLeftRight,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
