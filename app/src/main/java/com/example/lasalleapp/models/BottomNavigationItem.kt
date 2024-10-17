package com.example.lasalleapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.lasalleapp.utils.Screens

data class BottomNavigationItem (val title : String, val icon : ImageVector, val route : String){
    companion object{
        val items = listOf(
            BottomNavigationItem("Home", Icons.Default.Home, Screens.Home.route),
            BottomNavigationItem("Grades", Icons.Default.Menu, Screens.Grades.route),
            BottomNavigationItem("Calendar", Icons.Default.DateRange, Screens.Calendar.route),
            BottomNavigationItem("Settings", Icons.Default.Settings, Screens.Settings.route),
        )
    }
}