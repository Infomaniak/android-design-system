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
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.Large.CheckmarkList: ImageVector
    get() {
        if (_CheckmarkList != null) {
            return _CheckmarkList!!
        }
        _CheckmarkList = ImageVector.Builder(
            name = "Large.CheckmarkList",
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
                moveTo(13f, 5f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 7f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 7f)
                horizontalLineToRelative(8f)
                moveTo(3f, 17f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(3f, 7f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _CheckmarkList!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkList: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.Large.CheckmarkList,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
