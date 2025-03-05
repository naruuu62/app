package com.example.sosmedfinal

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.sosmedfinal.presentation.theme.birda
import com.example.sosmedfinal.presentation.theme.birmud
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth

@Composable
fun register(navController: NavController, authViewModel: autentikasi = viewModel()){
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirm by remember { mutableStateOf("") }
        //var isLogin by remember { mutableStateOf(true) }
        val context = LocalContext.current
        val loginState by authViewModel.loginState.collectAsState()
        val focusManager = LocalFocusManager.current
        val focusRequester = remember { FocusRequester() }


        val providers = arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build()
        )

        val signInIntent = AuthUI.getInstance()
            .createSignInIntentBuilder()
            .setAvailableProviders(providers)
            .build()


        Column(
            modifier = Modifier
                .background(birmud)
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(35.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(birda)


            ) {

                Column(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Spacer(modifier = Modifier.height(90.dp))
                    Row {
                        Spacer(modifier = Modifier.width(35.dp))
                        Image(
                            painter = painterResource(id = R.drawable.logoo),
                            contentDescription = null,
                            modifier = Modifier.padding(45.dp)


                        )
                    }

                    Text("Sign In",
                        fontSize = 23.sp,
                        fontStyle = FontStyle.Normal,
                        modifier = Modifier.align(Alignment.CenterHorizontally))


                    Spacer(modifier = Modifier.height(45.dp))

                    OutlinedTextField(
                        value = email,
                        shape = RoundedCornerShape(8.dp),
                        onValueChange = { email = it }, //
                        label = { Text("Email") }, //
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(
                            imeAction = ImeAction.Next
                        ),
                        keyboardActions = KeyboardActions(
                            onNext = {
                                focusManager.moveFocus(FocusDirection.Down)
                            }
                        )
                )


                    OutlinedTextField(
                        value = password,
                        shape = RoundedCornerShape(8.dp),
                        onValueChange = { password = it},
                        label = { Text("Password") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(
                            imeAction = ImeAction.Next
                        ),
                        keyboardActions = KeyboardActions(
                            onNext = {
                                focusManager.moveFocus(FocusDirection.Down)
                            }
                        )
                    )

                    OutlinedTextField(
                        value = confirm,
                        shape = RoundedCornerShape(8.dp),
                        onValueChange = { confirm = it},
                        label = { Text("Confirm Password") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(
                            imeAction = ImeAction.Next
                        ),
                        keyboardActions = KeyboardActions(
                            onNext = { focusManager.moveFocus(FocusDirection.Down)
                            }
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)


                    )

                    Button(modifier = Modifier.fillMaxWidth(),
                        //.focusRequester(focusRequester),
                        onClick = {
                            if(email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
                                Toast.makeText(context, "Isi dulu semua formnya der", Toast.LENGTH_SHORT).show()
                            }
                            else if (password == confirm) {
                              authViewModel.register(email, password)
                            }
                    }
                    ) {
                        Text("Konfirmasi")
                    }
                    Spacer(modifier = Modifier.height(6.dp))

                    Row {
                        TextButton(onClick = { navController.navigate("login") }) {
                            Text("Sudah punya akun?")
                        }

                        Spacer(modifier = Modifier.width(38.dp))

                        TextButton(onClick = { navController.navigate("menu") }) {
                            Text("Masuk sebagai guest")
                        }
                    }
                    LaunchedEffect(loginState) {
                            if (loginState == true){
                                Toast.makeText(context, "Daftar Berhasil yeey", Toast.LENGTH_SHORT).show()
                                navController.navigate("login")
                            } else if(loginState==false){
                                Toast.makeText(context, "Yah gagal u_u", Toast.LENGTH_SHORT).show()
                            } //else if (loginState==null ) {
                                //Toast.makeText(context, "Isi dulu formnya -_-", Toast.LENGTH_SHORT).show()
                            }

                        }
                    }
                }
            }



