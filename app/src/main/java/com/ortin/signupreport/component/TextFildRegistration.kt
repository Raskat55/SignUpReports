package com.ortin.signupreport.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.ui.theme.BackgroundColor


@Composable
fun TextFildRegistration(nameLabel: String) {

    val textValue = remember { mutableStateOf(" ") }

    val onTextChange = { text: String ->
        textValue.value = text
    }

    OutlinedTextField(
        value = textValue.value,
        modifier = Modifier
            .background(BackgroundColor)
            .padding(10.dp)
            .fillMaxWidth(),
        onValueChange =  onTextChange,
        label = { Text(text = nameLabel) },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White
        ),
    )
}

@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    TextFildRegistration("snake")
}
