package com.alexfuster.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.alexfuster.navigationcompose.ui.navigation.AppBarIcon
import com.alexfuster.navigationcompose.ui.navigation.MyTopBar
import com.alexfuster.navigationcompose.ui.navigation.Navigation
import com.alexfuster.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {

            }
            Navigation()
        }
    }
}

/*
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!"
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigationComposeTheme {
        Greeting("Android")
    }
}
*/
