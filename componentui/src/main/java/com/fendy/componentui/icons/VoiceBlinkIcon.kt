package com.fendy.componentui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val VoiceBlinkIcon: ImageVector
    get() {
        if (_VoiceBlinkIcon != null) {
            return _VoiceBlinkIcon!!
        }
        _VoiceBlinkIcon = ImageVector.Builder(
            name = "Auto_detect_voice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5f, 10f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(2f, 7f)
                lineToRelative(2.05f, -0.95f)
                lineTo(5f, 4f)
                lineToRelative(0.95f, 2.05f)
                lineTo(8f, 7f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveToRelative(13f, -3f)
                lineToRelative(-0.625f, -1.375f)
                lineTo(16f, 5f)
                lineToRelative(1.375f, -0.625f)
                lineTo(18f, 3f)
                lineToRelative(0.625f, 1.375f)
                lineTo(20f, 5f)
                lineToRelative(-1.375f, 0.625f)
                close()
                moveToRelative(2f, 4f)
                lineToRelative(-0.625f, -1.375f)
                lineTo(18f, 9f)
                lineToRelative(1.375f, -0.625f)
                lineTo(20f, 7f)
                lineToRelative(0.625f, 1.375f)
                lineTo(22f, 9f)
                lineToRelative(-1.375f, 0.625f)
                close()
                moveToRelative(-8f, 4f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(9f, 12f)
                verticalLineTo(6f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(12f, 3f)
                reflectiveQuadToRelative(2.125f, 0.875f)
                reflectiveQuadTo(15f, 6f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(12f, 15f)
                moveToRelative(-1f, 7f)
                verticalLineToRelative(-3.075f)
                quadToRelative(-2.6f, -0.35f, -4.3f, -2.325f)
                reflectiveQuadTo(5f, 12f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, 2.075f, 1.463f, 3.537f)
                quadTo(9.925f, 17f, 12f, 17f)
                reflectiveQuadToRelative(3.538f, -1.463f)
                quadTo(17f, 14.075f, 17f, 12f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, 2.625f, -1.7f, 4.6f)
                reflectiveQuadTo(13f, 18.925f)
                verticalLineTo(22f)
                close()
                moveToRelative(1f, -9f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 12.425f, 13f, 12f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.425f, -0.287f, -0.713f)
                quadTo(12.425f, 5f, 12f, 5f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 5.575f, 11f, 6f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 0.425f, 0.288f, 0.712f)
                quadToRelative(0.287f, 0.288f, 0.712f, 0.288f)
            }
        }.build()
        return _VoiceBlinkIcon!!
    }

private var _VoiceBlinkIcon: ImageVector? = null
