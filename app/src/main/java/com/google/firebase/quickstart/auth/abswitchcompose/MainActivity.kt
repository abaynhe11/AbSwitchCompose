package com.google.firebase.quickstart.auth.abswitchcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.quickstart.auth.abswitchcompose.ui.theme.AbSwitchComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbSwitchComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Abswitch()
                }
            }
        }
    }
}

@Composable
fun Abswitch()
{
    val checked = remember { mutableStateOf(true) }

    Column {
        Switch(
            checked = checked.value,
            onCheckedChange = { checked.value = it }
        )
        if (checked.value) {
            Text("Switch is On")
        } else {
            Text("Switch is Off")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AbSwitchComposeTheme {
        Abswitch()
    }
}