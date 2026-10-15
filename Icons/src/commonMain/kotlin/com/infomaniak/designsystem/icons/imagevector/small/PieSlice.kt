package com.infomaniak.designsystem.icons.imagevector.small

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

public val EsdsIcons.Small.PieSlice: ImageVector
    get() {
        if (_PieSlice != null) {
            return _PieSlice!!
        }
        _PieSlice = ImageVector.Builder(
            name = "Small.PieSlice",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.95f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(21.21f, 15.89f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 2.83f)
                moveTo(21f, 12f)
                curveToRelative(0.552f, 0f, 1.005f, -0.45f, 0.95f, -0.998f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.953f, -8.951f)
                curveToRelative(-0.55f, -0.055f, -0.998f, 0.398f, -0.998f, 0.95f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                close()
            }
        }.build()

        return _PieSlice!!
    }

@Suppress("ObjectPropertyName")
private var _PieSlice: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.PieSlice,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
