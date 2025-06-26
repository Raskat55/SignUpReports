package com.ortin.signupreport.presentation.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TextFildRegistration(stateName: String){

   var text by remember { mutableStateOf(TextFieldValue("")) }

    // Ввод  информации
//    OutlinedTextField(
//
//        state = rememberTextFieldState(),
//        placeholder = { Text(text = "")   },
//
//        label = { Text("$stateName") },
//
//
//        keyboardOptions = KeyboardOptions(
//            keyboardType = KeyboardType.Text)
//        )

}



@Preview
@Composable
fun ImputRigistrationDataPteview() {
    TextFildRegistration("First Name")
}