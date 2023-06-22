package com.example.insta.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.insta.screens.dicover.DiscoverScreen
import com.example.insta.screens.home.HomeScreen
import com.example.insta.screens.NotificationScreen
import com.example.insta.screens.ProfileScreen
import com.example.insta.screens.dicover.MainViewModel
import com.example.insta.screens.home.TextScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Bottombarnav.Home.route ){

        composable(Bottombarnav.Home.route){
            HomeScreen()
        }

        composable(Bottombarnav.Discover.route){
            DiscoverScreen()
        }

        composable(Bottombarnav.Notification.route){
            NotificationScreen()
        }

        composable(Bottombarnav.Profile.route){
            ProfileScreen()
        }

        composable(Bottombarnav.TextScreen.route){
            TextScreen()
        }

    }
}