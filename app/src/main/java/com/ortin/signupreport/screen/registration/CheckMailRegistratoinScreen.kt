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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ortin.signupreport.component.CheckMailLinkedText
import com.ortin.signupreport.presentation.component.ConfirmButton
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.presentation.component.MailNumberField
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonColor

@Composable
fun CheckMailRegistrationScreen(regController: NavHostController) {
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
                Text(
                    text = "Step 3/4",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, end = 15.dp),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Bold,
                    color = ButtonColor
                )
                Text(
                    "Сheck your e-mail",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    //поля для ввода цифр
                    MailNumberField()
                    MailNumberField()
                    MailNumberField()
                    MailNumberField()
                }
                Spacer(
                    modifier = Modifier
                        .height(15.dp)
                )
                CheckMailLinkedText()
                Spacer(
                    modifier = Modifier
                        .height(310.dp)
                )
                ConfirmButton(
                    buttonText = "Confirm",
                    buttonWidth = 320.dp,
                    buttonHeight = 60.dp,
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { regController.navigate("RequestSubmittedScreen") }
                )
            }

        }
        LogoWithBackground(modifier = Modifier.padding(top = 70.dp))
        Text(
            modifier = Modifier.padding(
                bottom = 15.dp,
                top = 890.dp
            ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                withLink(
                    LinkAnnotation.Url(
                        url = "https://cloud.avbinvest.com/",
                        TextLinkStyles(style = SpanStyle(color = ButtonColor))
                    )
                ) {
                    append("Send the letter again")
                }
            }
        )
    }
}

@Preview
@Composable
private fun CheckMail() {
    CheckMailRegistrationScreen(regController = { TODO() } as NavHostController)
}
