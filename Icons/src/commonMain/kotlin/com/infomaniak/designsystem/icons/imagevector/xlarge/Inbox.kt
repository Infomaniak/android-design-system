package com.infomaniak.designsystem.icons.imagevector.xlarge

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

public val EsdsIcons.XLarge.Inbox: ImageVector
    get() {
        if (_Inbox != null) {
            return _Inbox!!
        }
        _Inbox = ImageVector.Builder(
            name = "XLarge.Inbox",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.35f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-6f)
                lineToRelative(-2f, 3f)
                horizontalLineToRelative(-4f)
                lineToRelative(-2f, -3f)
                horizontalLineTo(2f)
                moveToRelative(0f, 0f)
                lineToRelative(3.45f, -6.89f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 4f)
                horizontalLineToRelative(9.52f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.79f, 1.11f)
                lineTo(22f, 12f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()

        return _Inbox!!
    }

@Suppress("ObjectPropertyName")
private var _Inbox: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.Inbox,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
