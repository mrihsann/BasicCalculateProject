package com.ihsanarslan.nesnetabanliprogramlama.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.ihsanarslan.nesnetabanliprogramlama.views.CalculateScreen
import com.ihsanarslan.nesnetabanliprogramlama.views.ResultScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Router.Calculate) {

        composable<Router.Calculate> {
            CalculateScreen(navController)
        }

        composable<Router.Result> {
            val args = it.toRoute<Router.Result>()
            ResultScreen(navController = navController,result = args.result)
        }

    }
}