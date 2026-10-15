package com.infomaniak.designsystem.icons.imagevector.large

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

public val EsdsIcons.Large.ProductKchat: ImageVector
    get() {
        if (_ProductKchat != null) {
            return _ProductKchat!!
        }
        _ProductKchat = ImageVector.Builder(
            name = "Large.ProductKchat",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(8.991f, 2.5f)
                lineToRelative(10.197f, 3.204f)
                curveToRelative(0.528f, 0.166f, 0.887f, 0.656f, 0.887f, 1.209f)
                verticalLineToRelative(9.502f)
                moveTo(7.725f, 9.466f)
                lineToRelative(3.167f, 0.95f)
                moveTo(9.625f, 12.95f)
                lineToRelative(3.167f, 0.95f)
                moveToRelative(3.71f, -6.029f)
                lineTo(5.252f, 4.446f)
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
        }.build()

        return _ProductKchat!!
    }

@Suppress("ObjectPropertyName")
private var _ProductKchat: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ProductKchat,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
