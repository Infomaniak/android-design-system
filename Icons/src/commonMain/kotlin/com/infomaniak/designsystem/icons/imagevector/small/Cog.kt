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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Small.Cog: ImageVector
    get() {
        if (_Cog != null) {
            return _Cog!!
        }
        _Cog = ImageVector.Builder(
            name = "Small.Cog",
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
                moveTo(9.671f, 4.136f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.66f, 0f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.318f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.831f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.319f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.659f, 0f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.32f, -1.915f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, -4.033f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.831f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, -4.033f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.318f, -1.915f)
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
        }.build()

        return _Cog!!
    }

@Suppress("ObjectPropertyName")
private var _Cog: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Small.Cog,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
