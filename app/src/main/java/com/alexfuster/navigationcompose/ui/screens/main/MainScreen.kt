package com.alexfuster.navigationcompose.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.alexfuster.navigationcompose.R
import com.alexfuster.navigationcompose.ui.navigation.AppBarIcon
import com.alexfuster.navigationcompose.ui.navigation.AppScreens
import com.alexfuster.navigationcompose.ui.navigation.GeneralTopBar
import com.alexfuster.navigationcompose.ui.navigation.MyTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {

    GeneralTopBar(navController) {
        BodyContent(navController)
    }

    /*
    Scaffold (
        topBar = {
            MyTopBar(
                title = { Text(stringResource(id = R.string.app_name)) },
                navigationIcon = {
                    AppBarIcon(
                        imageVector = Icons.Default.ArrowBack,
                        onClick = { navController.popBackStack() })
                }
            )
        }
    ) { padding ->
        Surface(modifier = Modifier.padding(padding)) {
            BodyContent(navController)
        }
    } */
}

@Composable
fun BodyContent(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Main Screen",
            modifier = Modifier.clickable {
                navController.navigate(AppScreens.SettingsScreen.route)
                //navController.popBackStack()
            }
        )
    }
}