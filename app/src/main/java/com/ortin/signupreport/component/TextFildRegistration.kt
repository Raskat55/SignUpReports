package com.ortin.signupreport.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.ui.theme.BackgroundColor


@Composable
fun TextFildRegistration(
    nameLabel: String,
    keyboardOptions: KeyboardOptions,
    onValueChange: (String) -> Unit
) {
    val textValue = remember { mutableStateOf(" ") }

    OutlinedTextField(
        value = textValue.value,
        modifier = Modifier
            .background(BackgroundColor)
            .padding(10.dp)
            .fillMaxWidth(),
        onValueChange = onValueChange,
        keyboardOptions = keyboardOptions,
        label = { Text(text = nameLabel) },
        singleLine = true,
        shape = RoundedCornerShape(20.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = BackgroundColor
        ),
    )
}

@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    TextFildRegistration(
        "snake",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = TODO()
    )
}
