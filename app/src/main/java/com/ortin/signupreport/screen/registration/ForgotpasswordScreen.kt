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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ortin.signupreport.R
import com.ortin.signupreport.component.TextFildRegistration
import com.ortin.signupreport.presentation.component.ConfirmButton
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonColor

@Composable
fun ForgotpasswordScreen(regController: NavHostController) {
    Box(
        modifier = Modifier
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
                        .height(40.dp)
                )
                Text(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    text = "Forgot password?"
                )
                Spacer(
                    modifier = Modifier
                        .height(20.dp)
                )
                Text(
                    text = "Don’t worry! Just type e-mail you registered\n" +
                            " to Sign Up report",
                    modifier = Modifier
                        .fillMaxWidth(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Spacer(
                    modifier = Modifier
                        .height(20.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .height(200.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.lock_2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp, 172.dp)
                    )
                }
                TextFildRegistration(
                    "E-mail",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                )
                ConfirmButton(
                    buttonText = "Send",
                    buttonWidth = 200.dp,
                    buttonHeight = 65.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                )
            }

        }
        LogoWithBackground(modifier = Modifier.padding(top = 70.dp))
        Text(
            modifier = Modifier.padding(
                start = 20.dp, end = 20.dp,
                top = 890.dp
            ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                append("Did you remember your password? ")
                withLink(
                    LinkAnnotation.Url(
                        url = "https://cloud.avbinvest.com/",
                        TextLinkStyles(style = SpanStyle(color = ButtonColor))
                    )
                ) {
                    append("Login")
                }
            }
        )

    }
}


@Preview
@Composable
private fun ForgotpasswordScreenPreview() {
    ForgotpasswordScreen(regController = TODO())
}
