package com.ortin.signupreport.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.R
import com.ortin.signupreport.component.LogoSreen
import com.ortin.signupreport.ui.theme.avb

// Main table
@Composable
fun RegistrationRole(modifier: Modifier = Modifier
){

    Column(modifier = Modifier // основная ось
        .padding()
        .fillMaxWidth()
        .background(avb),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Box(modifier = Modifier // первый box для лого
            .padding()
            .size(103.dp, 103.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            LogoSreen()  // лого
        }


        Box(modifier = Modifier  // второй box для текста
            .padding()
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column(modifier = Modifier // основная ось
                .fillMaxHeight()
                .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(text = "Step 1/4",
                    fontSize = 14.sp)

                Text(text = "Select your role",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)

                Text(text = "for registration",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)

                Box(modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                ){
                      Column(modifier = Modifier // основная ось
                          .fillMaxWidth()
                          .padding(10.dp),
                          horizontalAlignment = Alignment.CenterHorizontally
                      ){
                          RegistrationCard("School or University",R.drawable.univer_1)
                          RegistrationCard("Founder", R.drawable.idea_1)
                          RegistrationCard("Co-builder", R.drawable.hat_1)
                      }
                }
            }

        }

    }
}


//Registration Card
@Composable
fun RegistrationCard(
    name: String,
    imageId: Int,
    modifier: Modifier = Modifier
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .shadow(5.dp)
            .clickable(){  // для нажатия
                TODO()
            },
        shape = RoundedCornerShape(10.dp),
    ){
        Box(modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
        ){
            Column(modifier = Modifier // основная ось
                .fillMaxWidth()
                .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = null,
                    modifier
                        .size(120.dp, 60.dp)

                )
                Text(text = "$name", fontSize = 14.sp)

            }
        }
    }
}

@Preview
@Composable
fun RegistrationRolePreview() {
    RegistrationRole()
}