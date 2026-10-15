package com.infomaniak.designsystem.icons.imagevector.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.PreviewIconSize

public val EsdsIcons.Medium.DotsNine: ImageVector
    get() {
        if (_DotsNine != null) {
            return _DotsNine!!
        }
        _DotsNine = ImageVector.Builder(
            name = "Medium.DotsNine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17.125f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(-14f, -7f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(-14f, -7f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.75f)
            }
        }.build()

        return _DotsNine!!
    }

@Suppress("ObjectPropertyName")
private var _DotsNine: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Medium.DotsNine,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
