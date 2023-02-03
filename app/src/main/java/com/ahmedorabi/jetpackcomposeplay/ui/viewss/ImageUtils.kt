package com.ahmedorabi.jetpackcomposeplay.ui.viewss

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedorabi.jetpackcomposeplay.R
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme


@Composable
fun ImageResourceDemo() {
    val painter = painterResource(id = R.drawable.ic_launcher_background)
    Image(
        painter = painter,
        contentDescription = "",
        contentScale = ContentScale.Fit
    )
}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//        ImageResourceDemo()
//    }
//}