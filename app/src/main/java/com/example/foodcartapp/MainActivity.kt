@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.foodcartapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.foodcartapp.ui.theme.FoodCartAppTheme
import androidx.compose.material3.TopAppBar
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FoodApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Login"
    ) {
        composable("login") { LoginScreen1(navController) }
        composable("HotelList") { ShowHotelList(navController) }
        composable("eatsure") { Eatsure(navController) }
        composable("eatsurebucket") { Eatsurebucket(navController) }
        composable("eatsurefrench") { Eatsurefrench(navController) }
        composable("eatsuredouble") { Eatsuredouble(navController) }
        composable("dominos") { Dominos(navController) }
        composable("dominospizza") { Dominospizza(navController) }
        composable("dominostomato") { Dominostomato(navController) }
        composable("dominospasta") { Dominospasta(navController) }
        composable("burgerking") { Burgerking(navController) }
        composable("burgerkingburger") { Burgerkingburger(navController) }
        composable("burgerkingchicken") { Burgerkingchicken(navController) }
        composable("burgerkingonion") { Burgerkingonion(navController) }
    }
}
@Preview
@Composable
fun FoodAppPreview(){

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodCartAppTheme {
                Column(modifier=Modifier.fillMaxSize()) {
                    TopAppBar(title = {
                        Text(text="FoodApp")
                    })
                }
            }
            FoodApp()
        }
    }
}