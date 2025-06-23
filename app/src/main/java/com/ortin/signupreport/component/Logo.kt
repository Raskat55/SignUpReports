package com.ortin.signupreport.component
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.R

// Logo of app
@Composable
fun LogoSreen(
    modifier: Modifier = Modifier){

    Card(modifier = Modifier
        .fillMaxSize()
        .padding(7.dp)
        .shadow(5.dp,
            RoundedCornerShape(12.dp)
        ),
        shape = RoundedCornerShape(20.dp),
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD9EAFA)
            ),
            contentAlignment = Alignment.BottomCenter
        ){

            Image(
                painter = painterResource(id = R.drawable.logo_avb),
                contentDescription = null,
                modifier
                    .size(53.dp, 79.dp)
            )
        }
    }
}