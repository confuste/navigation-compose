package com.alexfuster.navigationcompose.ui.screens.settings

import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.alexfuster.navigationcompose.R
import com.alexfuster.navigationcompose.ui.navigation.GeneralTopBar

@Composable
fun SettingsScreen(navController: NavHostController) {

    GeneralTopBar(navController, title = { Text(stringResource(id = R.string.settings_title)) }) {
        BodyContent()
    }

}

@Composable
fun BodyContent(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Settings"
        )
    }
}