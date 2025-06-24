package com.ortin.signupreport.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue


@Composable
fun TextFildRegistration(){

    var text by remember { mutableStateOf(TextFieldValue("")) }
    // Ввод  информации
    OutlinedTextField(

        state = rememberTextFieldState(),
        lineLimits = TextFieldLineLimits.SingleLine,
        placeholder = {  },
        label = { Text("User name") },
        onValueChange = { },
        enable = true,  // разрешен ввод
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text)
        ){

        }



}



@Preview
@Composable
fun ImputRigistrationDataPteview() {
    TextFildRegistration()
}