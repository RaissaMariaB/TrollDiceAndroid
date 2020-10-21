package com.wwc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRollDice = findViewById<Button>(R.id.buttonDice)
        var valueDice1 = findViewById<TextView>(R.id.dice1)
        var valueDice2 = findViewById<TextView>(R.id.dice2)

        buttonRollDice.setOnClickListener {
            valueDice1.text = dropDice().toString()
            valueDice2.text = dropDice().toString()
        }
    }

    fun dropDice(): Int {
        return (1..6).random()
    }
}