package com.wwc.lancedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var playButton = findViewById<Button>(R.id.playButton)
        val playerName = findViewById<EditText>(R.id.textInputPersonName).text.toString()
        val playerName2 = findViewById<EditText>(R.id.editTextTextPersonName2).text.toString()


        playButton.setOnClickListener {
             var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("playerName", playerName)

            startActivity(intent)
        }
    }
}