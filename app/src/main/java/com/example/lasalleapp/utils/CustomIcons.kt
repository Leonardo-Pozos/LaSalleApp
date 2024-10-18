package com.example.lasalleapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null


public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
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
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null

public val CashCoin: ImageVector
    get() {
        if (_CashCoin != null) {
            return _CashCoin!!
        }
        _CashCoin = ImageVector.Builder(
            name = "CashCoin",
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
                moveTo(11f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                moveToRelative(5f, -4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
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
                moveTo(9.438f, 11.944f)
                curveToRelative(0.047f, 0.596f, 0.518f, 1.06f, 1.363f, 1.116f)
                verticalLineToRelative(0.44f)
                horizontalLineToRelative(0.375f)
                verticalLineToRelative(-0.443f)
                curveToRelative(0.875f, -0.061f, 1.386f, -0.529f, 1.386f, -1.207f)
                curveToRelative(0f, -0.618f, -0.39f, -0.936f, -1.09f, -1.1f)
                lineToRelative(-0.296f, -0.07f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.376f, 0.043f, 0.614f, 0.248f, 0.671f, 0.532f)
                horizontalLineToRelative(0.658f)
                curveToRelative(-0.047f, -0.575f, -0.54f, -1.024f, -1.329f, -1.073f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-0.375f)
                verticalLineToRelative(0.45f)
                curveToRelative(-0.747f, 0.073f, -1.255f, 0.522f, -1.255f, 1.158f)
                curveToRelative(0f, 0.562f, 0.378f, 0.92f, 1.007f, 1.066f)
                lineToRelative(0.248f, 0.061f)
                verticalLineToRelative(1.272f)
                curveToRelative(-0.384f, -0.058f, -0.639f, -0.27f, -0.696f, -0.563f)
                horizontalLineToRelative(-0.668f)
                close()
                moveToRelative(1.36f, -1.354f)
                curveToRelative(-0.369f, -0.085f, -0.569f, -0.26f, -0.569f, -0.522f)
                curveToRelative(0f, -0.294f, 0.216f, -0.514f, 0.572f, -0.578f)
                verticalLineToRelative(1.1f)
                close()
                moveToRelative(0.432f, 0.746f)
                curveToRelative(0.449f, 0.104f, 0.655f, 0.272f, 0.655f, 0.569f)
                curveToRelative(0f, 0.339f, -0.257f, 0.571f, -0.709f, 0.614f)
                verticalLineToRelative(-1.195f)
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
                moveTo(1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.083f)
                quadToRelative(0.088f, -0.517f, 0.258f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(3.528f)
                curveToRelative(0.38f, 0.34f, 0.717f, 0.728f, 1f, 1.154f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
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
                moveTo(9.998f, 5.083f)
                lineTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.132f, 1.65f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, -1.567f)
            }
        }.build()
        return _CashCoin!!
    }

private var _CashCoin: ImageVector? = null



public val Format_paint: ImageVector
    get() {
        if (_Format_paint != null) {
            return _Format_paint!!
        }
        _Format_paint = ImageVector.Builder(
            name = "Format_paint",
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
                moveTo(440f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 880f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 280f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        return _Format_paint!!
    }

private var _Format_paint: ImageVector? = null

public val Check_circle: ImageVector
    get() {
        if (_Check_circle != null) {
            return _Check_circle!!
        }
        _Check_circle = ImageVector.Builder(
            name = "Check_circle",
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
                moveTo(424f, 664f)
                lineToRelative(282f, -282f)
                lineToRelative(-56f, -56f)
                lineToRelative(-226f, 226f)
                lineToRelative(-114f, -114f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(56f, 216f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                moveToRelative(0f, -320f)
            }
        }.build()
        return _Check_circle!!
    }

private var _Check_circle: ImageVector? = null


public val ErrorIcon: ImageVector
    get() {
        if (_Error != null) {
            return _Error!!
        }
        _Error = ImageVector.Builder(
            name = "Error",
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
                moveTo(8.6f, 1f)
                curveToRelative(1.6f, 0.1f, 3.1f, 0.9f, 4.2f, 2f)
                curveToRelative(1.3f, 1.4f, 2f, 3.1f, 2f, 5.1f)
                curveToRelative(0f, 1.6f, -0.6f, 3.1f, -1.6f, 4.4f)
                curveToRelative(-1f, 1.2f, -2.4f, 2.1f, -4f, 2.4f)
                curveToRelative(-1.6f, 0.3f, -3.2f, 0.1f, -4.6f, -0.7f)
                curveToRelative(-1.4f, -0.8f, -2.5f, -2f, -3.1f, -3.5f)
                curveTo(0.9f, 9.2f, 0.8f, 7.5f, 1.3f, 6f)
                curveToRelative(0.5f, -1.6f, 1.4f, -2.9f, 2.8f, -3.8f)
                curveTo(5.4f, 1.3f, 7f, 0.9f, 8.6f, 1f)
                close()
                moveToRelative(0.5f, 12.9f)
                curveToRelative(1.3f, -0.3f, 2.5f, -1f, 3.4f, -2.1f)
                curveToRelative(0.8f, -1.1f, 1.3f, -2.4f, 1.2f, -3.8f)
                curveToRelative(0f, -1.6f, -0.6f, -3.2f, -1.7f, -4.3f)
                curveToRelative(-1f, -1f, -2.2f, -1.6f, -3.6f, -1.7f)
                curveToRelative(-1.3f, -0.1f, -2.7f, 0.2f, -3.8f, 1f)
                curveToRelative(-1.1f, 0.8f, -1.9f, 1.9f, -2.3f, 3.3f)
                curveToRelative(-0.4f, 1.3f, -0.4f, 2.7f, 0.2f, 4f)
                curveToRelative(0.6f, 1.3f, 1.5f, 2.3f, 2.7f, 3f)
                curveToRelative(1.2f, 0.7f, 2.6f, 0.9f, 3.9f, 0.6f)
                close()
                moveTo(7.9f, 7.5f)
                lineTo(10.3f, 5f)
                lineToRelative(0.7f, 0.7f)
                lineToRelative(-2.4f, 2.5f)
                lineToRelative(2.4f, 2.5f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(-2.4f, -2.5f)
                lineToRelative(-2.4f, 2.5f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(2.4f, -2.5f)
                lineToRelative(-2.4f, -2.5f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(2.4f, 2.5f)
                close()
            }
        }.build()
        return _Error!!
    }

private var _Error: ImageVector? = null
