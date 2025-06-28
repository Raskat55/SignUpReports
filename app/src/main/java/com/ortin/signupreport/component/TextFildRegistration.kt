package com.ortin.signupreport.component

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TextFildRegistration() {

    val textValue = remember { mutableStateOf(" ") }
    val onTextChange = { text: String ->
        textValue.value = text
    }

    OutlinedTextField(
        value = textValue.value,
        onValueChange = { onTextChange },
    )
}

@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    TextFildRegistration()
}
