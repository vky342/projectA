package com.vky342.projecta.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vky342.projecta.R
import com.vky342.projecta.ui.theme.Greye
import com.vky342.projecta.ui.theme.navbarGreye

@Composable
fun HomeScreen (navController: NavController) {
    HomeScreenPreview()

}

@Preview
@Composable
fun HomeScreenPreview () {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1

    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(id = R.drawable.background),
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
                            Card (modifier = Modifier
                                .height((height.value * 0.08).dp)
                                .width((height.value * 0.08).dp)
                                .align(Alignment.Center), shape = CircleShape, colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
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
                                .align(Alignment.Center), shape = CircleShape,colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
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
                                .align(Alignment.Center), shape = CircleShape,colors = CardDefaults.cardColors().copy(containerColor = navbarGreye)) {
                                Box (modifier = Modifier.fillMaxSize()){

                                    Image(modifier = Modifier.fillMaxSize(0.8f)
                                        .align(Alignment.Center), contentScale = ContentScale.FillBounds,painter = painterResource(id = R.drawable.complain_icon), contentDescription = "")
                                }

                            }

                            Text(text = "complain", fontSize = 18.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomCenter))

                        }

                    }
                    
                }
            }
        }


    }

}