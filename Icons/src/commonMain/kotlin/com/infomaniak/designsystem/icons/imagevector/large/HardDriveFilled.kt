package com.infomaniak.designsystem.icons.imagevector.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.Large.HardDriveFilled: ImageVector
    get() {
        if (_HardDriveFilled != null) {
            return _HardDriveFilled!!
        }
        _HardDriveFilled = ImageVector.Builder(
            name = "Large.HardDriveFilled",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(22.875f, 18f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20.875f)
                horizontalLineTo(4f)
                arcTo(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.125f, 18f)
                verticalLineToRelative(-5.105f)
                horizontalLineToRelative(21.75f)
                close()
                moveTo(6.004f, 15.125f)
                arcToRelative(0.877f, 0.877f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.755f)
                arcToRelative(0.877f, 0.877f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.755f)
                moveToRelative(3.997f, 0f)
                arcToRelative(0.878f, 0.878f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.756f)
                arcToRelative(0.878f, 0.878f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.756f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.96f, 3.132f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.372f, 1.586f)
                lineToRelative(3.217f, 6.427f)
                horizontalLineTo(1.45f)
                lineToRelative(3.218f, -6.427f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.571f, -1.593f)
                horizontalLineToRelative(9.522f)
                close()
            }
        }.build()

        return _HardDriveFilled!!
    }

@Suppress("ObjectPropertyName")
private var _HardDriveFilled: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.HardDriveFilled,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
