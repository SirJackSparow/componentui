package com.fendy.componentui.draw

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp

@Composable
fun ChatBox() {
    Text(
        text = "Hello Hooman ?",
        style = MaterialTheme.typography.bodySmall,
        color = Color.White,
        fontFamily = FontFamily.Monospace,
        modifier = Modifier
            .padding(12.dp)
            .drawBehind {
                val outBox = outBox()
                val innerBox = innerBox()
                val outBoxOutline = outBox.createOutline(size, layoutDirection, this)
                val innerBoxOutline = innerBox.createOutline(size, layoutDirection, this)
                drawOutline(outBoxOutline, color = Color.White)
                drawOutline(innerBoxOutline, color = Color.Black)
            }
    )
}

@Composable
fun PersonaLoadingChatBox(text: String, modifier: Modifier = Modifier) {
    val borderThickness = 10.dp
    val cornerSkew = 10.dp

    Box(
        modifier = modifier
            .padding(8.dp)
            .background(Color.Transparent)
            .drawBehind {
                val borderPath = Path().apply {
                    moveTo(cornerSkew.toPx(), 0f)
                    lineTo(size.width, 0f)
                    lineTo(size.width - cornerSkew.toPx(), size.height)
                    lineTo(0f, size.height)
                    close()
                }

                val innerPath = Path().apply {
                    moveTo(cornerSkew.toPx() + borderThickness.toPx(), 0f)
                    lineTo(size.width - 3f, 10f)
                    lineTo(size.width - borderThickness.toPx(), size.height - 3f)
                    lineTo(0f, size.height - 10f)
                    close()
                }

                drawPath(borderPath, color = Color.Red)
                drawPath(innerPath, color = Color.Black)

            }
            .padding(24.dp)
    ) {
        Text(
            "Loadi ",
            color = Color.White,
            maxLines = 1
        )
    }
}

@Composable
fun PersonaChatBox(
    text: String,
    modifier: Modifier = Modifier
) {
    val borderThickness = 6.dp
    val cornerSkew = 16.dp

    Box(
        modifier = modifier
            .padding(16.dp)
            .background(Color.Transparent)
            .drawBehind {
                val borderPath = Path().apply {
                    moveTo(cornerSkew.toPx(), 0f)
                    lineTo(size.width, 0f)
                    lineTo(size.width - cornerSkew.toPx(), size.height)
                    lineTo(0f, size.height)
                    close()
                }

                val crash = Path().apply {
                    moveTo(cornerSkew.toPx() - 3f, 0f)
                    lineTo(size.width + 3f, 15f)
                    lineTo(size.width - 18.dp.toPx(), size.height)
                    lineTo(0f, size.height - 2.dp.toPx())
                    close()
                }

                val innerPath = Path().apply {
                    moveTo((cornerSkew + borderThickness).toPx(), borderThickness.toPx())
                    lineTo(size.width - borderThickness.toPx(), borderThickness.toPx())
                    lineTo(
                        size.width - cornerSkew.toPx() - borderThickness.toPx(),
                        size.height - borderThickness.toPx()
                    )
                    lineTo(borderThickness.toPx(), size.height - borderThickness.toPx())
                    close()
                }

                // Draw white border
                drawPath(borderPath, color = Color.White)

                //Draw Red border
                drawPath(crash, color = Color.Red)

                // Draw black background inside the border
                drawPath(innerPath, color = Color.Black)
            }
            .padding(24.dp) // Inner padding for text
    ) {
        Text(
            text = text,
            fontFamily = FontFamily.Cursive,
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
        )
    }
}


fun Density.outBox(): Shape = GenericShape { size, _ ->
    moveTo(31.7.dp.toPx(), 3.1.dp.toPx())
    lineTo(size.width, 0f)
    lineTo(size.width - 23, size.height)
    lineTo(0f, size.height - 8)
    close()
}

fun Density.innerBox(): Shape = GenericShape { size, _ ->
    moveTo(33.dp.toPx(), 7.7.dp.toPx())
    lineTo(size.width - 13.dp.toPx(), 3.7.dp.toPx())
    lineTo(size.width - 25.7.dp.toPx(), size.height - 4.6.dp.toPx())
    lineTo(20.4.dp.toPx(), size.height - 12.dp.toPx())
    close()
}

@Preview(showBackground = true, name = "ChatBox", backgroundColor = 0xFF000000)
@Composable
fun ChatBoxPreview() {
    ChatBox()
}

@Preview(showBackground = true, name = "PersonaChatBox", backgroundColor = 0xFF000000)
@Composable
fun PersonaChatBoxPreview() {
    PersonaChatBox(text = "Hello Hooman ?")
}

@Preview(showBackground = true, name = "Loading ChatBox", backgroundColor = 0xFF000000)
@Composable
fun PersonaPreviewLoadingChatBox() {
    PersonaLoadingChatBox(text = "Loading...")
}