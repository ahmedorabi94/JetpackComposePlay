package com.ahmedorabi.jetpackcomposeplay.ui.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme


//Spacer is a Composable that can be used when you want to add an additional space between Composables


@Composable
fun SpacerDemo() {
    Column {
        Text("Hello")
        Spacer(modifier = Modifier.size(30.dp))
        Text("World")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//
//        SpacerDemo()
//    }
//}