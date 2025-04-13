package com.fendy.componentui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fendy.componentui.icons.GoogleIcon


@Composable
fun PrimaryButton(modifier: Modifier = Modifier,onClick: () -> Unit) {
    Button(
        modifier = modifier,
        onClick = onClick, border = BorderStroke(
            width = 20.dp,
            brush = Brush.linearGradient(
                colors = listOf(Color.White, Color.Blue)
            )
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(text = "Primary")
    }

}

@Composable
fun BoomButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    var isClicked by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isClicked) 1.2f else 1f,
        animationSpec = tween(durationMillis = 200),
        finishedListener = { isClicked = false } // Reset animation
    )

    Button(
        onClick = {
            isClicked = true
            onClick()
        },
        modifier = modifier
            .scale(scale)
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
    ) {
        Text(text = text, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun RegularButton(
    text: String,
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    contentColor: Color = Color.Black,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 16.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(6.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
    }
}


@Composable
fun GoogleButton(
    text: String,
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    contentColor: Color = Color.Black,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 16.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(6.dp),
        contentPadding = PaddingValues(0.dp) // Important to get true alignment
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            // Icon on the left
            Icon(
                imageVector = GoogleIcon,
                contentDescription = "Google Icon",
                tint = Color.Unspecified,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 16.dp)
                    .size(24.dp)
            )

            // Text centered
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}


@Composable
fun NeonButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    val infiniteTransition = rememberInfiniteTransition()
    val glowAlpha by infiniteTransition.animateFloat(
        initialValue = 0.4f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = modifier
            .padding(16.dp)
            .height(60.dp)
            .width(200.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color(0xFF4A148C))
            .border(
                width = 4.dp,
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFFB388FF), Color(0xFF6200EA))
                ),
                shape = RoundedCornerShape(30.dp)
            )
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(30.dp),
                clip = false
            )
            .drawBehind {
                drawRoundRect(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0xFFB388FF).copy(alpha = glowAlpha),
                            Color.Transparent
                        ),
                        radius = size.width * 0.6f
                    ),
                    cornerRadius = CornerRadius(30f, 30f)
                )
            }
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton() {

    }
}