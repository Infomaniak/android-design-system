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

public val EsdsIcons.Large.CircleInfoFilled: ImageVector
    get() {
        if (_CircleInfoFilled != null) {
            return _CircleInfoFilled!!
        }
        _CircleInfoFilled = ImageVector.Builder(
            name = "Large.CircleInfoFilled",
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
                moveToRelative(0f, 10f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.875f, 0.875f)
                verticalLineToRelative(4f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.875f, -0.875f)
                moveToRelative(0f, -4f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.75f)
                horizontalLineToRelative(0.01f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.75f)
                close()
            }
        }.build()

        return _CircleInfoFilled!!
    }

@Suppress("ObjectPropertyName")
private var _CircleInfoFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.CircleInfoFilled,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
