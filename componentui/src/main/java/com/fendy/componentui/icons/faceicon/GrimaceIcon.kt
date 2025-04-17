package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val GrimaceIcon: ImageVector
    get() {
        if (_grimaceicon != null) {
            return _grimaceicon!!
        }
        _grimaceicon = ImageVector.Builder(
            name = "EmojiGrimace",
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
                moveTo(7f, 6.25f)
                curveToRelative(0f, 0.69f, -0.448f, 1.25f, -1f, 1.25f)
                reflectiveCurveToRelative(-1f, -0.56f, -1f, -1.25f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.56f, 1f, 1.25f)
                moveToRelative(3f, 1.25f)
                curveToRelative(0.552f, 0f, 1f, -0.56f, 1f, -1.25f)
                reflectiveCurveTo(10.552f, 5f, 10f, 5f)
                reflectiveCurveToRelative(-1f, 0.56f, -1f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1f, 1.25f)
                moveToRelative(2.98f, 3.25f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 12f)
                horizontalLineToRelative(-7f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, -1.747f)
                verticalLineToRelative(-0.003f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 9f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.48f, 1.747f)
                close()
                moveToRelative(-8.48f, 0.75f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-0.75f)
                horizontalLineTo(3.531f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.969f, 0.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.969f, -0.75f)
                horizontalLineTo(11.25f)
                verticalLineToRelative(0.75f)
                close()
                moveToRelative(0.969f, -1.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.969f, -0.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(4.5f, 9.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.969f, 0.75f)
                horizontalLineTo(4.75f)
                verticalLineTo(9.5f)
                close()
                moveToRelative(1.75f, 2f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                close()
                moveToRelative(0.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
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
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                moveToRelative(0f, -1f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
            }
        }.build()
        return _grimaceicon!!
    }

private var _grimaceicon: ImageVector? = null
