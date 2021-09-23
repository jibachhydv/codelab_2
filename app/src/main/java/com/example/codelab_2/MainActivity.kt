package com.example.codelab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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

            val rands = (1..6).random()

            rollValue.text = randomNumber()
        }

        var countup:Button = findViewById(R.id.countup)

        countup.setOnClickListener {
            countUp()
        }

    }

    private fun randomNumber() : String {
        return (1..6).random().toString()
    }

    private fun rollDice() {
        Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {

        // get the current value of rollValue
        var rollValue:TextView = findViewById(R.id.rollValue)

//        Toast.makeText(this,rollValue.text, Toast.LENGTH_SHORT).show()


        // change the value to int
        val parsedInt : Int = (rollValue.text).toString().toInt()


        if (parsedInt <= 5)
        {
            rollValue.text = (parsedInt + 1).toString()
        }

    }
}