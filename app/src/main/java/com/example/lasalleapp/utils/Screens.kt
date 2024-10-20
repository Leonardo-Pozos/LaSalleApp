package com.example.lasalleapp.utils

sealed class Screens (val route : String){
    data object Home : Screens("home")
    data object Grades :  Screens("grades")
    data object Calendar :  Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail : Screens("news-details")
    data object MateriaDetail : Screens("materia-details")
    data object PasswordChange : Screens("password-change")
    data object ThemeChange : Screens("theme-change")
    data object Pagos : Screens("pagos")
}