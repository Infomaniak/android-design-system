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

public val EsdsIcons.Medium.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Medium.Globe",
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
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                moveToRelative(10f, -10f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                moveToRelative(10f, 10f)
                horizontalLineTo(2f)
                moveToRelative(10f, 10f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                moveToRelative(10f, 10f)
                arcToRelative(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -20f)
                moveToRelative(0f, 20f)
                arcToRelative(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -20f)
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.Globe,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
