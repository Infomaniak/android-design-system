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

public val EsdsIcons.XSmall.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) {
            return _DoorOpen!!
        }
        _DoorOpen = ImageVector.Builder(
            name = "XSmall.DoorOpen",
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
                moveTo(11f, 20f)
                lineTo(2f, 20f)
                moveToRelative(17f, 0f)
                lineToRelative(-6.758f, 1.689f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.242f, -0.97f)
                lineTo(11f, 4.562f)
                arcToRelative(2.004f, 2.004f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.585f, -1.956f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0.016f)
                lineToRelative(4f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5.562f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(3f)
                moveTo(11f, 4f)
                lineTo(8f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(14f)
                moveToRelative(8f, -8f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _DoorOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorOpen: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XSmall.DoorOpen,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
