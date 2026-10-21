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

internal val EsdsIcons.Small.CircleFadingArrowUp: ImageVector
    get() {
        if (_CircleFadingArrowUp != null) {
            return _CircleFadingArrowUp!!
        }
        _CircleFadingArrowUp = ImageVector.Builder(
            name = "Small.CircleFadingArrowUp",
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
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.38f, 16.75f)
                moveTo(8f, 12f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                verticalLineToRelative(8f)
                moveTo(2.5f, 8.875f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 3f)
                moveTo(2.83f, 16f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 3.4f)
                moveTo(4.636f, 5.235f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.891f, -0.857f)
                moveTo(8.644f, 21.42f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.631f, -0.38f)
            }
        }.build()

        return _CircleFadingArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CircleFadingArrowUp: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.CircleFadingArrowUp,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
