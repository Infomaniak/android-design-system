package com.infomaniak.designsystem.icons.imagevector.large

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

public val EsdsIcons.Large.ChevronsUpDown: ImageVector
    get() {
        if (_ChevronsUpDown != null) {
            return _ChevronsUpDown!!
        }
        _ChevronsUpDown = ImageVector.Builder(
            name = "Large.ChevronsUpDown",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveToRelative(7f, 15f)
                lineToRelative(5f, 5f)
                lineToRelative(5f, -5f)
                moveTo(7f, 9f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
        }.build()

        return _ChevronsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsUpDown: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.ChevronsUpDown,
            contentDescription = null,
            modifier = Modifier.size(PreviewIconSize),
        )
    }
}
