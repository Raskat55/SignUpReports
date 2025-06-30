package com.ortin.signupreport.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.R
import com.ortin.signupreport.ui.theme.BackgroundColor
import com.ortin.signupreport.ui.theme.ButtonTextColor
import com.ortin.signupreport.ui.theme.GradientBlue
import com.ortin.signupreport.ui.theme.GradientGreen
import com.ortin.signupreport.ui.theme.GradientRed


@Composable
fun TextFildRegistration(
    nameLabel: String,
    keyboardOptions: KeyboardOptions
) {
    val brush = Brush.horizontalGradient(listOf(GradientBlue, GradientRed, GradientGreen))
    val textValue = rememberSaveable { mutableStateOf(" ") }
    var onValueChange = { text: String -> textValue.value = text }

    Box(
        modifier = Modifier
            .background(BackgroundColor)
            .fillMaxWidth()
            .height(80.dp)
    ) {
        BasicTextField(
            value = textValue.value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 20.dp,
                    bottom = 5.dp
                ),
            cursorBrush = Brush.horizontalGradient(
                listOf(
                    GradientBlue,
                    GradientRed,
                    GradientGreen
                )
            ),
            keyboardOptions = keyboardOptions,
            singleLine = true,
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(ButtonTextColor, RoundedCornerShape(20.dp))
                        .border(
                            brush = brush,
                            width = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(16.dp)
                ) {
                    innerTextField()
                }

            }
        )
        Text(
            text = nameLabel,
            modifier = Modifier
                .padding(
                    start = 40.dp,
                    top = 5.dp
                )
                .background(BackgroundColor),
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun RegistrationToggleButton() {
    var checked by remember { mutableStateOf(true) }
    IconToggleButton(
        checked = checked,
        onCheckedChange = { checked = it }
    ) {
        if(checked) Icon(R.drawable.eye, contentDescription = "")
        else Icon(R.drawable.eye_slash, contentDescription = "")
    }
}

@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    TextFildRegistration(
        "snake",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
}
