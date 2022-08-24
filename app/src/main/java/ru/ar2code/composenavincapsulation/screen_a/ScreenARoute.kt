package ru.ar2code.composenavincapsulation.screen_a

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.ar2code.composenavincapsulation.NavRoute
import ru.ar2code.composenavincapsulation.screen_b.ScreenBRoute

object ScreenARoute : NavRoute {

    override val route = "screen_a"

    override fun buildRoute(builder: NavGraphBuilder, navController: NavController) {
        builder.composable(route) {
            ScreenA(state = hiltViewModel(), onSubmit = {
                navigateToScreenB(navController)
            })
        }
    }

    private fun navigateToScreenB(navController: NavController) {
        navController.navigate(ScreenBRoute.route)
    }
}