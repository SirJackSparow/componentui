package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val LaughIcon: ImageVector
    get() {
        if (_laughicon != null) {
            return _laughicon!!
        }
        _laughicon = ImageVector.Builder(
            name = "EmojiLaughing",
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
                moveTo(12.331f, 9.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.33f, -2.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.535f, 9f)
                horizontalLineToRelative(6.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.866f, 0.5f)
                moveTo(7f, 6.5f)
                curveToRelative(0f, 0.828f, -0.448f, 0f, -1f, 0f)
                reflectiveCurveToRelative(-1f, 0.828f, -1f, 0f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.828f, -0.448f, 0f, -1f, 0f)
                reflectiveCurveToRelative(-1f, 0.828f, -1f, 0f)
                reflectiveCurveTo(9.448f, 5f, 10f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
            }
        }.build()
        return _laughicon!!
    }

private var _laughicon: ImageVector? = null
