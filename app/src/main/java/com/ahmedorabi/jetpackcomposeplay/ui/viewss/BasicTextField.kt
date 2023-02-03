package com.ahmedorabi.jetpackcomposeplay.ui.viewss

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme


@Composable
fun BasicTextFieldDemo() {
    var textState by remember { mutableStateOf(TextFieldValue("Hello World")) }

    Column() {
        BasicTextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)

    }

}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//
//        BasicTextFieldDemo()
//    }
//}