package com.nadia.pertemuan2baru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nadia.pertemuan2baru.ui.theme.Pertemuan2BaruTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan2BaruTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        nadia = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(nadia: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Zootopia",
            modifier = nadia,
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Welcome to our zoo!!"
        )

        Image(
            painter = painterResource(id = R.drawable.zootopia),
            contentDescription = "zootopia",
            modifier = Modifier.size(250.dp)
        )

        Text (
            text = "New at the Zoo",
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            text = "Stay tuned on November 6th",
            color = Color.Red,
            fontSize = 20.sp
        )

        Text(
            text = "Panda",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan2BaruTheme {
        Greeting("Android")
    }
}