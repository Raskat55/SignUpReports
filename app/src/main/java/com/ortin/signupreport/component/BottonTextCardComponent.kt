package com.ortin.signupreport.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import com.ortin.signupreport.ui.theme.ButtonColor

/* TODO */
@Composable
fun BottonTextCardComponent() {
    Text(
        text = buildAnnotatedString {
            append("By pressing Register, you are agree to our ")
            withLink(
                LinkAnnotation.Url(
                    url = "https://cloud.avbinvest.com/",
                    TextLinkStyles(style = SpanStyle(color = ButtonColor))
                )
            ) {
                append("Terms& Conditions")
            }
            append(" and ")
            withLink(
                LinkAnnotation.Url(
                    url = "https://cloud.avbinvest.com/",
                    TextLinkStyles(style = SpanStyle(color = ButtonColor))
                )
            ) {
                append("Privacy Policy")
            }
        }
    )
}