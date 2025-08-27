package com.example.whatsapclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whatsapclone.presentation.callsscreen.CallsScreen
import com.example.whatsapclone.presentation.communityscreen.CommunityScreen
import com.example.whatsapclone.presentation.homescreen.HomeScreen
import com.example.whatsapclone.presentation.splashscreen.SplashScreen
import com.example.whatsapclone.presentation.updatescreen.UpdateScreen
import com.example.whatsapclone.presentation.userregistrationscreen.UserRegistrationScreen
import com.example.whatsapclone.ui.theme.WhatsApCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsApCloneTheme {
                val navController = rememberNavController()
                AppNavHost(navController)
            }
        }
    }
}

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("user_registration") { UserRegistrationScreen(navController) }
        composable("home_screen") { HomeScreen(navController) }
        composable("update_screen") { UpdateScreen(navController) }
        composable("community_screen") { CommunityScreen(navController) }
        composable("call_screen") { CallsScreen(navController) }
    }
}