package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val NeutralIcon: ImageVector
    get() {
        if (_neutralicon != null) {
            return _neutralicon!!
        }
        _neutralicon = ImageVector.Builder(
            name = "EmojiNeutral",
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
                moveTo(4f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                moveToRelative(3f, -4f)
                curveTo(7f, 5.672f, 6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 8f, 6f, 8f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, -0.828f, -0.448f, -1.5f, -1f, -1.5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(9.448f, 8f, 10f, 8f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
            }
        }.build()
        return _neutralicon!!
    }

private var _neutralicon: ImageVector? = null
