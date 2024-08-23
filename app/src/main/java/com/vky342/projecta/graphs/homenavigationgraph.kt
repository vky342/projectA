package com.vky342.projecta.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.vky342.projecta.screens.HomeScreen


fun NavGraphBuilder.HomeNavigationGraph(navController: NavHostController){
    navigation(startDestination = "HomeScreen", route = Graph.HOME){
        composable(route = "HomeScreen"){
            HomeScreen(navController)
        }
    }
}