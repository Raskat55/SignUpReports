package com.ortin.signupreport.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.LogoSreen

@Composable
fun RegistrationRole(){
//    LogoSreen(R.drawable.contaener)
    Column{
        val modifier = Modifier
            .background(Color.White)
            .fillMaxSize()

        Text(text = "Select your role",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Text(text = "for registration",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)

    }
}


@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationRole()
}