package com.example.insta.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.insta.graphs.BottomNavGraph
import com.example.insta.graphs.Bottombarnav

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController: NavHostController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController = navController) }) {
        BottomNavGraph(navController = navController )
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        Bottombarnav.Home,
        Bottombarnav.Discover,
        Bottombarnav.Notification,
        Bottombarnav.Profile,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val curentdestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = if (isSystemInDarkTheme()) Color.Black else Color.DarkGray,
        contentColor = if (isSystemInDarkTheme()) Color.White else Color.Black,
        elevation = 3.dp
    ) {

        screens.forEach { screen ->
            if (curentdestination != null) {
                AddItem(
                    screen = screen,
                    navController = navController,
                    curentdestination = curentdestination
                )
            }
        }

    }
}

@Composable
fun RowScope.AddItem(
    screen: Bottombarnav,
    navController: NavHostController,
    curentdestination: NavDestination
) {

    BottomNavigationItem(
        label =
        { Text(text = screen.title) },
        icon = { Icon(imageVector = screen.icon, contentDescription = "Icon Image") },
        onClick = {
            navController.popBackStack()
            navController.navigate(screen.route)
        },
        selected = curentdestination.hierarchy.any {
            it.route == screen.route
        }, unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled)

    )
}

