package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp.ui.theme.CounterAppTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    var  Count by remember { mutableStateOf<Int>(0) }
    var count = remember { mutableStateOf<Int>(0) }
//var count=0

//    Text("hello",Modifier.padding(50.dp))
    Column (modifier=Modifier.fillMaxSize().background(Color.Red),
            verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(" ${count.value}" , style= TextStyle(fontSize = 50.sp ,
            color = Color.Blue,
            fontWeight = FontWeight.ExtraBold
        ))
Button(onClick = {
    count.value++
}) {
    Text("Update the count", style= TextStyle(fontSize = 30.sp))
}
//)
//
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterAppTheme {
        Greeting("Android")
    }
}