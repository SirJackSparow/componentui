package com.fendy.componentui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun TextWriterText(fullText: String, modifier: Modifier, typingSpeed: Long = 100) {
    var displayText by rememberSaveable { mutableStateOf("") }

    LaunchedEffect(fullText) {
        displayText = ""
        fullText.forEachIndexed { index, char ->
            displayText = fullText.substring(0,index + 1)
            delay(typingSpeed)
        }
    }

    Text(text = displayText, style = MaterialTheme.typography.bodyMedium, modifier = modifier)
}