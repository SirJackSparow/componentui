package com.fendy.componentui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.fendy.componentui.icons.MicIcon
import com.fendy.componentui.icons.SendIcon
import com.fendy.componentui.icons.VoiceBlinkIcon


@Composable
fun ChatInputBar(
    onSend: (String) -> Unit,
    onMicClick: () -> Unit
) {
    var text by remember { mutableStateOf("") }

    val backgroundColor = Color(0xFF2D2D2D) // Match this with your Surface color

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(28.dp),
        color = backgroundColor
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            TextField(
                value = text,
                onValueChange = { text = it },
                placeholder = { Text("Ask anything") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.Gray,
                    cursorColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedContainerColor = backgroundColor,
                    unfocusedContainerColor = backgroundColor,
                    focusedPlaceholderColor = Color.LightGray,
                    unfocusedPlaceholderColor = Color.LightGray
                ),
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MenuButton("Search") {}
                    MenuButton("Reason") {}
                    MenuButton("Create image") {}
                }

                Row {
                    IconButton(onClick = onMicClick) {
                        Icon(VoiceBlinkIcon, contentDescription = "Mic", tint = Color.White)
                    }
                    IconButton(onClick = {
                        onSend(text)
                        text = ""
                    }) {
                        Icon(Icons.Default.Send, contentDescription = "Send", tint = Color.White)
                    }
                }
            }
        }
    }
}


@Composable
fun MenuButton(label: String, onClick: () -> Unit) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = Color.DarkGray,
        modifier = Modifier.padding(horizontal = 4.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            color = Color.White
        )
    }
}


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
    onMicTouchEnd: () -> Unit,
    useVoice: Boolean = true
) {
    var text by remember { mutableStateOf(message) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .imePadding()
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

        if (useVoice) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(
                        width = 2.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.Red, Color(0xFFFF9800), Color.Yellow, Color.Green, Color.Blue,
                                Color(0xFF3F51B5), Color(0xFF8E24AA)
                            )
                        ),
                        shape = CircleShape
                    )
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                onMicTouchStart()
                                tryAwaitRelease()
                                onMicTouchEnd()
                            }
                        )
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = MicIcon,
                    contentDescription = "Mic",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }

    }
}


@Composable
fun ChatInputFieldV2(
    modifier: Modifier,
    singleLine: Boolean = false,
    placeHolder: String,
    maxLines: Int = Int.MAX_VALUE,
    message: String,
    onMessageChange: (String) -> Unit,
    enableButton: Boolean = true,
    onSendClick: () -> Unit,
    onMicTouchStart: () -> Unit,
    onMicTouchEnd: () -> Unit,
    useVoice: Boolean = true,
) {
    var text by remember { mutableStateOf(message) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .imePadding()
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
                imageVector = SendIcon,
                contentDescription = "Send",
                tint = Color(0xFF40414F)
            )
        }

        if (useVoice) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(
                        width = 2.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFFD96570),
                                Color(0xFF9B72CB),
                                Color(0xFF4285F4)
                                )
                        ),
                        shape = CircleShape
                    )
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                onMicTouchStart()
                                tryAwaitRelease()
                                onMicTouchEnd()
                            }
                        )
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = MicIcon,
                    contentDescription = "Mic",
                    tint = Color(0xFF40414F),
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }

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