package com.neu.classmate.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.neu.classmate.R
import com.neu.classmate.Routes

@Composable
fun AuthScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "ClassMate",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Your Academic Sidekick for Tracking Tasks, and Deadlines",
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedButton(onClick = {
            navController.navigate(Routes.LoginScreen)
        },
            modifier = Modifier.fillMaxWidth().height(50.dp)) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(Routes.SignupScreen)
        },
            modifier = Modifier.fillMaxWidth().height(50.dp)) {
            Text("Sign up")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.5.dp,
                color = Color.Gray
            )

            Text(
                text = "Or sign in with",
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.Gray,
                fontSize = 14.sp
            )

            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.5.dp,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {

            },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.googlelogo), //logo file
                    contentDescription = "Google logo",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Google")
            }
        }
    }
}