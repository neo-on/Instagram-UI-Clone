package com.example.insta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.insta.ui.theme.InstaTheme
import com.example.insta.graphs.SetupNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            InstaTheme {
                val navController: NavHostController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstaTheme {

    }
}