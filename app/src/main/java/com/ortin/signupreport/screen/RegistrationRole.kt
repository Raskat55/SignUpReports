package com.ortin.signupreport.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RegistrationRole(){
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
// Logo of app
@Composable
fun LogoSreen(image: Int, modifier: Modifier = Modifier){
    Image(
        painter = painterResource(image),
        contentDescription = null,
        modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationRole()
}