package com.ortin.signupreport.component

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TextFildRegistration(){

   var text by remember { mutableStateOf(TextFieldValue("")) }

    // Ввод  информации
    OutlinedTextField(

        state = rememberTextFieldState(),
        placeholder = {  },
        label = { Text("User name") },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text)
        )

}



@Preview
@Composable
fun ImputRigistrationDataPteview() {
    TextFildRegistration()
}