package com.example.insta.screens

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.insta.graphs.Screen
import kotlinx.coroutines.delay

@Composable
fun AnimatedSpalshScreen(navController: NavController) {
    var startanimation by remember {
        mutableStateOf(false)
    }
    val alphaanime = animateFloatAsState(
        targetValue = if (startanimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1000,
            easing = FastOutSlowInEasing
        )
    )
    LaunchedEffect(key1 = true) {
        startanimation = true
        delay(3000)
        navController.popBackStack()
        navController.navigate(Screen.MainScreen.route)
    }

    splash(alpha = alphaanime.value)
}

@Composable
fun splash(alpha: Float) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .alpha(alpha)
            .background(if (isSystemInDarkTheme()) Color.Black else Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "logo",
            modifier = Modifier
                .size(120.dp)
               , tint = Color.White
        )
    }
}



