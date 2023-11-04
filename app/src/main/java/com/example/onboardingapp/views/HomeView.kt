package com.example.onboardingapp.views

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

fun HomeView(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Layout.Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Home", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}