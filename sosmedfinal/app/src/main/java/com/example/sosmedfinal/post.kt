package com.example.sosmedfinal

import AppObject
import android.print.PrintAttributes.Margins
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import contoh
import org.jetbrains.annotations.Async

@Preview
@Composable

fun post(
contoh: contoh = AppObject.profil1
) {
    var love by remember { mutableStateOf(contoh.like) }
    var bintang by remember { mutableStateOf((contoh.favorite)) }
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .height(380.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .height(850.dp)
                .fillMaxWidth()
                .background(Color.Cyan)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            ) {
                Column(

                ) {
                    Row(
                        modifier = Modifier
                            .background(Color.Cyan)
                    ) {
                        Card(
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(7.dp)
                        ) {
                            AsyncImage(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                model = contoh.profil,
                                contentDescription = null


                            )
                        }
                        Text(
                            text = contoh.username,
                            fontSize = 14.sp,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .padding(9.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(2.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            model = contoh.post,
                            contentDescription = null
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = { love++ }) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "like",
                            modifier = Modifier.padding(2.dp)
                        )
                    }
                    Text(
                        text = love.toString(),
                        fontSize = 15.sp
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = { bintang++ }) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "simpan",
                            modifier = Modifier.padding(2.dp)
                        )
                    }
                    Text(
                        text = bintang.toString(),
                        fontSize = 15.sp
                    )
                }
            }

        }
            }
        }
