package com.ortin.signupreport

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ortin.signupreport.presentation.screen.MainScreen
import com.ortin.signupreport.screen.registration.CheckMailRegistrationScreen
import com.ortin.signupreport.screen.registration.ForgotpasswordScreen
import com.ortin.signupreport.screen.registration.ImputRigistrationData
import com.ortin.signupreport.screen.registration.RegistrationRole
import com.ortin.signupreport.screen.registration.RequestSubmittedScreen
import com.ortin.signupreport.screen.registration.WelcomToAVBScreen

@Composable
fun NavigationRegistration(modifier: Modifier = Modifier) {
    val regController = rememberNavController()
    NavHost(navController = regController, startDestination = "MainScreen"){

        composable ( route = "MainScreen" ){
            MainScreen(regController)
        }
        composable ( route = "RegistrationRole" ){
            RegistrationRole(regController)
        }
        composable ( route = "ImputRigistrationData" ){
            ImputRigistrationData(regController)
        }
        composable ( route = "CheckMailRegistrationScreen" ) {
            CheckMailRegistrationScreen(regController)
        }
        composable ( route = "RequestSubmittedScreen" ){
            RequestSubmittedScreen(regController)
        }
        composable ( route = "WelcomToAVBScreen" ){
            WelcomToAVBScreen(regController)
        }
        composable ( route = "ForgotpasswordScreen" ){
            ForgotpasswordScreen(regController)
        }
    }
}