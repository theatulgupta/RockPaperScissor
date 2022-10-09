package com.agkminds.composecamp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agkminds.composecamp4.ui.theme.ComposeCamp4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiveApp()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LiveApp() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.fist_icon),
            contentDescription = "Fist Image")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Score",
            fontSize = 20.sp)
        Text(text = "0/4",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(90.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            ChooseText("You Choose", "Rock")
            ChooseText("Android Choose", "Paper")
        }
        Spacer(modifier = Modifier.height(100.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()) {
            ObjectButton(btnText = "Rock")
            ObjectButton(btnText = "Paper")
            ObjectButton(btnText = "Scissors")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "#JetpackCompose",
            fontSize = 30.sp)
    }
}

@Composable
fun ChooseText(
    choseBy: String,
    element: String,
) {
    Column() {
        Text(text = choseBy)
        Text(text = element,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ObjectButton(
    btnText: String,
) {
    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.size(90.dp)) {
        Text(text = btnText,
            fontSize = 12.sp)
    }
}

{

}