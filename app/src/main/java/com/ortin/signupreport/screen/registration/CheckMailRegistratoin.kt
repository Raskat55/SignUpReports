package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor

@Composable
fun CheckMailRegistration(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .background(BackgroundColor)
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .background(BackgroundColor)
            .size(width = 350.dp, height = 830.dp)
            .padding(start = 17.dp, end = 17.dp, top = 200.dp)
            .shadow(5.dp, RoundedCornerShape(20.dp))){

        }
        LogoWithBackground(modifier = Modifier.padding(top = 120.dp))
    }
}