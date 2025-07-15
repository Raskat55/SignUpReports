package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.TextFildRegistration
import com.ortin.signupreport.presentation.component.ConfirmButton
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonColor

@Composable
fun ForgotpasswordScreen(modifier: Modifier = Modifier) {
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
                        .height(40.dp)
                )
                Text(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    text = buildAnnotatedString {
                        append("Welcom to A")
                        withStyle(
                            SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 28.sp,
                                color = ButtonColor
                            )
                        ) {
                            append("V")
                        }
                        append("B")
                    }
                )
                Spacer(
                    modifier = Modifier
                        .height(40.dp)
                )
                TextFildRegistration(
                    "E-mail",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(
                    modifier = Modifier
                        .height(20.dp)
                )
                TextFildRegistration(
                    "Password",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    eyeCheck = true
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text =
                            buildAnnotatedString {
                                withLink(
                                    LinkAnnotation.Url(
                                        url = "https://cloud.avbinvest.com/",
                                        TextLinkStyles(style = SpanStyle(color = ButtonColor))
                                    )
                                ) {
                                    append("Forgot password?")
                                }
                            },
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.End,
                        color = Color.Black
                    )

                }
                Spacer(
                    modifier = Modifier
                        .height(70.dp)
                )
                ConfirmButton(
                    buttonText = "Login",
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
            modifier = modifier.padding(
                start = 20.dp, end = 20.dp,
                top = 890.dp
            ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                append("Do you have any question? ")
                withLink(
                    LinkAnnotation.Url(
                        url = "https://cloud.avbinvest.com/",
                        TextLinkStyles(style = SpanStyle(color = ButtonColor))
                    )
                ) {
                    append("Contact us")
                }
            }
        )

    }
}


@Preview
@Composable
private fun ForgotpasswordScreenPreview() {
    ForgotpasswordScreen()
}
