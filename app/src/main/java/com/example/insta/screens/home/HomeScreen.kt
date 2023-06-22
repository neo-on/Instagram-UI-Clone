package com.example.insta.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.insta.graphs.BottomNavGraph

@Composable
fun HomeScreen(){
    val navController:NavHostController= rememberNavController()
    
    Box(modifier = Modifier.fillMaxSize()){
        BottomNavGraph(navController = navController)
        Topbar(navController = navController)

        Row(modifier = Modifier
            .height(80.dp)
            .padding(5.dp, top = 8.dp), verticalAlignment = Alignment.CenterVertically) {
//            RoundImageIcon()
//            RoundImageIcon()
//            RoundImageIcon()
//            RoundImageIcon()
//            RoundImageIcon()

        }
    }
}