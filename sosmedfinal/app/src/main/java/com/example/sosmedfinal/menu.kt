package com.example.sosmedfinal

import AppObject
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import contoh

@Preview
@Composable

fun menu(navController: NavController){

    val appList = listOf(
    AppObject.profil1,
        AppObject.profil2,
        AppObject.profil3,
        AppObject.profil4
    )

    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxHeight(),

        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Row (

            modifier = Modifier
                .background(Color(0xFF64E0FF))
                .fillMaxWidth()
                .height(30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logoo),
                contentDescription = null,
                modifier = Modifier
                    .height(28.dp)
                    .padding(2.dp)

            )
            Spacer(modifier = Modifier.width(2.dp))

            Text(text = "Neuron",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(5.dp)

            )
        }

        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ){
            items(appList){
                contoh-> post(contoh)
            }
        }

        Row(

            modifier = Modifier
                .background(color = "#64E0FF".color)
                .fillMaxWidth()
                .height(30.dp),
        )
        {
            Spacer(modifier = Modifier
                .width(15.dp))
            Icon(imageVector = Icons.Default.Home,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
            )
            Spacer(modifier = Modifier.width(45.dp))
            Icon(imageVector = Icons.Default.Search,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
            )
            Spacer(modifier = Modifier.width(45.dp))
            Icon(imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
            )
            Spacer(modifier = Modifier.width(45.dp))
            Icon(imageVector = Icons.Default.Settings,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
            )
            Spacer(modifier = Modifier.width(45.dp))
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
            )
        }
    }
}
