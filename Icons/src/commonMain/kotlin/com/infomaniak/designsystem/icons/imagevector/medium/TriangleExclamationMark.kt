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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Medium.TriangleExclamationMark: ImageVector
    get() {
        if (_TriangleExclamationMark != null) {
            return _TriangleExclamationMark!!
        }
        _TriangleExclamationMark = ImageVector.Builder(
            name = "Medium.TriangleExclamationMark",
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
                moveTo(12f, 9f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(0.01f)
                moveToRelative(9.72f, 1f)
                lineToRelative(-8f, -14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.48f, 0f)
                lineToRelative(-8f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -3f)
            }
        }.build()

        return _TriangleExclamationMark!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleExclamationMark: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.TriangleExclamationMark,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
