package com.wwc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRollDice = findViewById<Button>(R.id.buttonDice)
        var imageDice1 = findViewById<ImageView>(R.id.dice1)
        var imageDice2 = findViewById<ImageView>(R.id.dice2)


        buttonRollDice.setOnClickListener {
            val imageNumberDice1: Int = imagePicker(dropDice())
            val imageNumberDice2: Int = imagePicker(dropDice())

            imageDice1.setImageResource(imageNumberDice1)
            imageDice2.setImageResource(imageNumberDice2)
        }
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

    fun dropDice(): Int {
        return (1..6).random()
    }
}