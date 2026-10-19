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

public val EsdsIcons.ExtraLarge.ListMagnifyingGlass: ImageVector
    get() {
        if (_ListMagnifyingGlass != null) {
            return _ListMagnifyingGlass!!
        }
        _ListMagnifyingGlass = ImageVector.Builder(
            name = "ExtraLarge.ListMagnifyingGlass",
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
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                moveToRelative(7f, 7f)
                horizontalLineTo(3f)
                moveToRelative(7f, 7f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                lineToRelative(-1.9f, -1.9f)
                moveTo(20f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
        }.build()

        return _ListMagnifyingGlass!!
    }

@Suppress("ObjectPropertyName")
private var _ListMagnifyingGlass: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.ListMagnifyingGlass,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
