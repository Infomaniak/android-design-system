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

public val EsdsIcons.Medium.EnvelopeQuestionMark: ImageVector
    get() {
        if (_EnvelopeQuestionMark != null) {
            return _EnvelopeQuestionMark!!
        }
        _EnvelopeQuestionMark = ImageVector.Builder(
            name = "Medium.EnvelopeQuestionMark",
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
                moveTo(22f, 10.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12.5f)
                moveTo(22f, 7f)
                lineToRelative(-8.97f, 5.7f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.06f, 0f)
                lineTo(2f, 7f)
                moveToRelative(16f, 8.28f)
                curveToRelative(0.2f, -0.4f, 0.5f, -0.8f, 0.9f, -1f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 0.4f)
                curveToRelative(0.3f, 0.4f, 0.5f, 0.8f, 0.5f, 1.3f)
                curveToRelative(0f, 1.3f, -2f, 2f, -2f, 2f)
                moveTo(20f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()

        return _EnvelopeQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeQuestionMark: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.EnvelopeQuestionMark,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
