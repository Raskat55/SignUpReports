package com.ortin.signupreport.component

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview

//@Preview
//@Composable
//fun TextButtonSample() {
//    TextButton(onClick = { /* Do something! */ }) { Text("Text Button") }
//}
@Preview
@Composable
@Suppress("Deprecation")
fun ClickableText() {
    ClickableText(
        text = AnnotatedString("Click Me"),
        onClick = { offset -> Log.d("ClickableText", "$offset -th character is clicked.") },
    )
}