package ru.ar2code.composenavincapsulation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.ar2code.composenavincapsulation.screen_a.ScreenARoute
import ru.ar2code.composenavincapsulation.screen_b.ScreenBRoute
import ru.ar2code.composenavincapsulation.ui.theme.ComposeNavIncapsulationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavIncapsulationTheme {
                ExampleApp(navController = rememberNavController())
            }
        }
    }

    @Composable
    fun ExampleApp(navController: NavHostController) {
        NavHost(navController = navController, startDestination = ScreenARoute.route) {
            ScreenARoute.buildRoute(this, navController)
            ScreenBRoute.buildRoute(this, navController)
        }
    }
}

