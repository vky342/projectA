package com.vky342.projecta.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vky342.projecta.R
import com.vky342.projecta.ui.theme.navbarGreye

@Composable
fun HomeScreen (navController: NavController) {
    HomeScreenPreview(navController)

}


@Composable
fun HomeScreenPreview (navController: NavController) {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1

    // State to track the current elevation of the card
    var isPressed by remember { mutableStateOf(false) }

    // Animate elevation based on whether the card is pressed or not
    val elevation: Dp by animateDpAsState(
        targetValue = if (isPressed) 30.dp else 4.dp
    )

    // State to control the color of the card
    var isToggled by remember { mutableStateOf(false) }

    // Animated color based on the isToggled state
    val backgroundColor by animateColorAsState(
        targetValue = if (isToggled) Color.Red else Color.Cyan,
        animationSpec = tween(durationMillis = 500) // Customize duration as needed
    )

    var SOScounternumber by remember {

        mutableStateOf(0)
    }

    fun SOScounterIncrese() {

        if (SOScounternumber < 4){
            isToggled = false
            SOScounternumber += 1
        }
        if (SOScounternumber == 4) {
            isToggled = true
            SOScounternumber = 0
        }

    }



    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(id = if (isToggled) R.drawable.backgroundredbacg else R.drawable.background),
            contentScale = ContentScale.FillBounds
        )){

        Box (modifier = Modifier
            .padding(top = topPadding.dp, bottom = topPadding.dp)
            .fillMaxSize()){
            Column (modifier = Modifier
                .fillMaxHeight(0.97f)
                .fillMaxWidth(0.8f)
                .align(Alignment.Center)){
                Row (modifier = Modifier
                    .height((height.value * 0.07).dp)
                    .width(width)){
                        Icon(modifier = Modifier
                            .fillMaxSize()
                            .weight(1f), tint = Color.Black,imageVector = Icons.Outlined.Place, contentDescription = "")
                        Column (modifier = Modifier
                            .fillMaxHeight(0.8f)
                            .weight(8f)
                            .align(Alignment.CenterVertically)){
                            Text(text = "Live mini map", fontWeight = FontWeight(500), color = Color.Black, fontSize = 15.sp, modifier = Modifier
                                .weight(0.9f)
                                .align(Alignment.Start))
                            Text(text = "tap on the map for detailed view", fontWeight = FontWeight(450), color = Color.Black, fontSize = 11.sp, modifier = Modifier
                                .weight(1f)
                                .align(Alignment.Start))

                        }
                }
                Box (modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)) {

                    Card (elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),shape = RoundedCornerShape(12), colors = CardDefaults.cardColors(containerColor = Color.Black), modifier = Modifier.fillMaxSize()) {
                        Card (shape = RoundedCornerShape(12), modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize()) {
                            Image(painter = painterResource(id = R.drawable.image_24_08_24_at_12_22am), contentScale = ContentScale.Crop, contentDescription = "")
                        }
                    }

                }
                Box (modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f)) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.7f)
                        .align(Alignment.Center)){

                        Box (modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)){
                            Card (onClick = {navController.navigate("info")},modifier = Modifier
                                .height((height.value * 0.08).dp)
                                .width((height.value * 0.08).dp)
                                .align(Alignment.Center),
                                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                                shape = CircleShape, colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
                                Box (modifier = Modifier.fillMaxSize()){
                                    Icon(modifier = Modifier
                                        .fillMaxSize(0.95f)
                                        .align(Alignment.Center),tint = Color.Cyan,imageVector = Icons.Outlined.Info, contentDescription = "")

                                }
                            }

                            Text(text = "info", fontSize = 18.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomCenter))

                        }
                        Box (modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)){
                            Card (modifier = Modifier
                                .height((height.value * 0.08).dp)
                                .width((height.value * 0.08).dp)
                                .align(Alignment.Center),
                                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                                shape = CircleShape,colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
                                Box (modifier = Modifier.fillMaxSize()){
                                    Image(modifier = Modifier
                                        .fillMaxSize(0.8f)
                                        .align(Alignment.Center), contentScale = ContentScale.FillBounds,painter = painterResource(id = R.drawable.car_icon), contentDescription = "")
                                }
                            }
                            Text(text = "help", fontSize = 18.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomCenter))
                        }
                        Box (modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)){
                            Card (modifier = Modifier
                                .height((height.value * 0.08).dp)
                                .width((height.value * 0.08).dp)
                                .align(Alignment.Center),
                                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                                shape = CircleShape,colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
                                Box (modifier = Modifier.fillMaxSize()){

                                    Image(modifier = Modifier
                                        .fillMaxSize(0.8f)
                                        .align(Alignment.Center), contentScale = ContentScale.FillBounds,painter = painterResource(id = R.drawable.complain_icon), contentDescription = "")
                                }

                            }

                            Text(text = "complain", fontSize = 18.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomCenter))

                        }

                    }
                    
                }
                val brush= Brush.radialGradient(listOf(Color.Cyan, Color.Transparent))
                val brush2 = Brush.radialGradient(listOf(Color.Red, Color.Transparent))

                Box (modifier = Modifier
                    .fillMaxSize(0.85f)
                    .align(Alignment.CenterHorizontally)) {
                    Card (modifier = Modifier
                        .height((height.value * 0.27).dp)
                        .width((height.value * 0.27).dp)
                        .align(Alignment.Center)
                        .background(
                            if (isToggled) brush2 else brush,
                            shape = CircleShape
                        ),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors().copy(containerColor = Color.Transparent)) {
                        Box (modifier = Modifier
                            .fillMaxSize()
                            .clipToBounds()
                            .background(color = Color.Transparent)) {
                            Card (onClick = {
                                SOScounterIncrese()
                            },modifier = Modifier
                                .pointerInput(Unit) {
                                    detectTapGestures(
                                        onPress = {
                                            isPressed = true // Elevate the card on press
                                            tryAwaitRelease() // Wait for the release event
                                            isPressed =
                                                false // Return to default elevation after release
                                        },
                                        onTap = {
                                            // You can handle click event here if needed
                                        }
                                    )
                                }
                                .height((height.value * 0.18).dp)
                                .width((height.value * 0.18).dp)
                                .align(Alignment.Center), elevation = CardDefaults.cardElevation(defaultElevation = elevation),colors = CardDefaults.cardColors().copy(containerColor = backgroundColor),shape = CircleShape) {
                                
                                Box (modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = Color.Transparent)){
                                    Text(text = "SOS", fontSize = 45.sp, color = Color.Black, fontWeight = FontWeight(300), modifier = Modifier.align(Alignment.Center))
                                }
                                
                            }
                        }
                    }
                }

            }
        }


    }

}