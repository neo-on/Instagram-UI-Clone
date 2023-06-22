package com.example.insta.graphs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Bottombarnav(val route: String, val title: String, val icon: ImageVector) {
    object Home : Bottombarnav(
        "home",
        "Home",
        Icons.Default.Home
    )

    object Discover : Bottombarnav(
        "dicover",
        "Discover",
        Icons.Default.Search
    )

    object Notification : Bottombarnav(
        "notification",
        "Notification",
        Icons.Default.Notifications
    )

    object Profile : Bottombarnav(
        "profile",
        "Profile",
        Icons.Default.Person
    )

    object TextScreen : Textnav("text")
}

