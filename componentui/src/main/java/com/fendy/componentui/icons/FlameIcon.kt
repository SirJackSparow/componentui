package com.fendy.componentui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val FlameIcon: ImageVector
    get() {
        if (_FlameIcon != null) {
            return _FlameIcon!!
        }
        _FlameIcon = ImageVector.Builder(
            name = "Flame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12f)
                curveToRelative(0f, -1.38f, -0.5f, -2f, -1f, -3f)
                curveToRelative(-1.072f, -2.143f, -0.224f, -4.054f, 2f, -6f)
                curveToRelative(0.5f, 2.5f, 2f, 4.9f, 4f, 6.5f)
                curveToRelative(2f, 1.6f, 3f, 3.5f, 3f, 5.5f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14f, 0f)
                curveToRelative(0f, -1.153f, 0.433f, -2.294f, 1f, -3f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
                close()
            }
        }.build()
        return _FlameIcon!!
    }

private var _FlameIcon: ImageVector? = null
