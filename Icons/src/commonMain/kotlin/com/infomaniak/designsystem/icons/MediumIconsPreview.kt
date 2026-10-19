package com.infomaniak.designsystem.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(widthDp = 600, heightDp = 3000)
@Composable
private fun MediumIconsGridPreview() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 80.dp),
        modifier = Modifier.background(Color.White).padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(AllMediumIcons, key = { it.name }) { icon ->
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(imageVector = icon, contentDescription = icon.name, modifier = Modifier.size(24.dp))
                BasicText(
                    text = icon.name.removePrefix("Medium."),
                    style = TextStyle(fontSize = 9.sp, textAlign = TextAlign.Center),
                    minLines = 2,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}
