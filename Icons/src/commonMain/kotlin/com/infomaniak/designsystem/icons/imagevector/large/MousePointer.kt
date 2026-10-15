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

public val EsdsIcons.Large.MousePointer: ImageVector
    get() {
        if (_MousePointer != null) {
            return _MousePointer!!
        }
        _MousePointer = ImageVector.Builder(
            name = "Large.MousePointer",
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
                moveTo(4.037f, 4.688f)
                arcToRelative(0.495f, 0.495f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.651f, -0.651f)
                lineToRelative(16f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.063f, 0.947f)
                lineToRelative(-6.124f, 1.58f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.438f, 1.435f)
                lineToRelative(-1.579f, 6.126f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.947f, 0.063f)
                close()
            }
        }.build()

        return _MousePointer!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointer: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.MousePointer,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
