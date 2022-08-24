package ru.ar2code.composenavincapsulation.screen_b

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import ru.ar2code.composenavincapsulation.screen_a.ScreenA

@Composable
fun ScreenB(state: ScreenBViewModel) {
    Column {
        Text(text = "Hey, it's screen B. It has an embedded Scree A.")

        val context = LocalContext.current

        ScreenA(state = hiltViewModel()) {
            Toast.makeText(context, "click on Screen A button from Screen B", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
