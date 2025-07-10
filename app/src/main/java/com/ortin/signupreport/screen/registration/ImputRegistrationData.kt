package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.InfoText
import com.ortin.signupreport.component.TextFildRegistration
import com.ortin.signupreport.presentation.component.ConfirmButton
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor

@Composable
fun ImputRigistrationData() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)
                .padding(start = 17.dp, end = 17.dp, top = 130.dp)
                .shadow(5.dp, RoundedCornerShape(20.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BackgroundColor),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text( // text
                    text = "Step 2/4",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, end = 15.dp),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Right
                )
                Text(
                    text = "Enter your details to\n\tcomplete the registration",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                TextFildRegistration(
                    "First Name",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                TextFildRegistration(
                    "Last Name",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                TextFildRegistration(
                    "E-mail",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                TextFildRegistration(
                    "School Name",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                TextFildRegistration(
                    "Phone Number",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )

                TextFildRegistration(
                    "Password",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    eyeCheck = true
                )
            }

            Box(
                modifier = Modifier
                    .background(BackgroundColor)
                    .fillMaxWidth()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                ConfirmButton(
                    buttonText = "Confirm",
                    buttonWidth = 320.dp,
                    buttonHeight = 56.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(BackgroundColor),
                contentAlignment = Alignment.Center

            ) {
                InfoText()
            }
        }
    }
    LogoWithBackground(modifier = Modifier)
}

@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    ImputRigistrationData()
}
