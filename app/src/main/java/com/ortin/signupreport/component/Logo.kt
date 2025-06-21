package com.ortin.signupreport.component
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.R

// Logo of app
@Composable
fun LogoSreen(modifier: Modifier = Modifier){

    Image(
        painter = painterResource(id = R.drawable.logo_avb),
        contentDescription = null,
        modifier
            .size(280.dp, 90.dp)

    )
}