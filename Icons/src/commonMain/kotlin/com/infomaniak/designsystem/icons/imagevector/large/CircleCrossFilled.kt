package com.infomaniak.designsystem.icons.imagevector.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.Large.CircleCrossFilled: ImageVector
    get() {
        if (_CircleCrossFilled != null) {
            return _CircleCrossFilled!!
        }
        _CircleCrossFilled = ImageVector.Builder(
            name = "Large.CircleCrossFilled",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.125f)
                curveToRelative(6.006f, 0f, 10.875f, 4.869f, 10.875f, 10.875f)
                reflectiveCurveTo(18.006f, 22.875f, 12f, 22.875f)
                reflectiveCurveTo(1.125f, 18.006f, 1.125f, 12f)
                reflectiveCurveTo(5.994f, 1.125f, 12f, 1.125f)
                moveToRelative(3.62f, 7.256f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.24f, 0f)
                lineTo(12f, 10.76f)
                lineTo(9.62f, 8.38f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.24f, 1.238f)
                lineTo(10.763f, 12f)
                lineTo(8.38f, 14.38f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.238f, 1.24f)
                lineTo(12f, 13.237f)
                lineToRelative(2.38f, 2.381f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.24f, -1.238f)
                lineTo(13.237f, 12f)
                lineToRelative(2.381f, -2.38f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.24f)
            }
        }.build()

        return _CircleCrossFilled!!
    }

@Suppress("ObjectPropertyName")
private var _CircleCrossFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.CircleCrossFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
