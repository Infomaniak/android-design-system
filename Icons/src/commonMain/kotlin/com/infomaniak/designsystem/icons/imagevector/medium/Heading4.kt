package com.infomaniak.designsystem.icons.imagevector.medium

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

public val EsdsIcons.Medium.Heading4: ImageVector
    get() {
        if (_Heading4 != null) {
            return _Heading4!!
        }
        _Heading4 = ImageVector.Builder(
            name = "Medium.Heading4",
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
                moveTo(12f, 18f)
                verticalLineTo(6f)
                moveToRelative(5f, 4f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(3f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(8f)
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 6f)
                verticalLineTo(6f)
            }
        }.build()

        return _Heading4!!
    }

@Suppress("ObjectPropertyName")
private var _Heading4: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.Heading4,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
