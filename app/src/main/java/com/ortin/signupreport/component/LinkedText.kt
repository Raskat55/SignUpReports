package com.ortin.signupreport.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp

@Composable
fun infoText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.padding(start = 10.dp, end = 10.dp), text = buildAnnotatedString {
            append("By pressing Register, you are agree to our ")
            withLink(
                LinkAnnotation.Url(
                    url = "https://cloud.avbinvest.com/",
                    TextLinkStyles(style = SpanStyle(color = Color.Blue))
                )
            ) {
                append("Terms& Condition")
            }
            append(" and ")
            withLink(
                LinkAnnotation.Url(
                    url = "https://cloud.avbinvest.com/",
                    TextLinkStyles(style = SpanStyle(color = Color.Blue))
                )
            ) {
                append("Privacy Policy")
            }
        })
}
