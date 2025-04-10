package com.fendy.componentui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ColorPicker(
    selectedColor: Color,
    onColorSelected: (Color) -> Unit,
    colors: List<Color> = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Magenta)
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center
    ) {
        colors.forEach { color ->
            Box(
                modifier = Modifier
                    .size(if (selectedColor == color) 50.dp else 40.dp) // Selected color is bigger
                    .clip(CircleShape)
                    .background(color)
                    .border(3.dp, if (selectedColor == color) Color.Black else Color.Transparent, CircleShape)
                    .clickable { onColorSelected(color) }
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}
