package com.example.insta.screens.home

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.insta.graphs.Bottombarnav

@Composable
fun Topbar(navController: NavHostController) {


    TopAppBar {


        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "CLONE",
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .weight(5f)
                    .padding(start = 10.dp),
                softWrap = true,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                fontSize = 23.sp
            )

            IconButton(onClick = { navController.navigate(Bottombarnav.TextScreen.route) }) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send message",
                    tint = if (isSystemInDarkTheme()) Color.White else Color.Black,
                    modifier = Modifier
                        .weight(1f)
                        .rotate(-30f)
                )
            }
        }

    }
}

