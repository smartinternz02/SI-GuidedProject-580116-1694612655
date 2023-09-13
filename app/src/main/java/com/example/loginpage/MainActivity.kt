package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginpage.ui.theme.LoginPageTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity

//import androidx.core.content.ContextCompat.startActivity
//

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppContent()
        }
    }
}

@SuppressLint("QueryPermissionsNeeded")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppContent() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context= LocalContext.current
    Column(
        modifier= Modifier.run {
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.login_background),
                    contentScale = ContentScale.FillBounds
                )

        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment=Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.profile_pic),
            contentDescription ="Profile Image",
            modifier= Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Text(text = "LOGIN PAGE",
            style = MaterialTheme.typography.headlineSmall.copy(color= Color(23))
        )
        TextField(
            modifier=Modifier
                .padding(16.dp),
            value = username,
            onValueChange = { newUserName -> username = newUserName },
            placeholder = { Text("Enter Username") },
            label={Text("Username")},
            leadingIcon = {
                Image(
                    painter = painterResource(id = android.R.drawable.star_on),
                    contentDescription = "contentDescription"
                )
            },

        )
        TextField(
            modifier=Modifier
                .padding(16.dp),
            value = password,
            onValueChange = { newPassword -> password = newPassword },
            placeholder = { Text("Enter Password") },
            label = { Text("Password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done,
            )
        )
        Button(
            onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.amazon.in")
            if(intent.resolveActivity(context.packageManager)!=null)
            {
                context.startActivity(intent)
            }
            else
            {
                Toast.makeText(context,"No web browser is available",Toast.LENGTH_LONG).show()
            }
        }
        ) {
            Text(text = "Amazon")
        }
        Button(onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.facebook.com")
            if(intent.resolveActivity(context.packageManager)!=null)
            {
                context.startActivity(intent)
            }
            else
            {
                Toast.makeText(context,"No web browser is available",Toast.LENGTH_LONG).show()
            }
        }) {
            Text(text = "Facebook")
        }
        Button(onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedIn.com")
            if(intent.resolveActivity(context.packageManager)!=null)
            {
                context.startActivity(intent)
            }
            else
            {
                Toast.makeText(context,"No web browser is available",Toast.LENGTH_LONG).show()
            }
        }) {
            Text(text = "LinkedIn")
        }
    }
}
