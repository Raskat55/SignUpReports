package com.ortin.signupreport.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.ButtonColor
import com.ortin.signupreport.ui.theme.ButtonShadow
import com.ortin.signupreport.ui.theme.ButtonTextColor

@Composable
fun ConfirmButton(
    modifier: Modifier,
    buttonText: String,
    buttonWidth: Dp,
    buttonHeight: Dp,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier
            .width(buttonWidth)
            .height(buttonHeight)
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(20.dp),
                clip = false,
                ambientColor = ButtonShadow,
                spotColor = ButtonShadow
            ),
        colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
        shape = RoundedCornerShape(20.dp),
        onClick = onClick,
    ) {
        Text(
            text = buttonText,
            style = TextStyle(
                color = ButtonTextColor,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W700,
                fontSize = 18.sp,
                lineHeight = 18.sp,
                letterSpacing = (0.05).sp,
            ),
        )
    }
}

@Preview
@Composable
fun ConfirmButtonPreview() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ConfirmButton(
            modifier = Modifier,
            buttonText = "Login",
            buttonWidth = 320.dp,
            buttonHeight = 56.dp
        )
        ConfirmButton(
            modifier = Modifier,
            buttonText = "Confirm",
            buttonWidth = 200.dp,
            buttonHeight = 40.dp
        )
    }
}
