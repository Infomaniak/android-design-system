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

public val EsdsIcons.XSmall.HardDrive: ImageVector
    get() {
        if (_HardDrive != null) {
            return _HardDrive!!
        }
        _HardDrive = ImageVector.Builder(
            name = "XSmall.HardDrive",
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
                moveTo(10f, 16f)
                horizontalLineToRelative(0.01f)
                moveToRelative(11.936f, -3.987f)
                horizontalLineTo(2.054f)
                moveTo(6f, 16f)
                horizontalLineToRelative(0.01f)
                moveToRelative(-3.798f, -4.423f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.212f, 0.896f)
                verticalLineTo(18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-5.527f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.212f, -0.896f)
                lineTo(18.55f, 5.11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.76f, 4f)
                horizontalLineTo(7.24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, 1.11f)
                close()
            }
        }.build()

        return _HardDrive!!
    }

@Suppress("ObjectPropertyName")
private var _HardDrive: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.HardDrive,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
