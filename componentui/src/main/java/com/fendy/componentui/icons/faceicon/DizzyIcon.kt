package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val DizzyIcon: ImageVector
    get() {
        if (_dizzyIcon != null) {
            return _dizzyIcon!!
        }
        _dizzyIcon = ImageVector.Builder(
            name = "EmojiDizzy",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.146f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.708f, 0.708f)
                lineToRelative(-0.646f, -0.647f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.708f)
                moveToRelative(-5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.708f, 0.708f)
                lineTo(5.5f, 7.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.708f)
                moveTo(10f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
        }.build()
        return _dizzyIcon!!
    }

private var _dizzyIcon: ImageVector? = null
