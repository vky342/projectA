package com.vky342.projecta.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vky342.projecta.graphs.Graph
import com.vky342.projecta.graphs.RootNavigationGraph


@Composable
fun RootScreen (navController: NavHostController = rememberNavController(), modifier: Modifier = Modifier) {
    Scaffold (topBar = { topAppBar() }, containerColor = Color.Gray,
        bottomBar = { BottomBar(navController = navController) }
    ){
        RootNavigationGraph(navController = navController, paddingValues = it)
    }
}

@Composable
fun BottomBar(navController: NavHostController){
    val height = LocalConfiguration.current.run { screenHeightDp.dp }
    val topPadding = height.value * 0.1
    val IconHeight = topPadding/3

    var HomeIcon = Icons.Outlined.Home
    var HomeIconColor = Color.Black

    var AccountIcon = Icons.Outlined.Person
    var AccountColor = Color.Black

    var Transicon = Icons.Outlined.Settings
    var TransColor = Color.Black


    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    fun colorFilling(){
        if (currentDestination?.parent?.route == Graph.HOME){
            HomeIcon = Icons.Filled.Home
            HomeIconColor = Color.Black
        }
        if (currentDestination?.parent?.route == Graph.PROFILE) {
            AccountIcon = Icons.Filled.Person
            AccountColor = Color.Black
        }
        if (currentDestination?.parent?.route == Graph.SETTING) {
            Transicon = Icons.Filled.Settings
            TransColor = Color.Black
        }
    }

    colorFilling()

    BottomAppBar(modifier = Modifier.height(topPadding.dp), containerColor = Color.LightGray){
        Box(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp), contentAlignment = Alignment.Center){

            Row (modifier = Modifier.wrapContentSize()){

                Column(modifier = Modifier.fillMaxHeight().weight(1f)) {

                    Box(modifier = Modifier
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally)){

                        Column(modifier = Modifier.fillMaxHeight().align(Alignment.Center)) {
                            Icon(imageVector = HomeIcon, tint = HomeIconColor, contentDescription = "home", modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(IconHeight.dp)
                                .clickable(onClick = {
                                    navController.navigate(Graph.HOME) {
                                        popUpTo(navController.graph.findStartDestination().id)
                                        launchSingleTop = true
                                    }
                                })
                            )
                            Text(text = "Home", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight(weight = 700), modifier = Modifier.align(
                                Alignment.CenterHorizontally))
                        }
                    }

                }

                Column (modifier = Modifier.fillMaxHeight().weight(1f)){

                    Box(modifier = Modifier
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally)){

                        Column(modifier = Modifier.fillMaxHeight().align(Alignment.Center)) {

                            Icon(imageVector = AccountIcon, tint = AccountColor, contentDescription = "Account", modifier = Modifier
                                .size(IconHeight.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable(onClick = {

                                    navController.navigate(Graph.PROFILE) {
                                        popUpTo(navController.graph.findStartDestination().id)
                                        launchSingleTop = true
                                    }
                                }))
                            Text(text = "Profile", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight(700), modifier = Modifier.align(
                                Alignment.CenterHorizontally))

                        }
                    }

                }

                Column (modifier = Modifier.fillMaxHeight().weight(1f)){


                    Box(modifier = Modifier
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally)){

                        Column(modifier = Modifier.fillMaxHeight().align(Alignment.Center)) {
                            Icon(imageVector = Transicon, tint = TransColor, contentDescription = "ADD Sale", modifier = Modifier
                                .size(IconHeight.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable(onClick = {

                                    navController.navigate(Graph.SETTING) {
                                        popUpTo(navController.graph.findStartDestination().id)
                                        launchSingleTop = true
                                    }
                                }))

                            Text(text = "Setting", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight(700), modifier = Modifier.align(
                                Alignment.CenterHorizontally))


                        }
                    }
                }

            }


        }


    }
}

@Preview
@Composable
fun topAppBar(){
    val height = LocalConfiguration.current.run { screenHeightDp.dp}
    val topPadding = height.value * 0.1
    val statusBar = topPadding * 0.3
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.LightGray)
        .height(topPadding.dp)){
        Text(fontSize = 34.sp, color = Color.Black, fontWeight = FontWeight(500),text = "OpenERP", modifier = Modifier
            .align(Alignment.Center)
            .padding(top = statusBar.dp))
    }

}