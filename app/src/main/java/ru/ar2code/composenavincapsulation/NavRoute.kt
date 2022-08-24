package ru.ar2code.composenavincapsulation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface NavRoute {

    val route : String

    fun buildRoute(builder: NavGraphBuilder, navController: NavController)
}