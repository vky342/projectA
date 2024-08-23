package com.vky342.projecta.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SettingScreen () {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.White)) {
        Text(text = "Setting Screen", modifier = Modifier.align(Alignment.Center))
    }
}