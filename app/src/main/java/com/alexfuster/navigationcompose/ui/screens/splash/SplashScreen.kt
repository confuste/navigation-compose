package com.alexfuster.navigationcompose.ui.screens.splash



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.alexfuster.navigationcompose.ui.navigation.AppScreens
import com.alexfuster.navigationcompose.ui.navigation.MyTopBar
import com.alexfuster.navigationcompose.ui.screens.main.MainScreen

@Composable
fun SplashScreen(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Splash Screen",
            )
            Button(
                onClick = {
                    navController.navigate(AppScreens.MainScreen.route)
                },
            ) {
                Text(text = "To Main Screen")
            }
        }
    }
}