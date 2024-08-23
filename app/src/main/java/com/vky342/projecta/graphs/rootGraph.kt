package com.vky342.projecta.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vky342.projecta.screens.ProfileScreen
import com.vky342.projecta.screens.SettingScreen

@Composable
fun RootNavigationGraph(navController: NavHostController, paddingValues: PaddingValues){
    NavHost(navController = navController, startDestination = Graph.HOME, route = Graph.ROOT){
        HomeNavigationGraph(navController = navController)

        composable(route = Graph.PROFILE) {
            ProfileScreen()
        }

        composable(route = Graph.SETTING) {
            SettingScreen()
        }

    }

}

object Graph {
    const val ROOT = "Root_graph"
    const val HOME = "Home_graph"
    const val PROFILE = "Profile_graph"
    const val SETTING = "Setting_graph"
}