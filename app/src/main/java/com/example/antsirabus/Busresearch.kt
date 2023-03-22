package com.example.antsirabus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.antsirabus.ui.theme.AntsirabusTheme
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
/*
data class BusStop(val name: String)
data class BusRoute(val number: Int, val stops: List<BusStop>)



val busRoutes = listOf(
    BusRoute(2, listOf(BusStop("Andrangy"), BusStop("Bevoninkazo"), BusStop("Atsimotsena"),
        BusStop("Avaratsena"), BusStop("Andranomafana"), BusStop("Thermes"), BusStop("Commune"),
        BusStop("Marmailles"), BusStop("Cerrure"), BusStop("Route d'Ambositra"),
        BusStop("4 Chemins Ambalavato"), BusStop("Ambohimena"), BusStop("Mandaniresaka"),
        BusStop("Andranonahoatra"), BusStop("Université Tsaratanàna"))),
    BusRoute(3, listOf(BusStop("Avaratsena"), BusStop("Voirie"), BusStop("Star"),
        BusStop("Tsivatrinikamo"), BusStop("Talata"), BusStop("Andraikiba"), BusStop("Mangalaza"),
        BusStop("Belazao"))),
    BusRoute(4, listOf(BusStop("Ambohidrano"), BusStop("Talata"), BusStop("Star"),
        BusStop("Voirie"), BusStop("Avaratsena"), BusStop("Andranomafana"), BusStop("Thermes"),
        BusStop("Allée des Banques"), BusStop("Cathédrale"), BusStop("Antsenakely"), BusStop("Mahazina"),
        BusStop("Ambohimena"), BusStop("Mandaniresaka"))),
    BusRoute(5, listOf(BusStop("Garen'ny roplanina"), BusStop("Tombotsoa"), BusStop("Antsampanimahazo"),
        BusStop("Plaque Tiko Vatofotsy"), BusStop("KAMAFA Vatofotsy"), BusStop("Fokontany Stationnement Vatofotsy"),
        BusStop("Plaque ACMIL"), BusStop("LARA"), BusStop("Ampihaviana"), BusStop("Cyprès"),
        BusStop("Stédique"), BusStop("Cercle Mess"), BusStop("Thermes"), BusStop("Cathédrale"),
        BusStop("Antsenakely"), BusStop("Zaodahy"), BusStop("Andranomaimbo"), BusStop("Antsinanantsena"),
        BusStop("Avaratsena"), BusStop("Voirie"), BusStop("Star"), BusStop("Tsivatrinikamo"),
        BusStop("Talata"))),
    BusRoute(10, listOf(BusStop("Dalle vatofotsy"), BusStop("KAMAFA Vatofotsy"),
        BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("Ampihaviana"), BusStop("Cyprès"), BusStop("Stédique"), BusStop("Andranomadio"),
        BusStop("Ravitsara Santé Plus"), BusStop("4 Chemins Ambohimiandrisoa"), BusStop("Voirie"),
        BusStop("Avaratsena"), BusStop("Antsinanantsena"), BusStop("Andranomaimbo"), BusStop("Zaodahy"),
        BusStop("Antsenakely"), BusStop("Immaculée"), BusStop("Antanivao"), BusStop("4 Chemins Ambalavato"),
        BusStop("Ambohimena"), BusStop("Mandaniresaka"), BusStop("Andranonahoatra"), BusStop("Université Tsaratanàna"))),
    BusRoute(11, listOf(BusStop("Antsaha"), BusStop("Tombotsoa"), BusStop("Antsampanimahazo"),
        BusStop("Plaque Tiko Vatofotsy"), BusStop("KAMAFA Vatofotsy"), BusStop("Fokontany Stationnement Vatofotsy"),
        BusStop("Plaque ACMIL"), BusStop("LARA"), BusStop("Ampihaviana"), BusStop("Cyprès"),
        BusStop("Stédique"), BusStop("Cercle Mess"), BusStop("Thermes"), BusStop("Cathédrale"),
        BusStop("Antsenakely"), BusStop("Zaodahy"), BusStop("Andranomaimbo"), BusStop("Antsinanantsena"),
        BusStop("Avaratsena"), BusStop("Voirie"), BusStop("Star"), BusStop("Tsivatrinikamo"), BusStop("Talata"))),
    BusRoute(12, listOf(BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("CISCO"), BusStop("Paraky"), BusStop("FLM"), BusStop("Bar Malagasy"),
        BusStop("Faran'ny Pavet"), BusStop("Voirie"), BusStop("Avaratsena"), BusStop("Andranomafana"),
        BusStop("Thermes"), BusStop("Cathédrale"), BusStop("Antsenakely"), BusStop("Zaodahy"),
        BusStop("Mahazina"), BusStop("Ambohimena"), BusStop("Mandaniresaka"))),
    BusRoute(13, listOf(BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("Soif d'aujourd'hui"), BusStop("Adventsiste"), BusStop("Sainte Thérèse Mahazoarivo"),
        BusStop("4 Chemins Ambohimiandrisoa"), BusStop("Avaratsena"), BusStop("Antsinanantsena"),
        BusStop("Andranomaimbo"), BusStop("Zaodahy"), BusStop("Antsenakely"), BusStop("Cathédrale"),
        BusStop("Trésor"), BusStop("Tsarasaotra"), BusStop("Route d'Ambositra"))),
    BusRoute(14, listOf(BusStop("Antsampanimahazo"), BusStop("Plaque Tiko Vatofotsy"), BusStop("KAMAFA Vatofotsy"),
        BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("Ampihaviana"),BusStop("Tribunal"), BusStop("Devant Gare"), BusStop("Cerrure"),
        BusStop("Commune"), BusStop("Cathédrale"), BusStop("Zaodahy"), BusStop("Andranomaimbo"),
        BusStop("Antsinanantsena"), BusStop("Atsimotsena"), BusStop("Bevoninkazo"))),
    BusRoute(16, listOf(BusStop("Dalle Vatofotsy"), BusStop("KAMAFA Vatofotsy"),BusStop("Fokontany Stationnement Vatofotsy"),
        BusStop("Plaque ACMIL"), BusStop("LARA"), BusStop("Soif d'aujourd'hui"), BusStop("Adventsiste"),
        BusStop("Sainte Thérèse Mahazoarivo"), BusStop("4 Chemins Ambohimiandrisoa"), BusStop("Avaratsena"),
        BusStop("Andranomafana"), BusStop("Thermes"), BusStop("Commune"), BusStop("Allée des banques"),
        BusStop("Cathédrale"), BusStop("Antsenakely"),BusStop("Zaodahy"), BusStop("Mahazina"),
        BusStop("Ambohimena Socolait"))),
    BusRoute(17, listOf(BusStop("Morahita"), BusStop("Antsaha"), BusStop("Tombotsoa"),
        BusStop("Antsampanimahazo"), BusStop("Plaque Tiko Vatofotsy"), BusStop("KAMAFA Vatofotsy"),
        BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("Ampihaviana"), BusStop("Cyprès"), BusStop("Stédique"), BusStop("Andranomadio"),
        BusStop("Ravitsara Santé Plus"), BusStop("4 Chemins Ambohimiandrisoa"), BusStop("Voirie"),
        BusStop("Avaratsena"), BusStop("Antsinanantsena"), BusStop("Andranomaimbo"), BusStop("Zaodahy"),
        BusStop("Mahazina"), BusStop("Ambohimena"),BusStop("Mandaniresaka"), BusStop("Andranonahoatra"),
        BusStop("Ambohimanarivo"), BusStop("Lavarano"))),
    BusRoute(18, listOf(BusStop("Ampahatra"), BusStop("Star"), BusStop("Voirie"), BusStop("Avaratsena"),
        BusStop("Antsinanantsena"), BusStop("Andranomaimbo"), BusStop("Zaodahy"), BusStop("Antsenakely"),
        BusStop("Immaculée"), BusStop("Antanivao"), BusStop("4 Chemins Ambalavato"), BusStop("CottonLine"))),
    BusRoute(19, listOf(BusStop("TIKO Mahafaly"), BusStop("KAMAFA Vatofotsy"),
        BusStop("Fokontany Stationnement Vatofotsy"), BusStop("Plaque ACMIL"), BusStop("LARA"),
        BusStop("CISCO"), BusStop("Paraky"), BusStop("FLM"), BusStop("Bar Malagasy"),
        BusStop("Faran'ny Pavet"), BusStop("Voirie"), BusStop("Avaratsena"), BusStop("Zaodahy"),
        BusStop("Mahazina"), BusStop("Ambohimena"), BusStop("Andranonahoatra"), BusStop("Visy Gasy"))),




@Composable
fun Busresearch() {
    var stop1 by remember { mutableStateOf(TextFieldValue()) }
    var stop2 by remember { mutableStateOf(TextFieldValue()) }
    var result by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = stop1,
            onValueChange = { stop1 = it },
            label = { Text("Entrer le nom du premier arrêt bus") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = stop2,
            onValueChange = { stop2 = it },
            label = { Text("Entrer le nom du deuxième arrêt bus") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        )
        Button(
            onClick = {
                val stop1Name = stop1.text
                val stop2Name = stop2.text
                val busRoutesFound = busRoutes.filter { route ->
                    val stop1Index = route.stops.indexOfFirst { it.name == stop1Name }
                    val stop2Index = route.stops.indexOfFirst { it.name == stop2Name }
                    stop1Index != -1 && stop2Index != -1 && stop1Index < stop2Index
                }
                result = if (busRoutesFound.isEmpty()) {
                    "Aucun bus relie directement $stop1Name et $stop2Name."
                } else {
                    "${busRoutesFound.size} Bus reliant: " +
                            "$stop1Name and $stop2Name:\" +" +
                            busRoutesFound.joinToString(separator = "\") { "- Bus
                                ${it.number}" }
                            }
                        },
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Text("Rechercher")
                    }
                    if (result != null) {
                        Text(
                            text = result,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }
            }

@Composable
fun BusRouteSearchApp() {
    MaterialTheme {
        Scaffold(
            topBar = { TopAppBar(title = { Text("Trouver un Bus") }) }
        ) {
            Busresearch()
        }
    }
}
fun main() {
    BusRouteSearchApp()
}*/

/*val list1 = listOf<String>("A1","A2")
val list2 = listOf<String>("B1","B2")
val blist = listOf<List<String>>(list1,list2)

var a = blist[0][0]*/



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Stop(){
    val options = listOf("A1", "A2", "A3", "A4", "A5")
    val options2 = listOf("B1", "B2", "B3", "B4", "B5")

    var expanded by remember { mutableStateOf(false) }
    var expanded2 by remember { mutableStateOf(false) }

    var selectedOptionText by remember { mutableStateOf(options[0]) }
    var selectedOptionText2 by remember { mutableStateOf(options2[0]) }

/*    data class BusStop(val name: String)
    data class BusRoute(val number: Int, val stops: List<BusStop>)

    val busRoutes = listOf(
        BusRoute(2, listOf(BusStop("Andrangy"), BusStop("Bevoninkazo"), BusStop("Atsimotsena"),
            BusStop("Avaratsena"), BusStop("Andranomafana"), BusStop("Thermes"), BusStop("Commune"),
            BusStop("Marmailles"), BusStop("Cerrure"), BusStop("Route d'Ambositra"),
            BusStop("4 Chemins Ambalavato"), BusStop("Ambohimena"), BusStop("Mandaniresaka"),
            BusStop("Andranonahoatra"), BusStop("Université Tsaratanàna"))),
        BusRoute(3, listOf(BusStop("Avaratsena"), BusStop("Voirie"), BusStop("Star"),
            BusStop("Tsivatrinikamo"), BusStop("Talata"), BusStop("Andraikiba"), BusStop("Mangalaza"),
            BusStop("Belazao"))))
*/
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
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
                label = { Text("Départ") },
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
        Spacer(modifier = Modifier.height(50.dp))
        ExposedDropdownMenuBox(
            expanded = expanded2,
            onExpandedChange = {
                expanded2 = !expanded2
            }
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionText2,
                onValueChange = { },
                label = { Text("Arrivée") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expanded2
                    )
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expanded2,
                onDismissRequest = {
                    expanded2 = false
                }
            ) {
                options2.forEach { selectionOption2 ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionText2 = selectionOption2
                            expanded2 = false
                        }
                    ) {
                        Text(text = selectionOption2)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(150.dp))
        ExtendedFloatingActionButton(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(50.dp, 5.dp),
            backgroundColor = Color.DarkGray,
            text = {   Text(text = "Recherche", color = Color.White, fontSize = 20.sp) },
            onClick = { },
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "", tint = Color.White, modifier=Modifier.size(25.dp))}


        )

    }

}
