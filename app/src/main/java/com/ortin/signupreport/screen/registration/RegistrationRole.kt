package com.ortin.signupreport.screen.registration

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor


// Main table
@SuppressLint("ResourceAsColor")
@Composable
fun RegistrationRole(
    modifier: Modifier = Modifier.background(BackgroundColor)
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFD9EAFA))
                .padding(start = 17.dp, end = 17.dp, top = 200.dp)
                .height(600.dp)
                .shadow(5.dp, RoundedCornerShape(20.dp))
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFD9EAFA))
            ) {
                Column(
                    modifier = Modifier // основная ось //
                        .fillMaxWidth()
                        .background(
                            Color(0xFFD9EAFA)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Step 1/4",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, end = 15.dp),
                        fontSize = 14.sp,

//                    color = Color(0x4C93D5),
                        textAlign = TextAlign.Right
                    )
                    Box(
                        modifier = Modifier             // для 2 строк
                            .fillMaxWidth()
                            .padding()
                            .background(Color(0xFFD9EAFA)),
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
                            .padding()
                            .fillMaxWidth()
                            .background(Color(0xFFD9EAFA))
                    ) {
                        Column(
                            modifier = Modifier // основная ось
                                .fillMaxWidth()
                                .padding(horizontal = 10.dp, vertical = 16.dp)
                                .background(Color(0xFFD9EAFA)),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            /* Карточки с быбором роли */
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


//Registration Card
@Composable
fun RegistrationCard(
    name: String,
    imageId: Int,
    modifier: Modifier = Modifier.background(Color(0xFFD9EAFA))
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFD9EAFA))
            .padding(5.dp)
            .shadow(5.dp, RoundedCornerShape(18.dp)) // округление тени
            .clickable() {  // для нажатия
                TODO()
            },
        shape = RoundedCornerShape(18.dp),
    ) {
        Box(
            modifier = Modifier
                .padding()
                .fillMaxWidth()
                .background(Color(0xFFD9EAFA))
        ) {
            Column(
                modifier = Modifier // основная ось
                    .fillMaxWidth()
                    .padding(15.dp)
                    .background(Color(0xFFD9EAFA)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = null,
                    modifier
                        .size(170.dp, 80.dp)
                        .background(Color(0xFFD9EAFA))

                )
                Text(text = name, fontSize = 14.sp)

            }
        }
    }
}

@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationRole()
}
