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
fun Dominos(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.dominospizza),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "CHICKEN PIZZA", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("dominospizza") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.dominostomato),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "Tomato Pizza", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("dominostomato") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.dominospasta),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "PASTA PIZZA", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("dominospasta") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
    }
}

@Composable
fun Dominospizza(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.dominospizza),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "CHICKEN PIZZA", style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "$ 12.00", style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}

@Composable
fun Dominostomato(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.dominostomato),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Tomato Pizza", style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "$ 8.99", style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}

@Composable
fun Dominospasta(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.dominospasta),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "PASTA PIZZA", style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "$ 15.00", style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}