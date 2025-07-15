package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.R
import com.ortin.signupreport.presentation.component.ConfirmButton
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
                Text(
                    "Registration Request Submitted",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Spacer(
                    modifier = Modifier
                        .height(15.dp)
                )
                Text(
                    "Your account creation request is under review." +
                            "You will receive a notification by email" +
                            " once your registration is approved.",
                    modifier = Modifier
                        .fillMaxWidth(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .height(200.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.letter3_2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(108.dp, 112.dp)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .height(45.dp)
                )
                ConfirmButton(
                    buttonText = "Confirm",
                    buttonWidth = 320.dp,
                    buttonHeight = 60.dp,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                )
                /* for navigation */
                Text(
                    "Go to login page",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
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