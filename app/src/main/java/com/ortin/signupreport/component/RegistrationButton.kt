package com.ortin.signupreport.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RegistrationCard(){
    Card(
        modifier = Modifier.fillMaxSize().padding(5.dp).shadow(5.dp),
        shape = RoundedCornerShape(10.dp),
    ){
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center){
            Text(text = "Карточка")

        }


    }
}

@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationCard()
}
