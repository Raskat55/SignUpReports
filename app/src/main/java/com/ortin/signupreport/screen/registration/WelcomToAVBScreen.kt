package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.TextFildRegistration
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor

@Composable
fun WelcomToAVBScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundColor),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)
                .size(width = 350.dp, height = 820.dp)
                .padding(start = 17.dp, end = 17.dp, top = 150.dp)
                .shadow(5.dp, RoundedCornerShape(20.dp)),
            colors = CardDefaults.cardColors(BackgroundColor)
        ) {
            Column(
                modifier = Modifier
                    .background(BackgroundColor)
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // рабочая область
                Spacer(
                    modifier = Modifier
                        .height(30.dp)
                )
                Text(
                    "Welcom to AVB",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                TextFildRegistration(
                    "E-mail",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }

        }
        LogoWithBackground(modifier = Modifier.padding(top = 70.dp))

    }
}

@Preview
@Composable
private fun WelcomToAVBScreenPreview() {
    WelcomToAVBScreen()
}