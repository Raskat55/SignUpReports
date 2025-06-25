package com.ortin.signupreport.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.R
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.LogoBorderColor
import com.ortin.signupreport.ui.theme.LogoShadow

@Composable
fun MainScreenLogoWithBackground(modifier: Modifier) {
    Box(
        modifier = modifier
            .size(236.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false,
                ambientColor = LogoShadow,
                spotColor = LogoShadow
            )
            .background(
                color = BackgroundColor,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.dp,
                color = LogoBorderColor,
                shape = RoundedCornerShape(16.dp)
            ),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            modifier = Modifier
                .height(160.dp)
                .width(106.dp),
            painter = painterResource(R.drawable.logo_main_screen),
            contentDescription = "Logotype"
        )
    }
}

@Preview
@Composable
fun MainScreenLogoWithBackgroundPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center,
    ) {
        MainScreenLogoWithBackground(Modifier)
    }
}
