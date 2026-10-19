package com.infomaniak.designsystem.icons.imagevector.xlarge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.previewIconSize

public val EsdsIcons.XLarge.ProductContact: ImageVector
    get() {
        if (_ProductContact != null) {
            return _ProductContact!!
        }
        _ProductContact = ImageVector.Builder(
            name = "XLarge.ProductContact",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.35f,
                strokeLineCap = StrokeCap.Round,
            ) {
                moveToRelative(8.65f, 2.497f)
                lineToRelative(4.766f, 1.564f)
                lineToRelative(4.477f, 1.418f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.185f, 1.618f)
                lineToRelative(-0.001f, 11.406f)
                moveTo(4.933f, 5.505f)
                arcToRelative(0.868f, 0.868f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.121f, -0.835f)
                lineToRelative(9.532f, 2.959f)
                arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.612f, 0.835f)
                verticalLineToRelative(12.158f)
                arcToRelative(0.868f, 0.868f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.122f, 0.836f)
                lineToRelative(-9.531f, -2.96f)
                arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.612f, -0.835f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.432f, 6.34f)
                verticalLineToRelative(5.74f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.134f, 0.203f)
                arcToRelative(0.215f, 0.215f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.236f, -0.048f)
                lineToRelative(0.854f, -0.861f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.153f, 0f)
                lineToRelative(0.853f, 1.413f)
                arcToRelative(0.215f, 0.215f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.236f, 0.047f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.134f, -0.202f)
                verticalLineToRelative(-5.49f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.933f, 5.437f)
                curveToRelative(0f, -0.469f, 0.535f, -0.922f, 1.083f, -0.781f)
                lineToRelative(1.184f, 0.369f)
                verticalLineTo(19.01f)
                lineToRelative(-1.722f, -0.537f)
                curveToRelative(-0.329f, -0.133f, -0.545f, -0.464f, -0.545f, -0.767f)
                close()
            }
        }.build()

        return _ProductContact!!
    }

@Suppress("ObjectPropertyName")
private var _ProductContact: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.background(Color.White)) {
        Image(
            imageVector = EsdsIcons.XLarge.ProductContact,
            contentDescription = null,
            modifier = Modifier.size(previewIconSize),
        )
    }
}
