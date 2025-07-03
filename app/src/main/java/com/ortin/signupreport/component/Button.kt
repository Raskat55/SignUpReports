package com.ortin.signupreport.component

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview

//@Composable
//fun advice(modifier: Modifier = Modifier) {
//    Row {
//        Box()
//    }
//}

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