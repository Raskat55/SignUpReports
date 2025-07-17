package com.ortin.signupreport

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ortin.signupreport.presentation.screen.MainScreen

@Composable
fun NavigationRegistration(modifier: Modifier = Modifier) {
    val regController = rememberNavController()
    NavHost(navController = regController, startDestination = ""){

        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
        composable ( route = "StarnScreen" ){
            MainScreen(regController)
        }
    }
}