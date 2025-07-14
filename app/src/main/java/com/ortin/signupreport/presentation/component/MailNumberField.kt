package com.ortin.signupreport.presentation.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.GradientBlue
import com.ortin.signupreport.ui.theme.GradientGreen
import com.ortin.signupreport.ui.theme.GradientRed


@Composable
fun MailNumberField(modifier: Modifier) {
    val brush = Brush.horizontalGradient(listOf(GradientBlue, GradientRed, GradientGreen))
    val textValue = rememberSaveable { mutableStateOf(" ") }
    var onValueChange = { text: String -> textValue.value = text }

    Box(
        modifier = Modifier
            .background(BackgroundColor)
            .size(70.dp)
    ) {
        BasicTextField(
            value = textValue.value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = Color.Black, fontWeight = FontWeight.Normal, fontSize = 20.sp
            ),
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            cursorBrush = brush,
            singleLine = true,
            decorationBox = { InnerTextField ->
                InnerTextField()
            }
        )
    }
}

@Preview
@Composable
fun MailNumberFieldPreview(modifier: Modifier = Modifier) {
    MailNumberField(modifier)
}
