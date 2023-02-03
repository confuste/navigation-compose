package com.alexfuster.navigationcompose.ui.navigation

sealed class AppScreens (val route: String) {
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object SettingsScreen: AppScreens ("settings_screen")
}