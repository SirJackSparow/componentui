package com.fendy.componentui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val AssistantMessageIcon: ImageVector
    get() {
        if (_AssistantMessageIcon != null) {
            return _AssistantMessageIcon!!
        }
        _AssistantMessageIcon = ImageVector.Builder(
            name = "Assistant",
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
                moveTo(12f, 23f)
                lineToRelative(-3f, -3f)
                horizontalLineTo(5f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 18.825f, 3f, 18f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(4.175f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(21f, 3.175f, 21f, 4f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 20f, 19f, 20f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-7f, -5f)
                horizontalLineToRelative(4.8f)
                lineToRelative(2.2f, 2.2f)
                lineToRelative(2.2f, -2.2f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 4f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(8.55f, 8.55f)
                lineTo(17f, 11f)
                lineToRelative(-3.45f, -1.55f)
                lineTo(12f, 6f)
                lineToRelative(-1.55f, 3.45f)
                lineTo(7f, 11f)
                lineToRelative(3.45f, 1.55f)
                lineTo(12f, 16f)
                close()
            }
        }.build()
        return _AssistantMessageIcon!!
    }

private var _AssistantMessageIcon: ImageVector? = null
