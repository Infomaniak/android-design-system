package com.infomaniak.designsystem.icons.imagevector.xsmall

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

public val EsdsIcons.XSmall.ProductMail: ImageVector
    get() {
        if (_ProductMail != null) {
            return _ProductMail!!
        }
        _ProductMail = ImageVector.Builder(
            name = "XSmall.ProductMail",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(3.505f, 5.196f)
                lineToRelative(14.052f, 3.875f)
                moveTo(6.449f, 2.5f)
                lineToRelative(13.729f, 3.725f)
                curveToRelative(0.569f, 0.154f, 0.964f, 0.67f, 0.964f, 1.26f)
                verticalLineToRelative(12.32f)
                moveTo(2.86f, 6.102f)
                verticalLineToRelative(10.501f)
                curveToRelative(0f, 0.49f, 0.332f, 0.924f, 0.815f, 1.067f)
                lineToRelative(12.708f, 3.779f)
                quadToRelative(0.173f, 0.051f, 0.34f, 0.051f)
                curveToRelative(0.616f, 0f, 1.153f, -0.482f, 1.153f, -1.118f)
                verticalLineTo(9.881f)
                curveToRelative(0f, -0.337f, -0.159f, -0.645f, -0.413f, -0.85f)
                lineToRelative(-7.14f, 6.146f)
                arcToRelative(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.765f, 0.282f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.028f, -0.604f)
                lineToRelative(-5.159f, -9.68f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.514f, 0.93f)
                close()
            }
        }.build()

        return _ProductMail!!
    }

@Suppress("ObjectPropertyName")
private var _ProductMail: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.ProductMail,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
