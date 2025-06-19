package com.ortin.signupreport.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import java.lang.reflect.Modifier

@Composable
fun RegistrationRole(){
    Column(modifier = Modifier.background(Color.AVBbackground)) {

        Text(text = "Select your role")
        Text(text = "for registration")
        Button()


    }
}