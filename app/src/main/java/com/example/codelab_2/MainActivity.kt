package com.example.codelab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
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


        // onClick Event Listener
        rollBtn.setOnClickListener {

            rollDice()
        }

        var countup:Button = findViewById(R.id.countup)

        countup.setOnClickListener {
            countUp()
        }

        // reset button
        val reset:Button = findViewById(R.id.reset)

        reset.setOnClickListener {
            reset()
        }

    }

    private fun randomNumber() : String {
        return (1..6).random().toString()
    }

    private fun rollDice() {

        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.rollValue)
        resultText.text = randomInt.toString()

        val img:ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        img.setImageResource(drawableResource)

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

    private fun reset() {
        // get the current value of rollValue
        var rollValue:TextView = findViewById(R.id.rollValue)

        rollValue.text = "0"
    }
}