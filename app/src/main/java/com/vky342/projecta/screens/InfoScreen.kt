package com.vky342.projecta.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vky342.projecta.R
import com.vky342.projecta.ui.theme.Greye
import com.vky342.projecta.ui.theme.GreyeHome
import com.vky342.projecta.ui.theme.Purple40
import com.vky342.projecta.ui.theme.Purple80
import com.vky342.projecta.ui.theme.navbarGreye

@Preview
@Composable
fun infoScreen() {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.15

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

                Box (modifier = Modifier
                    .fillMaxSize()
                    .weight(1.0f)) {

                    Card (border = BorderStroke(width = 2.dp, color = navbarGreye),colors = CardDefaults.cardColors(containerColor = GreyeHome.copy(alpha = 0.8f)),modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .fillMaxHeight()
                        .align(Alignment.Center)) {
                        Box (modifier = Modifier.fillMaxSize()) {

                            Column (modifier = Modifier.fillMaxSize()) {
                                Box (modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()){
                                    Row ( modifier = Modifier.wrapContentSize()){
                                        Icon(imageVector = Icons.Filled.Info, contentDescription = "", tint = Color.Green, modifier = Modifier.padding(6.dp))
                                        Text(text = "Live Safety Status", fontSize = 14.sp,color = Color.Gray, modifier = Modifier.align(Alignment.CenterVertically).padding(horizontal = 6.dp))
                                    }
                                }
                                Column (modifier = Modifier
                                    .fillMaxSize()
                                    .align(Alignment.CenterHorizontally)) {

                                    Card (elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .size((height.value * 0.18).dp), shape = CircleShape, colors = CardDefaults.cardColors(containerColor = GreyeHome), border = BorderStroke(width = 2.dp, color = navbarGreye)) {
                                        Box (modifier = Modifier.fillMaxSize()){
                                            Card (modifier = Modifier
                                                .align(Alignment.Center)
                                                .size(115.dp), shape = CircleShape, border = BorderStroke(width = 10.dp, brush = Brush.radialGradient(colors = listOf(Color.Green, Color.Green,Color.Black))), colors = CardDefaults.cardColors(containerColor = Color.Green)) {

                                            }
                                        }
                                    }

                                    Box (modifier = Modifier.fillMaxSize()){
                                        Card (elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),colors = CardDefaults.cardColors(containerColor = Greye),modifier = Modifier
                                            .wrapContentSize()
                                            .align(Alignment.Center)) {
                                            Box(modifier = Modifier
                                                .width((width.value * 0.4).dp)
                                                .height((height.value * 0.07).dp)
                                                .align(Alignment.CenterHorizontally)) {
                                                Row (modifier = Modifier
                                                    .wrapContentSize()
                                                    .align(Alignment.Center)) {

                                                    Text(text = "Status",color = Color.LightGray, fontSize = 20.sp, fontWeight = FontWeight(350),modifier = Modifier.align(Alignment.CenterVertically))
                                                    Text(text = " : ", color = Color.LightGray, fontSize = 20.sp, fontWeight = FontWeight(400))
                                                    Text(text = "Safe", color = Color.Green, fontSize = 20.sp, fontWeight = FontWeight(800))

                                                }
                                            }
                                        }

                                    }
                                }
                            }


                        }

                    }


                }
                Box (modifier = Modifier
                    .fillMaxSize()
                    .weight(1.25f)) {

                    Card (elevation = CardDefaults.cardElevation(defaultElevation = 10.dp), border = BorderStroke(width = 2.dp, color = navbarGreye),modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .align(Alignment.Center)
                        .height((height.value * 0.25).dp), colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.8f))) {
                        Box (modifier = Modifier.fillMaxSize()) {

                            Column (modifier = Modifier.fillMaxSize()){

                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(0.23f)) {
                                    Icon(imageVector = Icons.Filled.Info, tint = Color.Cyan,contentDescription = "", modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .padding(6.dp))
                                    Spacer(modifier = Modifier
                                        .fillMaxHeight()
                                        .width(10.dp)
                                        .align(Alignment.CenterVertically))
                                    Text(text = "Live count for current region", fontSize = 14.sp, color = Purple80, modifier = Modifier.align(Alignment.CenterVertically))

                                }
                                HorizontalBarGraph(value1 = 0.6f, value2 = 0.4f, modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .weight(1f))



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
fun asdfsdk() {
}




@Composable
fun HorizontalBarGraph(value1: Float, value2: Float, modifier: Modifier) {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1
    val barWidth1 by animateDpAsState(targetValue = (value1 * 300).dp)
    val barWidth2 by animateDpAsState(targetValue = (value2 * 300).dp)

    Column (modifier = modifier
        .height((height.value * 0.15).dp)
        .fillMaxWidth(0.9f)) {

        Box (modifier = Modifier.fillMaxSize()) {
            Column (modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box (modifier = Modifier.fillMaxWidth(0.3f)){

                        Text("Male", fontSize = 17.sp, fontWeight = FontWeight(600), color = Color.Cyan, modifier = Modifier.align(Alignment.Center))
                    }
                    Spacer(modifier = Modifier
                        .width(3.dp)
                        .height(30.dp)
                        .background(color = Color.Gray))
                    Card(shape = RoundedCornerShape(20), colors = CardDefaults.cardColors(containerColor = Color.Cyan),
                        modifier = Modifier
                            .height(45.dp)
                            .width(barWidth1)
                            .padding(5.dp)
                    ){
                        Box(modifier = Modifier.fillMaxSize()) {

                            Text(text = "80", modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .padding(7.dp), fontWeight = FontWeight(700), color = Color.Black)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box (modifier = Modifier.fillMaxWidth(0.3f)){

                        Text("Female", fontSize = 17.sp, fontWeight = FontWeight(600), color = Purple80, modifier = Modifier.align(Alignment.Center))
                    }
                    Spacer(modifier = Modifier
                        .width(3.dp)
                        .height(30.dp)
                        .background(color = Color.Gray))
                    Card(shape = RoundedCornerShape(20), colors = CardDefaults.cardColors(containerColor = Purple80),
                        modifier = Modifier
                            .height(45.dp)
                            .width(barWidth2)
                            .padding(5.dp)
                    ){
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text(text = "60",modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .padding(7.dp), fontWeight = FontWeight(700), color = Color.Black)
                        }
                    }
                }
            }
        }

    }
}