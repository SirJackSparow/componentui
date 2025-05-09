package com.fendy.componentui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val NotificationImportantIcon: ImageVector
    get() {
        if (_NotificationImportantIcon != null) {
            return _NotificationImportantIcon!!
        }
        _NotificationImportantIcon = ImageVector.Builder(
            name = "Notifications_active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
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
                moveTo(80f, 400f)
                quadToRelative(0f, -100f, 44.5f, -183.5f)
                reflectiveQuadTo(244f, 78f)
                lineToRelative(47f, 64f)
                quadToRelative(-60f, 44f, -95.5f, 111f)
                reflectiveQuadTo(160f, 400f)
                close()
                moveToRelative(720f, 0f)
                quadToRelative(0f, -80f, -35.5f, -147f)
                reflectiveQuadTo(669f, 142f)
                lineToRelative(47f, -64f)
                quadToRelative(75f, 55f, 119.5f, 138.5f)
                reflectiveQuadTo(880f, 400f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                moveTo(320f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                reflectiveQuadToRelative(-113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                close()
            }
        }.build()
        return _NotificationImportantIcon!!
    }

private var _NotificationImportantIcon: ImageVector? = null
