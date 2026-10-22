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

internal val EsdsIcons.Small.CircleQuestionFilled: ImageVector
    get() {
        if (_CircleQuestionFilled != null) {
            return _CircleQuestionFilled!!
        }
        _CircleQuestionFilled = ImageVector.Builder(
            name = "Small.CircleQuestionFilled",
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
                moveToRelative(0f, 15f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.75f)
                horizontalLineToRelative(0.01f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.75f)
                close()
                moveTo(12.575f, 6.175f)
                arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.31f, 2.534f)
                arcToRelative(0.876f, 0.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.65f, 0.581f)
                arcToRelative(2.127f, 2.127f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.63f, -0.663f)
                curveToRelative(0.324f, 0.384f, 0.5f, 0.87f, 0.5f, 1.371f)
                lineTo(14.045f, 10f)
                curveToRelative(0f, 0.535f, -0.414f, 1.057f, -1.11f, 1.521f)
                arcToRelative(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.198f, 0.614f)
                lineToRelative(-0.077f, 0.028f)
                lineToRelative(-0.016f, 0.006f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.554f, 1.661f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.004f, -0.003f)
                lineToRelative(0.01f, -0.003f)
                lineToRelative(0.034f, -0.011f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.497f, -0.202f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.161f, -0.634f)
                curveToRelative(0.753f, -0.501f, 1.755f, -1.392f, 1.877f, -2.708f)
                lineToRelative(0.013f, -0.269f)
                arcToRelative(3.876f, 3.876f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.22f, -3.824f)
            }
        }.build()

        return _CircleQuestionFilled!!
    }

@Suppress("ObjectPropertyName")
private var _CircleQuestionFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.CircleQuestionFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
