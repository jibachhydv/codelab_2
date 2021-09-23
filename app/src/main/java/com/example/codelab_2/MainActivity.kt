package com.example.codelab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the dice roll button
        var rollBtn:Button = findViewById(R.id.rollbutton)

        // get the rollValue
        var rollValue:TextView = findViewById(R.id.rollValue)

        // set roll value to random number
        rollValue.text = randomNumber()

        Log.d("error", "i am error")

        // onClick Event Listener
        rollBtn.setOnClickListener {
            Log.d("btn", "Button Clicked")

            val rands = (1..6).random()

            rollValue.text = randomNumber()
        }

    }

    fun randomNumber() : String {
        return (1..6).random().toString()
    }
}