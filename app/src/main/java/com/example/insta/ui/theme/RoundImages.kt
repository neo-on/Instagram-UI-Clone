package com.example.insta.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundImageIcon(){
    Icon(imageVector = Icons.Default.Person, contentDescription = "Round Image " , modifier = Modifier.size(70.dp).clip(shape = CircleShape).background(
        Color.LightGray).padding(start = 7.dp))
}