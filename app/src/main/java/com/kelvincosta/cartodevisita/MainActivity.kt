package com.kelvincosta.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kelvincosta.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    naoseiaocerto()
                }
            }
        }
    }
}

@Composable
fun naoseiaocerto() {
    val backgroundColor = colorResource(id = R.color.principal)
    val image = painterResource(id = R.drawable.android_logo)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColor),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(width = 120.dp, height = 120.dp)
            )

            Text(
                text = "Kelvin Rodrigues",
                fontSize = 36.sp,
                color = colorResource(id = R.color.white)
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.green_text),
                modifier = Modifier.padding(top = 8.dp)
            )

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {

            Divider()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp), horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_local_phone),
                    contentDescription = null,
                    tint = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp)
                )
                Text(
                    text = "+55 13 988841491",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }

            Divider()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp), horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_share),
                    contentDescription = null,
                    tint = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp)
                )

                Text(
                    text = "@kelviinbs",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }

            Divider()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp), horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = null,
                    tint = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp)
                )

                Text(
                    text = "kelvingcr16@gmail.com",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier.padding(start = 24.dp, bottom = 50.dp)
                )
            }

        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartãoDeVisitaTheme {
        naoseiaocerto()
    }
}