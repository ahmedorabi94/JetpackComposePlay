package com.ahmedorabi.jetpackcomposeplay.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme

//A Column will show each child below the previous children. It’s similar to a LinearLayout with vertical orientation.



@Composable
fun ColumnCenterHorizontal() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(200.dp)) {
        Text("Hello World!")
        Text("Hello World!2", modifier = Modifier.align(Alignment.End))
    }
}

@Composable
fun ColumnVerticalTop() {
    Column(
        verticalArrangement = Arrangement.Top, modifier = Modifier
            .height(100.dp)
            .background(
                Color.LightGray
            )
    ) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//      //  ColumnCenterHorizontal()
//        ColumnVerticalTop()
//    }
//}