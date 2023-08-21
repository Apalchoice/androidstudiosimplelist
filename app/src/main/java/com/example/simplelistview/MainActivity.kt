package com.example.simplelistview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplelistview.ui.theme.SimplelistviewTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Simplelistview()
        }
    }
}
private val namelist= mutableListOf("eric","alex","robert")
 private val listModifier= Modifier
     .fillMaxSize()
     .background(Color.Green)
     .padding(30.dp)
private val textStyle=androidx.compose.ui.text.TextStyle(fontSize =25.sp,color= Color.Red)
@Composable
fun Simplelistview(){
    LazyColumn(modifier = listModifier){
        items(namelist){
            jina ->
            Text(text = jina,style= textStyle)
           
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimplelistviewTheme (){}
}