package com.ahmedorabi.jetpackcomposeplay.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme

//A Row will show each child next to the previous children. It’s similar to a LinearLayout with a horizontal orientation.


@Composable
fun RowExample() {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//
//        RowExample()
//    }
//}