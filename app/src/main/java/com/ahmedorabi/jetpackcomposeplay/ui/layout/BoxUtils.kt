package com.ahmedorabi.jetpackcomposeplay.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme

//The children of the Box layout will be stacked over each other. You can use the align modifier to specify where the composable should be drawn.


@Composable
fun BoxExample() {

    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))

        Box(
            Modifier
                .align(Alignment.TopCenter)
                .fillMaxHeight()
                .width(
                    50.dp
                )
                .background(Color.Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))

        FloatingActionButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(12.dp)
        ) {
           Text(text = "+")
        }

    }

}

//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//       // BoxExample()
//    }
//}