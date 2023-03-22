package com.example.antsirabus
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class ANtsirabe{
    HomePage,
    Search,
    ListBus,
    Bus,
    BusRoute
}


@Composable
fun Navig(modifier: Modifier = Modifier){
    val navController= rememberNavController()
    Scaffold(modifier=modifier) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = ANtsirabe.HomePage.name, modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
            )
        {
            composable(ANtsirabe.HomePage.name)
            {
                HomePage(SearchButton = {navController.navigate(ANtsirabe.Search.name)},
                    ListButton ={navController.navigate(ANtsirabe.ListBus.name)})

            }

            composable(route = ANtsirabe.Search.name)
            {
                Zavatra()
            }


            composable(route = ANtsirabe.ListBus.name)
            {
                ListBus(modifier= Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()))
            }

            composable(route = ANtsirabe.Bus.name)
            {

            }

            composable(route = ANtsirabe.BusRoute.name)
            {

            }
            
        }
    }
}

