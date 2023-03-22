package com.example.antsirabus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antsirabus.ui.theme.AntsirabusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AntsirabusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   Navig(modifier=Modifier.fillMaxSize())

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(text = "Bienvenue chez ANTSIRAB'US APP!",
        fontSize=20.sp,
        color= colorResource(id = R.color.black),
        fontFamily = FontFamily.Cursive)
}

@Composable
fun HomePage(   SearchButton:() -> Unit={}, ListButton:() -> Unit={})
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        var name = remember {
            mutableStateOf(" ")
        }
        //Text(text = "Hello ${name.value}!")
        Image(
            painter = painterResource(id = R.drawable.bus_icone),
            contentDescription = "",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(50.dp))
        ExtendedFloatingActionButton(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(50.dp, 5.dp),
            backgroundColor = Color.DarkGray,
            text = {   Text(text = "Trouver un Bus", color = Color.White, fontSize = 20.sp) },
            onClick = { SearchButton() },
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "", tint = Color.White, modifier=Modifier.size(25.dp))}


        )


        Spacer(modifier = Modifier.height(50.dp))
        ExtendedFloatingActionButton(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(50.dp, 5.dp),
            backgroundColor = Color.DarkGray,
            text = {   Text(text = "Liste des Bus", color = Color.White, fontSize = 20.sp) },
            onClick = { ListButton() },
            icon = { Icon(imageVector = Icons.Filled.List, contentDescription = "", tint = Color.White, modifier=Modifier.size(25.dp))}


        )

        Spacer(modifier = Modifier.height(100.dp))
        Greeting()

    }
}


@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AntsirabusTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.DarkGray
        ) {
             //Navig()
            val options = listOf("Food", "Bill Payment", "Recharges", "Outing", "Other")

            var expanded by remember { mutableStateOf(false) }
            var selectedOptionText by remember { mutableStateOf(options[0]) }

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {
                    expanded = !expanded
                }
            ) {
                TextField(
                    readOnly = true,
                    value = selectedOptionText,
                    onValueChange = { },
                    label = { Text("Categories") },
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expanded
                        )
                    },
                    colors = ExposedDropdownMenuDefaults.textFieldColors()
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = {
                        expanded = false
                    }
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            onClick = {
                                selectedOptionText = selectionOption
                                expanded = false
                            }
                        ) {
                            Text(text = selectionOption)
                        }
                    }
                }
            }

        }
        }
    }