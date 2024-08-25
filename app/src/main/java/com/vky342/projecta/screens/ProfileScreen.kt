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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vky342.projecta.R
import com.vky342.projecta.ui.theme.navbarGreye

@Preview
@Composable
fun ProfileScreen() {
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
            Column (modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.4f)){
                        Card (modifier = Modifier
                            .height((height.value * 0.3).dp)
                            .width((height.value * 0.3).dp)
                            .align(Alignment.Center),
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            shape = CircleShape, colors = CardDefaults.cardColors().copy(containerColor = Color.Black)) {
                            Box (modifier = Modifier.fillMaxSize()) {

                                Image(modifier = Modifier
                                    .fillMaxSize()
                                    .align(Alignment.Center)
                                    .fillMaxSize(),painter = painterResource(id = R.drawable.newpic), contentScale = ContentScale.Crop, contentDescription = "")

                            }
                        }
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.4f)){

                    Row (modifier = Modifier.fillMaxSize()) {
                        Column (modifier = Modifier
                            .fillMaxSize()
                            .weight(0.6f)) {
                            //name
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "Name : ", fontSize = 18.sp, color = Color.White, modifier = Modifier.align(Alignment.CenterEnd))

                            }
                            //age
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "Age : ", fontSize = 18.sp, color = Color.White, modifier = Modifier.align(Alignment.CenterEnd))

                            }
                            //gender
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "Gender : ", fontSize = 18.sp, color = Color.White, modifier = Modifier.align(Alignment.CenterEnd))

                            }
                            //contact
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "Contact : ", fontSize = 18.sp, color = Color.White, modifier = Modifier.align(Alignment.CenterEnd))

                            }
                            
                        }
                        Column (modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)) {

                            //name
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "   Something Something", fontSize = 18.sp, fontWeight = FontWeight(800), color = Color.White, modifier = Modifier.align(Alignment.CenterStart))

                            }
                            //age
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "   24 yrs", fontSize = 18.sp,fontWeight = FontWeight(800), color = Color.White, modifier = Modifier.align(Alignment.CenterStart))

                            }
                            //gender
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "   Female", fontSize = 18.sp,fontWeight = FontWeight(800), color = Color.White, modifier = Modifier.align(Alignment.CenterStart))

                            }
                            //contact
                            Box (modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)) {
                                Text(text = "   2985648379", fontSize = 18.sp,fontWeight = FontWeight(800), color = Color.White, modifier = Modifier.align(Alignment.CenterStart))

                            }

                        }
                    }


                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.2f)){

                    Button(modifier = Modifier
                        .height((height.value * 0.06).dp)
                        .width((height.value * 0.2).dp)
                        .align(Alignment.Center),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                        ,shape = RoundedCornerShape(20), colors = ButtonDefaults.buttonColors().copy(containerColor = navbarGreye),onClick = { /*TODO*/ }) {
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()){
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .weight(0.8f)){
                                Text(text = "Logout", fontSize = 20.sp, color = Color.White, modifier = Modifier.align(Alignment.Center))
                            }
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .weight(0.2f)){

                                Image(painter = painterResource(id = R.drawable.log), colorFilter = ColorFilter.tint(color = Color.White), contentDescription = "", modifier = Modifier.align(Alignment.Center))

                            }
                        }
                    }

                }
            }
        }
    }
}