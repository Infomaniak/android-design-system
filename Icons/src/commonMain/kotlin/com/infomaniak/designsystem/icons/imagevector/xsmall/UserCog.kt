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
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.XSmall.UserCog: ImageVector
    get() {
        if (_UserCog != null) {
            return _UserCog!!
        }
        _UserCog = ImageVector.Builder(
            name = "XSmall.UserCog",
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
                moveTo(8f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(2f)
                moveToRelative(9.13f, -2.182f)
                lineToRelative(1.214f, -0.503f)
                moveToRelative(0f, -3.021f)
                lineToRelative(-1.214f, -0.504f)
                moveToRelative(3.351f, -1.633f)
                lineToRelative(-0.504f, -1.215f)
                moveToRelative(0.505f, 8.51f)
                lineToRelative(-0.505f, 1.216f)
                moveToRelative(3.526f, -8.511f)
                lineToRelative(0.504f, -1.215f)
                moveToRelative(-0.001f, 9.726f)
                lineToRelative(-0.503f, -1.216f)
                moveToRelative(2.137f, -5.158f)
                lineToRelative(1.216f, -0.504f)
                moveToRelative(-1.216f, 3.525f)
                lineToRelative(1.216f, 0.504f)
                moveTo(14f, 7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                moveToRelative(6.94f, 9.805f)
                arcToRelative(3.948f, 3.948f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.896f, 0f)
                arcToRelative(3.948f, 3.948f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.896f, 0f)
            }
        }.build()

        return _UserCog!!
    }

@Suppress("ObjectPropertyName")
private var _UserCog: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.UserCog,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
