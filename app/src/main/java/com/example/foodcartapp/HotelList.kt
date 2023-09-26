package com.example.foodcartapp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.compose.ui.layout.ContentScale

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme

import androidx.navigation.compose.*
import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun ShowHotelList(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.eatsure),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "EATSURE", style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Button(
                        onClick = { navController.navigate("eatsure") },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("View Items")
                    }
                }
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.dominos),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "DOMINOS", style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Button(
                        onClick = { navController.navigate("dominos") },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("View Items")
                    }
                }
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.burgerking),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "BURGER KING", style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Button(
                        onClick = { navController.navigate("burgerking") },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("View Items")
                    }
                }
            }
    }
}

