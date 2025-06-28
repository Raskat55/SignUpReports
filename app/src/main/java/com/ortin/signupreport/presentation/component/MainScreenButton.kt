package com.ortin.signupreport.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonShadow
import com.ortin.signupreport.ui.theme.GradientBlue
import com.ortin.signupreport.ui.theme.GradientGreen
import com.ortin.signupreport.ui.theme.GradientRed

@Composable
fun MainScreenButton(
    modifier: Modifier,
    buttonText: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .width(300.dp)
            .height(56.dp)
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(20.dp),
                clip = false,
                ambientColor = ButtonShadow,
                spotColor = ButtonShadow
            ),
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = BackgroundColor,
            containerColor = BackgroundColor,
        ),
        border = BorderStroke(
            width = 2.dp,
            brush = Brush.linearGradient(colors = listOf(GradientBlue, GradientRed, GradientGreen))
        ),
    ) {
        Text(
            text = buttonText,
            style = TextStyle(
                color = Color.Black,
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
fun MainScreenButtonPreview() {
    Box(Modifier.fillMaxSize()) {
        MainScreenButton(
            modifier = Modifier.align(Alignment.Center),
            buttonText = "Login",
            onClick = {}
        )
    }
}
