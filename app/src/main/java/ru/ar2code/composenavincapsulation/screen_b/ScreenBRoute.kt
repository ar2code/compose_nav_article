package ru.ar2code.composenavincapsulation.screen_b

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.ar2code.composenavincapsulation.NavRoute

object ScreenBRoute : NavRoute {
    override val route = "screen_b"

    override fun buildRoute(builder: NavGraphBuilder, navController: NavController) {
        builder.composable(route) {
            ScreenB(state = hiltViewModel())
        }
    }
}