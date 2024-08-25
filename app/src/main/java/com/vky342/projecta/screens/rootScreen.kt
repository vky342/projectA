package com.vky342.projecta.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vky342.projecta.graphs.Graph
import com.vky342.projecta.graphs.RootNavigationGraph
import com.vky342.projecta.ui.theme.navbarGreye


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
    val (height,width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp }
    val topPadding = height.value * 0.15

    val HomeIcon = Icons.Outlined.Home
    var HomeIconColor = Color.White
    var HomebackgroundColor = navbarGreye

    val ProfileIcon = Icons.Outlined.Person
    var ProfileColor = Color.White
    var ProfilebackgroundColor = navbarGreye

    val SettingIcon = Icons.Outlined.Settings
    var SettingColor = Color.White
    var SettingBackgroundColor = navbarGreye


    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    fun colorFilling(){
        if (currentDestination?.parent?.route == Graph.HOME){
            HomeIconColor = Color.Black
            HomebackgroundColor = Color.White
        }
        if (currentDestination?.route == Graph.PROFILE) {
            ProfileColor = Color.Black
            ProfilebackgroundColor = Color.White
        }
        if (currentDestination?.route == Graph.SETTING) {
            SettingColor = Color.Black
            SettingBackgroundColor = Color.White
        }
    }

    colorFilling()

    BottomAppBar(modifier = Modifier
        .height(topPadding.dp)
        .fillMaxWidth(), containerColor = Color.Transparent){

        Box (modifier = Modifier.fillMaxSize()) {
            ElevatedCard (modifier = Modifier
                .width((width.value * 0.6).dp)
                .height((height.value * 0.1).dp)
                .align(Alignment.Center),
                shape = RoundedCornerShape(50),
                elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp),
                colors = CardDefaults.cardColors().copy(containerColor = Color.Black) ) {

                Box (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()){
                    Row (modifier = Modifier
                        .border(width = 0.dp, color = Color.Black, shape = RoundedCornerShape(50))
                        .clipToBounds()
                        .fillMaxWidth(0.95f)
                        .fillMaxHeight(0.85f)
                        .align(Alignment.Center)){


                        Box (modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)) {
                            Card(modifier = Modifier
                                .fillMaxSize(0.9f)
                                .align(Alignment.Center), shape = CircleShape, colors = CardDefaults.cardColors(containerColor = HomebackgroundColor)) {
                                Box (modifier = Modifier.fillMaxSize()){
                                    IconButton(modifier = Modifier.align(Alignment.Center),onClick = { navController.navigate(Graph.HOME)}) {
                                        Icon(modifier = Modifier
                                            .padding(2.dp)
                                            .fillMaxSize(),tint = HomeIconColor,imageVector = HomeIcon, contentDescription = "")
                                    }
                                }
                            }
                        }

                        Box (modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)) {
                            Card(modifier = Modifier
                                .fillMaxSize(0.9f)
                                .align(Alignment.Center), shape = CircleShape, colors = CardDefaults.cardColors(containerColor = ProfilebackgroundColor)) {
                                Box (modifier = Modifier.fillMaxSize()){
                                    IconButton(modifier = Modifier.align(Alignment.Center),onClick = { navController.navigate(Graph.PROFILE) }) {
                                        Icon(modifier = Modifier
                                            .padding(2.dp)
                                            .fillMaxSize(),tint = ProfileColor,imageVector = ProfileIcon, contentDescription = "")
                                    }
                                }
                            }
                        }

                        Box (modifier = Modifier.fillMaxSize().weight(1f)) {
                            Card(modifier = Modifier
                                .fillMaxSize(0.9f)
                                .align(Alignment.Center), shape = CircleShape, colors = CardDefaults.cardColors(containerColor = SettingBackgroundColor)) {
                                Box (modifier = Modifier.fillMaxSize()){
                                    IconButton(modifier = Modifier.align(Alignment.Center),onClick = { navController.navigate(Graph.SETTING)}) {
                                        Icon(modifier = Modifier
                                            .padding(2.dp)
                                            .fillMaxSize(),tint = SettingColor, imageVector = SettingIcon, contentDescription = "")
                                    }
                                }
                            }
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
        .background(color = Color.Transparent)
        .height(topPadding.dp)){
        Text(fontSize = 48.sp, color = Color.Black, fontWeight = FontWeight(500),text = "APP", modifier = Modifier
            .align(Alignment.Center)
            .padding(top = statusBar.dp))
    }

}