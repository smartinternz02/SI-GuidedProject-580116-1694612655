package com.example.foodcartapp

import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.compose.ui.layout.ContentScale

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

@Composable
fun Eatsure(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.eatsurebucket),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "CHICKEN", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("Eatsurebucket") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.eatsurefrench),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "FRENCH FRIES", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("Eatsurefrench") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
        Column(modifier=Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.eatsuredouble),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp))
            Column(modifier= Modifier.padding(16.dp)) {
                Text(
                    text = "DOUBLE DOWN BURGER", style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Button(onClick = { navController.navigate("Eatsuredouble") },
                    modifier = Modifier) {
                    Text("View Details")
                }
            }
        }
    }
}

@Composable
fun Eatsurebucket(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.eatsurebucket),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "CHICKEN ", style = MaterialTheme.typography.headlineLarge,
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

@Composable
fun Eatsurefrench(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.eatsurefrench),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "FRENCH FRIES", style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "$ 12.50", style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}

@Composable
fun Eatsuredouble(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.eatsuredouble),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "DOUBLE DOWN BURGER", style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "$ 20.00", style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}