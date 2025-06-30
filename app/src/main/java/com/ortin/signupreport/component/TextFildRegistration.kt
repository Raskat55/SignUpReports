package com.ortin.signupreport.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ortin.signupreport.ui.theme.BackgroundColor


@Composable
fun TextFildRegistration(
    nameLabel: String,
    keyboardOptions: KeyboardOptions,
    onValueChange: (String) -> Unit,
) {
    val textValue = remember { mutableStateOf(" ") }

    Box(
        modifier = Modifier
            .background(BackgroundColor)
            .padding(10.dp)
    ) {
        BasicTextField(
            value = textValue.value,
            onValueChange = onValueChange,
            modifier = Modifier,

        )
    }
}


@Preview
@Composable
fun ImputRigistrationDataPreview(modifier: Modifier = Modifier) {
    TextFildRegistration(
        "snake",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = { TODO() }
    )
}
