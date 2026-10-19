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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Large.CircleCheckFilled: ImageVector
    get() {
        if (_CircleCheckFilled != null) {
            return _CircleCheckFilled!!
        }
        _CircleCheckFilled = ImageVector.Builder(
            name = "Large.CircleCheckFilled",
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
                moveToRelative(5.028f, 7.316f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.238f, 0f)
                lineToRelative(-5.26f, 5.26f)
                lineToRelative(-2.32f, -2.32f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.238f, 1.238f)
                lineToRelative(2.94f, 2.94f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.237f, 0f)
                lineToRelative(5.88f, -5.88f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.238f)
            }
        }.build()

        return _CircleCheckFilled!!
    }

@Suppress("ObjectPropertyName")
private var _CircleCheckFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.CircleCheckFilled,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
