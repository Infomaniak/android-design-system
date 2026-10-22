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

internal val EsdsIcons.Medium.NumberList: ImageVector
    get() {
        if (_NumberList != null) {
            return _NumberList!!
        }
        _NumberList = ImageVector.Builder(
            name = "Medium.NumberList",
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
                moveTo(11f, 5f)
                horizontalLineToRelative(10f)
                moveToRelative(-10f, 7f)
                horizontalLineToRelative(10f)
                moveToRelative(-10f, 7f)
                horizontalLineToRelative(10f)
                moveTo(4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                moveTo(4f, 9f)
                horizontalLineToRelative(2f)
                moveToRelative(0.5f, 11f)
                horizontalLineTo(3.4f)
                curveToRelative(0f, -1f, 2.6f, -1.925f, 2.6f, -3.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, -1.02f)
            }
        }.build()

        return _NumberList!!
    }

@Suppress("ObjectPropertyName")
private var _NumberList: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.NumberList,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
