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

internal val EsdsIcons.Medium.BucketDrop: ImageVector
    get() {
        if (_BucketDrop != null) {
            return _BucketDrop!!
        }
        _BucketDrop = ImageVector.Builder(
            name = "Medium.BucketDrop",
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
                moveTo(11f, 7f)
                lineTo(6f, 2f)
                moveToRelative(12.992f, 10f)
                horizontalLineTo(2.04f)
                moveTo(8.5f, 4.5f)
                lineToRelative(2.148f, -2.148f)
                arcToRelative(1.205f, 1.205f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.704f, 0f)
                lineToRelative(7.296f, 7.296f)
                arcToRelative(1.205f, 1.205f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.704f)
                lineToRelative(-7.592f, 7.592f)
                arcToRelative(3.615f, 3.615f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.112f, 0f)
                lineToRelative(-3.888f, -3.888f)
                arcToRelative(3.615f, 3.615f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.112f)
                lineTo(5.67f, 7.33f)
                moveToRelative(15.475f, 11.05f)
                arcTo(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16.5f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.145f, 1.88f)
                curveToRelative(-0.575f, 0.46f, -0.855f, 1.02f, -0.855f, 1.595f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                curveToRelative(0f, -0.58f, -0.285f, -1.13f, -0.855f, -1.595f)
            }
        }.build()

        return _BucketDrop!!
    }

@Suppress("ObjectPropertyName")
private var _BucketDrop: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.BucketDrop,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
