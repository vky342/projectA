package com.vky342.projecta.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
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
fun SettingScreen () {
    val (height, width) = LocalConfiguration.current.run { screenHeightDp.dp to screenWidthDp.dp}
    val topPadding = height.value * 0.1

    var fakecallswitch by remember {
        mutableStateOf(false)
    }

    var fakecallColor by remember {
        mutableStateOf(Color.LightGray)
    }

    fun fakeColorChange(FakecallColor: Color) {
        if (FakecallColor == Color.LightGray) {
            fakecallColor = Color.Cyan
        }
        else {
            fakecallColor = Color.LightGray
        }
    }

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
                .fillMaxSize().padding(top = (topPadding * 0.5).dp)) {
                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp), trailingIcon = { Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = ""
                )}, leadingIcon = { Icon(tint = Color.LightGray,imageVector = Icons.Default.Person, contentDescription = "")},value = "Something Something", onValueChange = {}, label = { Text(text = "Name")}, colors = TextFieldDefaults.colors().copy(focusedContainerColor = navbarGreye, unfocusedContainerColor = Color.Black, focusedTextColor = Color.White, unfocusedTextColor = Color.Cyan, focusedLabelColor = Color.White, unfocusedLabelColor = Color.Gray, unfocusedIndicatorColor = Color.Gray, focusedIndicatorColor = Color.Cyan))

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp), trailingIcon = { Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = ""
                )}, leadingIcon = { Icon(tint = Color.LightGray,imageVector = Icons.Default.DateRange, contentDescription = "")},value = "24", onValueChange = {}, label = { Text(text = "Age")}, colors = TextFieldDefaults.colors().copy(focusedContainerColor = navbarGreye, unfocusedContainerColor = Color.Black, focusedTextColor = Color.White, unfocusedTextColor = Color.Cyan, focusedLabelColor = Color.White, unfocusedLabelColor = Color.Gray, unfocusedIndicatorColor = Color.Gray, focusedIndicatorColor = Color.Cyan))

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp), trailingIcon = { Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = ""
                )}, leadingIcon = { Icon(tint = Color.LightGray,imageVector = Icons.Default.Face, contentDescription = "")},value = "Female", onValueChange = {}, label = { Text(text = "Gender")}, colors = TextFieldDefaults.colors().copy(focusedContainerColor = navbarGreye, unfocusedContainerColor = Color.Black, focusedTextColor = Color.White, unfocusedTextColor = Color.Cyan, focusedLabelColor = Color.White, unfocusedLabelColor = Color.Gray, unfocusedIndicatorColor = Color.Gray, focusedIndicatorColor = Color.Cyan))

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp), trailingIcon = { Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = ""
                )}, leadingIcon = { Icon(tint = Color.LightGray,imageVector = Icons.Default.Call, contentDescription = "")},value = "1298745678", onValueChange = {}, label = { Text(text = "Contact")}, colors = TextFieldDefaults.colors().copy(focusedContainerColor = navbarGreye, unfocusedContainerColor = Color.Black, focusedTextColor = Color.White, unfocusedTextColor = Color.Cyan, focusedLabelColor = Color.White, unfocusedLabelColor = Color.Gray, unfocusedIndicatorColor = Color.Gray, focusedIndicatorColor = Color.Cyan))

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp), trailingIcon = { Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = ""
                )}, leadingIcon = { Icon(tint = Color.LightGray,imageVector = Icons.Default.Call, contentDescription = "")},value = "9846378219", onValueChange = {}, label = { Text(text = "Emergency Contact")}, colors = TextFieldDefaults.colors().copy(focusedContainerColor = navbarGreye, unfocusedContainerColor = Color.Black, focusedTextColor = Color.White, unfocusedTextColor = Color.Cyan, focusedLabelColor = Color.White, unfocusedLabelColor = Color.Gray, unfocusedIndicatorColor = Color.Gray, focusedIndicatorColor = Color.Cyan))

                Row ( modifier = Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)
                    .border(width = 0.5.dp, color = Color.LightGray, shape = RoundedCornerShape(15))
                    .padding(horizontal = 10.dp)
                    .height((height.value * 0.1).dp)){
                    Box (modifier = Modifier
                        .fillMaxHeight()
                        .weight(3.5f)) {
                        Row (modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.Center)){

                            Icon(imageVector = Icons.Default.Call, tint = Color.LightGray, modifier = Modifier.padding(horizontal = 3.dp), contentDescription = "")
                            Text(
                                text = "Fake call",
                                fontSize = 20.sp,
                                fontWeight = FontWeight(500),
                                color = fakecallColor,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }
                    }
                    Box (modifier = Modifier
                        .fillMaxHeight()
                        .weight(4f)) {

                        Switch(
                            colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.Black,
                            checkedTrackColor = Color.Cyan,
                            uncheckedThumbColor = Color.LightGray,
                            uncheckedTrackColor = navbarGreye,
                        ),
                            checked = fakecallswitch,
                            onCheckedChange = {fakecallswitch = it
                                              fakeColorChange(fakecallColor)},
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .shadow(elevation = 4.dp))
                    }
                }

                
            }

        }
    }
}

