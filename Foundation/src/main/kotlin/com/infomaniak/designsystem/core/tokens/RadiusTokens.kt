/*
  To generate
*/

package com.infomaniak.designsystem.core.tokens

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import com.infomaniak.designsystem.primitivetokens.*

data class RadiusTokens(
    val radiusNone: Shape = RectangleShape,
    val radiusXs: Shape = RoundedCornerShape(Radius4),
    val radiusSm: Shape = RoundedCornerShape(Radius4),
    val radiusMd: Shape = RoundedCornerShape(Radius4),
    val radiusLg: Shape = RoundedCornerShape(Radius4),
    val radiusXl: Shape = RoundedCornerShape(Radius4),
    val radius2xl: Shape = RoundedCornerShape(Radius4),
    val radius3xl: Shape = RoundedCornerShape(Radius4),
    val radius4xl: Shape = RoundedCornerShape(Radius4),
    val radiusFull: Shape = CircleShape,
)
