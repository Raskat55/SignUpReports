package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.BackgroundColor

@Composable
fun ImputRigistrationData(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding()
            .background(BackgroundColor)
    ) {

        Card(modifier = Modifier
            .fillMaxWidth()
            .background(BackgroundColor)
            .padding(start = 17.dp, end = 17.dp, top = 50.dp)
            .height(1000.dp)
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
                        .padding(10.dp)
                        .background(BackgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text( // text
                        text = "Step 2/4",
                        modifier = Modifier.fillMaxWidth()
                            .padding(top = 10.dp, end = 15.dp),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Right
                    )
                    Box(modifier = Modifier){
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(2.dp),
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Enter your details to",
                                fontSize = 27.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(text = "complete the registration",
                                fontSize = 27.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

            }
        }
    }
}







@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    ImputRigistrationData()
}
