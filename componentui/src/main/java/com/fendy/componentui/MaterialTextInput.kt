package com.fendy.componentui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.fendy.componentui.icons.MicIcon

@Composable
fun ChatInputField(
    modifier: Modifier,
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    message: String,
    onMessageChange: (String) -> Unit,
    enableButton: Boolean = true,
    onSendClick: () -> Unit,
    onMicTouchStart: () -> Unit,
    onMicTouchEnd: () -> Unit
) {
    var text by remember { mutableStateOf(message) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(24.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
                onMessageChange(it)
            },
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            placeholder = { Text("Send a message...") },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSend = {
                    if (text.isNotBlank()) {
                        onSendClick()
                        text = ""
                    }
                }
            ),
            singleLine = singleLine,
            maxLines = maxLines
        )

        IconButton(
            enabled = enableButton,
            onClick = {
                if (text.isNotBlank()) {
                    onSendClick()
                    text = ""
                }
            }
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send",
                tint = MaterialTheme.colorScheme.primary
            )
        }

        Icon(
            imageVector = MicIcon,
            contentDescription = "Mic",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .size(30.dp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            onMicTouchStart()
                            tryAwaitRelease()
                            onMicTouchEnd()
                        }
                    )
                }
        )

    }
}


@Composable
fun ChatInputFieldWithoutVoice(
    modifier: Modifier,
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    message: String,
    onMessageChange: (String) -> Unit,
    enableButton: Boolean = true,
    onSendClick: () -> Unit,
) {
    var text by remember { mutableStateOf(message) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(24.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
                onMessageChange(it)
            },
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            placeholder = { Text("Send a message...") },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSend = {
                    if (text.isNotBlank()) {
                        onSendClick()
                        text = ""
                    }
                }
            ),
            singleLine = singleLine,
            maxLines = maxLines
        )

        IconButton(
            enabled = enableButton,
            onClick = {
                if (text.isNotBlank()) {
                    onSendClick()
                    text = ""
                }
            }
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}