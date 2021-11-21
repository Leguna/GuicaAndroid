package site.arksana.guica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import site.arksana.guica.composables.LoginPage
import site.arksana.guica.composables.RegisterPage
import site.arksana.guica.ui.theme.GuicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            GuicaTheme {
                GuicaApplication()
            }
        }
    }


    @Composable
    fun GuicaApplication() {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = Screen.LoginScreen.route,
            builder = {
                composable(route = Screen.LoginScreen.route) {
                    LoginPage(navController = navController)
                }
                composable(route = Screen.RegisterScreen.route) {
                    RegisterPage(navController = navController)
                }
            })
    }
}
