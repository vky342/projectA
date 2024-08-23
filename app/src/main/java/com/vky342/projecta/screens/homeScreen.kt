package com.vky342.projecta.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vky342.projecta.ui.theme.Greye

@Composable
fun HomeScreen (navController: NavController) {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1

    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(top = topPadding.dp, bottom = topPadding.dp)) {

        Box (modifier = Modifier
            .fillMaxSize()
            .background(color = Greye)) {
            Card(modifier = Modifier.width((width.value * 0.7).dp).height((height.value * 0.5).dp).padding(20.dp), colors = CardDefaults.cardColors().copy(containerColor = Color.Black)) {
                Text(text = "Card", color = Color.White, fontSize = 18.sp)
            }

        }

    }

}

@Preview
@Composable
fun HomeScreenPreview () {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1

    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(top = topPadding.dp, bottom = topPadding.dp)) {

        Box (modifier = Modifier
            .fillMaxSize()
            .background(color = Greye)) {
            Text(text = "Welcome Screen", color = Color.White)
            Card(modifier = Modifier.width((width.value * 0.7).dp).height((height.value * 0.5).dp), colors = CardDefaults.cardColors().copy(containerColor = Color.Black)) {
                Text(text = "Card", color = Color.White, fontSize = 18.sp)
            }

        }

    }

}