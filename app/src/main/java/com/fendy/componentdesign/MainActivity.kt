package com.fendy.componentdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.fendy.componentdesign.ui.theme.ComponentDesignTheme
import com.fendy.componentui.ChatInputField
import com.fendy.componentui.ColorPicker
import com.fendy.componentui.GoogleButton
import com.fendy.componentui.RegularButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentDesignTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComponentDesignTheme {
        GoogleButton(text = "Button") { }
    }
}

@Preview(showBackground = true, name = "Color Picker Preview")
@Composable
fun ColorPickerPreview() {
    ComponentDesignTheme {
        ColorPicker(Color.Red, onColorSelected = {})
    }
}

@Preview(showBackground = true, name= "Regular Button")
@Composable
fun RegularButtonPreview() {
    RegularButton("Without Sign In") { }
}

@Preview(showBackground = true, name= "Chat")
@Composable
fun ChatInput() {
    ChatInputField(modifier = Modifier, singleLine = true, message = "", onMessageChange = {}, onSendClick = { }, onMicTouchEnd = { }, onMicTouchStart = {})
}