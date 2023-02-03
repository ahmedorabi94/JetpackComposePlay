package com.ahmedorabi.jetpackcomposeplay.ui.material

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme


@Composable
fun ButtonExample() {
    Button(
        onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Red
        )
    ) {
        Text("Button")
    }
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = { /* Do something! */ }) {
        Text("I'm an Outlined Button")
    }
}

@Composable
fun TextButtonExample() {
    TextButton(onClick = { /* Do something! */ }) {
        Text("I'm a Text Button")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposePlayTheme {

        TextButtonExample()
    }
}