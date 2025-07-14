package com.ortin.signupreport.presentation.component


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonTextColor
import com.ortin.signupreport.ui.theme.GradientBlue
import com.ortin.signupreport.ui.theme.GradientGreen
import com.ortin.signupreport.ui.theme.GradientRed


@Composable
fun MailNumberField() {
    val brush = Brush.horizontalGradient(listOf(GradientBlue, GradientRed, GradientGreen))
    val textValue = rememberSaveable { mutableStateOf(" ") }
    var onValueChange = { text: String -> textValue.value = text }

    Box(
        modifier = Modifier
            .background(BackgroundColor)
            .size(60.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(18.dp)
            )
    ) {
        BasicTextField(
            value = textValue.value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = Color.Black, fontWeight = FontWeight.Normal, fontSize = 20.sp
            ),
            modifier = Modifier
                .fillMaxSize(),
            cursorBrush = brush,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            decorationBox = { InnerTextField ->
                Box(
                    Modifier
                        .background(ButtonTextColor, RoundedCornerShape(18.dp))
                        .border(
                            brush = brush,
                            width = 2.dp,
                            shape = RoundedCornerShape(18.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    InnerTextField()
                }
            }
        )
    }
}

@Preview
@Composable
fun MailNumberFieldPreview(modifier: Modifier = Modifier) {
    MailNumberField()
}
