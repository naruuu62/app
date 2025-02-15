package com.example.sosmedfinal

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sosmedfinal.ui.theme.birmud
import kotlinx.coroutines.delay


@Composable

fun screenawal(
    navController: NavController
){
    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("menu"){

        }
    }

Column(
modifier = Modifier
    .background(color = birmud)
    .fillMaxWidth()
    .fillMaxHeight()
    .padding(10.dp)
) {
Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
        .size(1000.dp)
){
    Image(
        painter = painterResource(id = R.drawable.logoo),
        contentDescription = null,
        modifier = Modifier
            .width(480.dp)
            .height(480.dp)
            .padding(3.dp)
    )

    }
  }
}

val String.color
    get() = Color(parseColor(this))