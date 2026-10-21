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

internal val EsdsIcons.ExtraLarge.IsoCube: ImageVector
    get() {
        if (_IsoCube != null) {
            return _IsoCube!!
        }
        _IsoCube = ImageVector.Builder(
            name = "ExtraLarge.IsoCube",
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
                moveToRelative(3.3f, 7f)
                lineToRelative(8.7f, 5f)
                moveToRelative(0f, 0f)
                lineToRelative(8.7f, -5f)
                moveTo(12f, 12f)
                verticalLineToRelative(10f)
                moveToRelative(9f, -14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1.73f)
                lineToRelative(7f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineToRelative(7f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                close()
            }
        }.build()

        return _IsoCube!!
    }

@Suppress("ObjectPropertyName")
private var _IsoCube: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.ExtraLarge.IsoCube,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
