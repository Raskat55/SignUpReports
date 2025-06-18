package com.ortin.signupreport.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.presentation.component.LogoWithBackground
import com.ortin.signupreport.presentation.component.MainScreenButton
import com.ortin.signupreport.ui.theme.BackgroundColor

@Composable
fun MainScreen() {
    val headerTextColor = Color(0xFF202021)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Sign UP",
            style = TextStyle(
                color = headerTextColor,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W600,
                fontSize = 70.sp,
                lineHeight = 70.sp,
                letterSpacing = (-0.05).sp,
                textAlign = TextAlign.Center
            ),
        )
        Box(
            modifier = Modifier
                .padding(horizontal = 104.dp)
                .wrapContentHeight()
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = "report",
                style = TextStyle(
                    color = headerTextColor,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.W400,
                    fontStyle = FontStyle.Italic,
                    fontSize = 35.sp,
                    lineHeight = 35.sp,
                    letterSpacing = (-0.05).sp,
                    textAlign = TextAlign.Center,
                ),
            )
        }
        LogoWithBackground(modifier = Modifier.padding(vertical = 34.dp))
        MainScreenButton(
            modifier = Modifier.padding(top = 58.dp),
            buttonText = "Login",
            onClick = { /* TODO */ }
        )
        MainScreenButton(
            modifier = Modifier.padding(top = 32.dp),
            buttonText = "Sign up",
            onClick = { /* TODO */ }
        )
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
