package com.neu.classmate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.neu.classmate.screens.AuthScreen
import com.neu.classmate.screens.LoginScreen
import com.neu.classmate.screens.SignupScreen

@Composable
fun AppNavigations(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.AuthScreen) {
        composable(Routes.AuthScreen){
            AuthScreen(navController)
        }
        composable(Routes.LoginScreen){
            LoginScreen(navController)
        }
        composable(Routes.SignupScreen){
            SignupScreen(navController)
        }
    }
}