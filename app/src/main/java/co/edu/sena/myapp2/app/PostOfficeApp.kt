package co.edu.sena.myapp2.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import co.edu.sena.myapp2.navigation.PostOfficeAppRouter
import co.edu.sena.myapp2.navigation.Screen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White,

        ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    Screen.SignUpScreen
                }

                is Screen.TermsAndConditionsScreen -> {
                    Screen.TermsAndConditionsScreen
                }
            }

        }
    }
}