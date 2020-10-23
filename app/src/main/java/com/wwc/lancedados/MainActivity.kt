package com.wwc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRollDice = findViewById<Button>(R.id.buttonDice)
        var imageDice1 = findViewById<ImageView>(R.id.dice1)
        var valueDice2 = findViewById<ImageView>(R.id.dice2)

        buttonRollDice.setOnClickListener {

        }
    }

    fun dropDice(): Int {
        return (1..6).random()
    }
}