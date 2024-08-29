package com.example.buildresponsivelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buildresponsivelist.ui.theme.BuildResponsiveListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResponsiveList() {
LazyColumn (modifier = Modifier.padding(all = 10.dp)){
    item {
        Text(
            text = "Contact List",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.padding(top = 2.dp))



            Row {

                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Person"

                )
                Spacer(modifier = Modifier.width(10.dp))
                Column{
                    Text(text = "Nimra", fontSize = 20.sp)

                    Text(text = "manimra840@gmail.com", fontSize = 20.sp)

                    Text(text = "03238002328", fontSize = 20.sp)}

            }
            Spacer (modifier = Modifier.padding(top=30.dp))
        Row {

            Icon(
                Icons.Filled.Person,
                contentDescription = "Person"

            )
            Spacer(modifier = Modifier.width(10.dp))
            Column{
                Text(text = "Nimra", fontSize = 20.sp)

                Text(text = "manimra840@gmail.com", fontSize = 20.sp)

                Text(text = "03238002328", fontSize = 20.sp)}

        }
        Spacer (modifier = Modifier.padding(top=30.dp))
        Row {

            Icon(
                Icons.Filled.Person,
                contentDescription = "Person"

            )
            Spacer(modifier = Modifier.width(10.dp))
            Column{
                Text(text = "Nimra", fontSize = 20.sp)

                Text(text = "manimra840@gmail.com", fontSize = 20.sp)

                Text(text = "03238002328", fontSize = 20.sp)}

        }
        Spacer (modifier = Modifier.padding(top=30.dp))
        Row {

            Icon(
                Icons.Filled.Person,
                contentDescription = "Person"

            )
            Spacer(modifier = Modifier.width(10.dp))
            Column{
                Text(text = "Nimra", fontSize = 20.sp)

                Text(text = "manimra840@gmail.com", fontSize = 20.sp)

                Text(text = "03238002328", fontSize = 20.sp)}

        }
        Spacer (modifier = Modifier.padding(top=30.dp))







    }
 }
}



