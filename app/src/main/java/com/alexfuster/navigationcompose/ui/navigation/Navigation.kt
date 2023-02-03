package com.alexfuster.navigationcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexfuster.navigationcompose.ui.screens.main.MainScreen
import com.alexfuster.navigationcompose.ui.screens.settings.SettingsScreen
import com.alexfuster.navigationcompose.ui.screens.splash.SplashScreen


@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {
        composable(route = AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(route = AppScreens.MainScreen.route) {
            MainScreen( navController)
        }
        composable(route = AppScreens.SettingsScreen.route) {
            SettingsScreen(navController)
        }
    }
}