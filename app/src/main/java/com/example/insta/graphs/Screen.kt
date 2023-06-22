package com.example.insta.graphs

sealed class Screen(val route:String){
    object Splash : Screen("splash_screen")
    object MainScreen : Screen("main_screen")
}
