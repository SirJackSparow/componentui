package com.fendy.componentui.icons.faceicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val KissIcon: ImageVector
    get() {
        if (_kissicon != null) {
            return _kissicon!!
        }
        _kissicon = ImageVector.Builder(
            name = "EmojiKiss",
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.493f, 13.368f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.489f, -4.858f)
                curveToRelative(0.344f, 0.033f, 0.68f, 0.147f, 0.975f, 0.328f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.654f, 5.152f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, -0.622f)
                moveToRelative(-3.731f, -3.22f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.107f, 0.318f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.31f, -0.95f)
                curveToRelative(0.38f, -0.125f, 0.802f, -0.254f, 1.192f, -0.343f)
                curveToRelative(0.37f, -0.086f, 0.78f, -0.153f, 1.103f, -0.108f)
                curveToRelative(0.16f, 0.022f, 0.394f, 0.085f, 0.561f, 0.286f)
                curveToRelative(0.188f, 0.226f, 0.187f, 0.497f, 0.131f, 0.705f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 0.593f)
                quadToRelative(-0.115f, 0.16f, -0.275f, 0.343f)
                quadToRelative(0.16f, 0.186f, 0.276f, 0.347f)
                curveToRelative(0.142f, 0.197f, 0.256f, 0.397f, 0.31f, 0.595f)
                curveToRelative(0.055f, 0.208f, 0.056f, 0.479f, -0.132f, 0.706f)
                curveToRelative(-0.168f, 0.2f, -0.404f, 0.262f, -0.563f, 0.284f)
                curveToRelative(-0.323f, 0.043f, -0.733f, -0.027f, -1.102f, -0.113f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.191f, -0.345f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.31f, -0.95f)
                curveToRelative(0.371f, 0.12f, 0.761f, 0.24f, 1.109f, 0.321f)
                quadToRelative(0.264f, 0.062f, 0.446f, 0.084f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.502f, -0.584f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.002f, -0.695f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.577f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.448f, 0.082f)
                close()
                moveToRelative(0.766f, -0.087f)
                lineToRelative(-0.003f, -0.001f)
                lineToRelative(-0.003f, -0.001f)
                close()
                moveToRelative(0.002f, 1.867f)
                lineToRelative(-0.006f, 0.001f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0.552f, 0f, 1f, -0.672f, 1f, -1.5f)
                reflectiveCurveTo(6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 8f, 6f, 8f)
                moveToRelative(2.757f, -0.563f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.68f, -0.194f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.813f, -0.493f)
                curveToRelative(0.339f, 0f, 0.645f, 0.19f, 0.813f, 0.493f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.874f, -0.486f)
                arcTo(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 5.75f)
                curveToRelative(-0.73f, 0f, -1.356f, 0.412f, -1.687f, 1.007f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.194f, 0.68f)
                moveTo(14f, 9.828f)
                curveToRelative(1.11f, -1.14f, 3.884f, 0.856f, 0f, 3.422f)
                curveToRelative(-3.884f, -2.566f, -1.11f, -4.562f, 0f, -3.421f)
                close()
            }
        }.build()
        return _kissicon!!
    }

private var _kissicon: ImageVector? = null
