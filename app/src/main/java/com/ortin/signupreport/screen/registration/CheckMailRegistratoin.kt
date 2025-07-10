package com.ortin.signupreport.screen.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.component.CheckMailLinkedText
import com.ortin.signupreport.presentation.component.ConfirmButton
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonColor

@Composable
fun CheckMailRegistration(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(BackgroundColor),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)
                .size(width = 350.dp, height = 730.dp)
                .padding(start = 17.dp, end = 17.dp, top = 100.dp)
                .shadow(5.dp, RoundedCornerShape(20.dp))
        ) {
            Column(
                modifier = Modifier
                    .background(BackgroundColor)
                    .padding(15.dp)
            ) {
                // рабочая область
                Text(
                    text = "Step 3/4",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, end = 15.dp),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Right,
                    color = ButtonColor
                )
                Text("")
                Row(modifier = Modifier) {
                    //поля для ввода цифр

                }
                CheckMailLinkedText()
                ConfirmButton(
                    buttonText = "Confirm",
                    buttonWidth = 320.dp,
                    buttonHeight = 56.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }

        }
//        LogoWithBackground(modifier = Modifier.padding(top = 60.dp))
    }
}

@Preview
@Composable
private fun CheckMail() {
    CheckMailRegistration()
}
