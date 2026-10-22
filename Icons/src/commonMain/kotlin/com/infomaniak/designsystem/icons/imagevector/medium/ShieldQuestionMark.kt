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

internal val EsdsIcons.Medium.ShieldQuestionMark: ImageVector
    get() {
        if (_ShieldQuestionMark != null) {
            return _ShieldQuestionMark!!
        }
        _ShieldQuestionMark = ImageVector.Builder(
            name = "Medium.ShieldQuestionMark",
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
                moveTo(9.1f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.82f, 1f)
                curveToRelative(0f, 2f, -3f, 3f, -3f, 3f)
                moveToRelative(0.08f, 4f)
                horizontalLineToRelative(0.01f)
                moveTo(20f, 13f)
                curveToRelative(0f, 5f, -3.5f, 7.5f, -7.66f, 8.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.01f)
                curveTo(7.5f, 20.5f, 4f, 18f, 4f, 13f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.build()

        return _ShieldQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldQuestionMark: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.ShieldQuestionMark,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
