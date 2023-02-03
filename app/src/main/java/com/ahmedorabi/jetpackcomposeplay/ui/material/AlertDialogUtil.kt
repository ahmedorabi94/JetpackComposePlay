package com.ahmedorabi.jetpackcomposeplay.ui.material

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedorabi.jetpackcomposeplay.ui.theme.JetpackComposePlayTheme


@Composable
fun AlertDialogSample() {

    MaterialTheme {
        val openDialog = remember {
            mutableStateOf(false)
        }

        Button(onClick = {
            openDialog.value = true
        }) {
            Text(text = "Click me")
        }

        if (openDialog.value) {
            AlertDialog(onDismissRequest = {
                openDialog.value = false
            }, title = {
                Text(text = "Title ")
            }, text = { Text(text = "Here is a text ") },
                confirmButton = {
                    Button(onClick = {
                        openDialog.value = false
                    }) {
                        Text(text = "This is the Confirm Button")
                    }
                }, dismissButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text("This is the dismiss Button")
                    }
                }

            )
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposePlayTheme {
//
//        AlertDialogSample()
//    }
//}