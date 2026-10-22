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

internal val EsdsIcons.Medium.CloudExclamationMark: ImageVector
    get() {
        if (_CloudExclamationMark != null) {
            return _CloudExclamationMark!!
        }
        _CloudExclamationMark = ImageVector.Builder(
            name = "Medium.CloudExclamationMark",
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
                moveTo(12f, 12f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(0.01f)
                moveToRelative(-3.882f, -3.051f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9f)
                horizontalLineToRelative(-1.642f)
            }
        }.build()

        return _CloudExclamationMark!!
    }

@Suppress("ObjectPropertyName")
private var _CloudExclamationMark: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.CloudExclamationMark,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
