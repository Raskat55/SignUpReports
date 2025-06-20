package com.ortin.signupreport.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.LogoSreen

@Composable
fun RegistrationRole(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(),
        contentAlignment = Alignment.TopCenter){


        Column (){
            val modifier = Modifier
                .padding(10.dp)
                .background(Color(0xD9EAFA))
                .fillMaxSize()
            var contentAlignment = Alignment.Center


            LogoSreen()


            Text(text = "Select your role",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
            Text(text = "for registration",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}


@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationRole()
}