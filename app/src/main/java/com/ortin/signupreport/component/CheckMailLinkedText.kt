package com.ortin.signupreport.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortin.signupreport.ui.theme.ButtonColor

@Composable
fun CheckMailLinkedText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.padding(start = 20.dp, end = 20.dp),
        fontSize = 14.sp,
        fontWeight = FontWeight.Black,
        textAlign = TextAlign.Center,
        text = buildAnnotatedString {
            append("We just send you a code to your/n ")
            withLink(
                LinkAnnotation.Url(
                    url = "https://cloud.avbinvest.com/",
                    TextLinkStyles(style = SpanStyle(color = ButtonColor))
                )
            ) {
                append("xxxxxx@xxxx")
            }
            append(" e-mail address.\n\tPaste it into the box below ")
        }
    )
}
