package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ortin.signupreport.R
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonColor


@Composable
fun RegistrationRole(regController: NavHostController) {
    Box(
        Modifier
            .fillMaxHeight()
            .background(BackgroundColor),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)
                .size(width = 350.dp, height = 830.dp)
                .padding(start = 17.dp, end = 17.dp, top = 200.dp)
                .shadow(5.dp, RoundedCornerShape(20.dp))
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(BackgroundColor)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(BackgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Step 1/4",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, end = 15.dp),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Right,
                        color = ButtonColor
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(BackgroundColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(2.dp),
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Select your role\n\tfor registration",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(BackgroundColor)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 10.dp, vertical = 16.dp)
                                .background(BackgroundColor),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            RegistrationCard("School or University", R.drawable.univer_1)
                            RegistrationCard("Founder", R.drawable.idea_1)
                            RegistrationCard("Co-builder", R.drawable.hat_1)
                        }
                    }
                }
            }
        }
        LogoWithBackground(modifier = Modifier.padding(top = 120.dp))
    }
}

@Composable
fun RegistrationCard(
    name: String,
    imageId: Int,
    modifier: Modifier = Modifier.background(BackgroundColor),
    onClick: () -> Unit = { TODO() }
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .background(BackgroundColor)
            .padding(5.dp)
            .shadow(5.dp, RoundedCornerShape(18.dp))
            .clickable() {
                onClick
            },
        shape = RoundedCornerShape(18.dp),
    ) {
        Box(
            modifier = modifier
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .background(BackgroundColor),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = null,
                    modifier
                        .size(170.dp, 80.dp)
                )
                Text(text = name, fontSize = 14.sp)
            }
        }
    }
}
