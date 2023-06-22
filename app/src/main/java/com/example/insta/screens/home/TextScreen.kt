package com.example.insta.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TextScreen() {
    val shimmercolors = listOf(
        Color.LightGray.copy(alpha = 0.6f),
        Color.LightGray.copy(alpha = 0.2f),
        Color.LightGray.copy(alpha = 0.6f),
    )
    LazyColumn(Modifier.padding(top=56.dp)) {
        item {


            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
            AnimatedShimmer()
        }
    }
}