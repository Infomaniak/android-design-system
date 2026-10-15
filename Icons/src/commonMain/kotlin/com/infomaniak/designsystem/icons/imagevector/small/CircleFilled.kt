package com.infomaniak.designsystem.icons.imagevector.small

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

public val EsdsIcons.Small.CircleFilled: ImageVector
    get() {
        if (_CircleFilled != null) {
            return _CircleFilled!!
        }
        _CircleFilled = ImageVector.Builder(
            name = "Small.CircleFilled",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.125f)
                curveToRelative(6.006f, 0f, 10.875f, 4.869f, 10.875f, 10.875f)
                reflectiveCurveTo(18.006f, 22.875f, 12f, 22.875f)
                reflectiveCurveTo(1.125f, 18.006f, 1.125f, 12f)
                reflectiveCurveTo(5.994f, 1.125f, 12f, 1.125f)
            }
        }.build()

        return _CircleFilled!!
    }

@Suppress("ObjectPropertyName")
private var _CircleFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.CircleFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
