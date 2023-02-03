package com.alexfuster.navigationcompose.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.alexfuster.navigationcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralTopBar(
    navController: NavController,
    title: @Composable () -> Unit = { Text(stringResource(id = R.string.app_name)) },
    bodyContent: @Composable () -> Unit,
) {
    Scaffold (
        topBar = {
            MyTopBar(
                title = title,
                navigationIcon = {
                    AppBarIcon(
                        imageVector = Icons.Default.ArrowBack,
                        onClick = { navController.popBackStack() })
                }
            )
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            bodyContent.invoke()
        }
    }
}