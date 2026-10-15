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

public val EsdsIcons.XLarge.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) {
            return _MagnifyingGlassMinus!!
        }
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "XLarge.MagnifyingGlassMinus",
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
                moveToRelative(21f, 21f)
                lineToRelative(-4.35f, -4.35f)
                moveTo(8f, 11f)
                horizontalLineToRelative(6f)
                moveToRelative(5f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
        }.build()

        return _MagnifyingGlassMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassMinus: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.MagnifyingGlassMinus,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
