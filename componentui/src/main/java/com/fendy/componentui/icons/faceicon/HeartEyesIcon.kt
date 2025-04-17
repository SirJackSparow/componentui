package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val HeartEyesIcon: ImageVector
    get() {
        if (_hearteyesicon != null) {
            return _hearteyesicon!!
        }
        _hearteyesicon = ImageVector.Builder(
            name = "EmojiHeartEyes",
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
                moveTo(11.315f, 10.014f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.548f, 0.736f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.965f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.548f, -0.736f)
                horizontalLineToRelative(0.005f)
                lineToRelative(0.017f, 0.005f)
                lineToRelative(0.067f, 0.015f)
                lineToRelative(0.252f, 0.055f)
                curveToRelative(0.215f, 0.046f, 0.515f, 0.108f, 0.857f, 0.169f)
                curveToRelative(0.693f, 0.124f, 1.522f, 0.242f, 2.152f, 0.242f)
                reflectiveCurveToRelative(1.46f, -0.118f, 2.152f, -0.242f)
                arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.109f, -0.224f)
                lineToRelative(0.067f, -0.015f)
                lineToRelative(0.017f, -0.004f)
                lineToRelative(0.005f, -0.002f)
                close()
                moveTo(4.756f, 4.566f)
                curveToRelative(0.763f, -1.424f, 4.02f, -0.12f, 0.952f, 3.434f)
                curveToRelative(-4.496f, -1.596f, -2.35f, -4.298f, -0.952f, -3.434f)
                moveToRelative(6.488f, 0f)
                curveToRelative(1.398f, -0.864f, 3.544f, 1.838f, -0.952f, 3.434f)
                curveToRelative(-3.067f, -3.554f, 0.19f, -4.858f, 0.952f, -3.434f)
            }
        }.build()
        return _hearteyesicon!!
    }

private var _hearteyesicon: ImageVector? = null
