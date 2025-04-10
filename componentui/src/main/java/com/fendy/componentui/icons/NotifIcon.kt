package com.fendy.componentui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val NotificationIcon: ImageVector
    get() {
        if (_notifIcon != null) {
            return _notifIcon!!
        }
        _notifIcon = ImageVector.Builder(
            name = "Bell",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
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
                moveTo(8.60124f, 1.25086f)
                curveTo(8.6012f, 1.7546f, 8.2628f, 2.1793f, 7.8009f, 2.3099f)
                curveTo(10.1459f, 2.4647f, 12f, 4.4158f, 12f, 6.8f)
                verticalLineTo(10.25f)
                curveTo(12f, 11.0563f, 12.0329f, 11.7074f, 12.7236f, 12.0528f)
                curveTo(12.931f, 12.1565f, 13.0399f, 12.3892f, 12.9866f, 12.6149f)
                curveTo(12.9333f, 12.8406f, 12.7319f, 13f, 12.5f, 13f)
                horizontalLineTo(8.16144f)
                curveTo(8.369f, 13.1832f, 8.5f, 13.4513f, 8.5f, 13.75f)
                curveTo(8.5f, 14.3023f, 8.0523f, 14.75f, 7.5f, 14.75f)
                curveTo(6.9477f, 14.75f, 6.5f, 14.3023f, 6.5f, 13.75f)
                curveTo(6.5f, 13.4513f, 6.6309f, 13.1832f, 6.8385f, 13f)
                horizontalLineTo(2.49999f)
                curveTo(2.2681f, 13f, 2.0666f, 12.8406f, 2.0134f, 12.6149f)
                curveTo(1.9601f, 12.3892f, 2.069f, 12.1565f, 2.2764f, 12.0528f)
                curveTo(2.9671f, 11.7074f, 3f, 11.0563f, 3f, 10.25f)
                verticalLineTo(6.79999f)
                curveTo(3f, 4.4154f, 4.8548f, 2.464f, 7.2004f, 2.3098f)
                curveTo(6.7387f, 2.1791f, 6.4004f, 1.7545f, 6.4004f, 1.2509f)
                curveTo(6.4004f, 0.6431f, 6.893f, 0.1504f, 7.5008f, 0.1504f)
                curveTo(8.1085f, 0.1504f, 8.6012f, 0.6431f, 8.6012f, 1.2509f)
                close()
                moveTo(7.49999f, 3.29999f)
                curveTo(5.567f, 3.3f, 4f, 4.867f, 4f, 6.8f)
                verticalLineTo(10.25f)
                lineTo(4.00002f, 10.3009f)
                curveTo(4.0005f, 10.7463f, 4.0012f, 11.4084f, 3.6993f, 12f)
                horizontalLineTo(11.3007f)
                curveTo(10.9988f, 11.4084f, 10.9995f, 10.7463f, 11f, 10.3009f)
                lineTo(11f, 10.25f)
                verticalLineTo(6.79999f)
                curveTo(11f, 4.867f, 9.433f, 3.3f, 7.5f, 3.3f)
                close()
            }
        }.build()
        return _notifIcon!!
    }

private var _notifIcon: ImageVector? = null
