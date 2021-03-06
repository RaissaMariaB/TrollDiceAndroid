package com.wwc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRollDice = findViewById<Button>(R.id.buttonDice)
        var imageDice1 = findViewById<ImageView>(R.id.dice1)
        var imageDice2 = findViewById<ImageView>(R.id.dice2)


        buttonRollDice.setOnClickListener {
            imageDice1.setImageResource(dropDice())
            imageDice2.setImageResource(dropDice())
        }

        val playerName = getIntent().getStringExtra("playerName")
        val playerNameTextView = findViewById<TextView>(R.id.textViewGreeting)
        playerNameTextView.text = "Olá, $playerName !"
    }

    fun dropDice(): Int {
       return imagePicker(numberGenerator())
    }

    private fun imagePicker(num: Int): Int {
        return when(num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }

    fun numberGenerator(): Int {
        return (1..6).random()
    }
}