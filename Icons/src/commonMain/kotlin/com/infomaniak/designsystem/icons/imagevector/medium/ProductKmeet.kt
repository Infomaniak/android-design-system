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

internal val EsdsIcons.Medium.ProductKmeet: ImageVector
    get() {
        if (_ProductKmeet != null) {
            return _ProductKmeet!!
        }
        _ProductKmeet = ImageVector.Builder(
            name = "Medium.ProductKmeet",
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
                moveToRelative(8.991f, 2.5f)
                lineToRelative(10.197f, 3.204f)
                curveToRelative(0.528f, 0.166f, 0.887f, 0.656f, 0.887f, 1.209f)
                verticalLineToRelative(9.502f)
                moveTo(16.503f, 7.87f)
                lineTo(5.25f, 4.446f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.326f, 0.965f)
                verticalLineToRelative(9.53f)
                curveToRelative(0f, 0.438f, 0.287f, 0.826f, 0.707f, 0.962f)
                lineToRelative(4.247f, 1.354f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.259f, 0.184f)
                lineToRelative(2.81f, 3.849f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.926f, -0.297f)
                verticalLineToRelative(-2.581f)
                lineToRelative(3.027f, 0.913f)
                quadToRelative(0.148f, 0.043f, 0.3f, 0.043f)
                curveToRelative(0.563f, 0f, 1.024f, -0.452f, 1.024f, -1.01f)
                verticalLineTo(8.835f)
                curveToRelative(0f, -0.443f, -0.294f, -0.835f, -0.722f, -0.968f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.107f, 14.966f)
                curveToRelative(0.05f, -0.021f, 0.079f, -0.073f, 0.079f, -0.14f)
                lineToRelative(0.059f, -3.803f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -0.186f)
                curveToRelative(-0.05f, -0.049f, -0.11f, -0.07f, -0.162f, -0.054f)
                lineToRelative(-2.06f, 0.888f)
                verticalLineToRelative(-1.376f)
                curveToRelative(0f, -0.21f, -0.175f, -0.431f, -0.394f, -0.493f)
                lineTo(7.46f, 8.649f)
                curveToRelative(-0.218f, -0.062f, -0.394f, 0.057f, -0.394f, 0.269f)
                verticalLineToRelative(4.195f)
                curveToRelative(0f, 0.21f, 0.176f, 0.431f, 0.395f, 0.493f)
                lineToRelative(4.09f, 1.153f)
                curveToRelative(0.218f, 0.061f, 0.394f, -0.057f, 0.394f, -0.269f)
                verticalLineToRelative(-1.485f)
                lineToRelative(2f, 1.922f)
                curveToRelative(0.052f, 0.044f, 0.113f, 0.06f, 0.163f, 0.039f)
            }
        }.build()

        return _ProductKmeet!!
    }

@Suppress("ObjectPropertyName")
private var _ProductKmeet: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.ProductKmeet,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
