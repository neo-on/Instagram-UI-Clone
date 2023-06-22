package com.example.insta.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.insta.screens.AnimatedSpalshScreen
import com.example.insta.screens.MainScreen


@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screen.Splash.route ){
        composable(Screen.Splash.route){
            AnimatedSpalshScreen(navController = navController)
        }
        composable(Screen.MainScreen.route){
            MainScreen()
        }
    }

}

