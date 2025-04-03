package com.fendy.componentui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PrimaryButton(onClick: () -> Unit) {
    Button(
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
   PrimaryButton {

   }
}