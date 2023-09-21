package com.example.assignment2

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2.ui.theme.Assignment2Theme
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var rollbutton: Button
    private lateinit var rolltext: TextView
    private lateinit var diceimg :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rollbutton=findViewById(R.id.rollbutton)
        diceimg=findViewById(R.id.diceimg)
        rolltext=findViewById(R.id.rolltext)
        rollbutton.setOnClickListener{
            rolldice()
        }
    }
    private fun rolldice() {
        val rno = Random.nextInt(6)+1
        rolltext.text="and the roll is $rno"
        when (rno){
            1->diceimg.setImageResource(R.drawable.one)
            2->diceimg.setImageResource(R.drawable.two)
            3->diceimg.setImageResource(R.drawable.three)
            4->diceimg.setImageResource(R.drawable.four)
            5->diceimg.setImageResource(R.drawable.five)
            6->diceimg.setImageResource(R.drawable.six)
        }
    }
}
