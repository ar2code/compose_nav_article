package ru.ar2code.composenavincapsulation.screen_a

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import ru.ar2code.composenavincapsulation.screen_b.ScreenBRoute

@Composable
fun ScreenA(state: ScreenAViewModel, onSubmit: () -> Unit) {
    Column {
        Text(text = "Hey, it's screen A. Click button to submit.")
        Button(onClick = onSubmit) {
            Text(text = "Submit")
        }
    }
}

@Composable
fun ScreenABad(state: ScreenAViewModel, navController: NavController) {
    Column {
        Text(text = "Hey, it's screen A. Click button to submit.")
        Button(onClick = {
            navController.navigate(ScreenBRoute.route)
        }) {
            Text(text = "Submit")
        }
    }
}
