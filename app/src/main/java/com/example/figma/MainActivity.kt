package com.example.figma

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nSurname = findViewById<EditText>(R.id.surnameED)
        val nFirstname = findViewById<EditText>(R.id.firstNameED)
        val nEmail = findViewById<EditText>(R.id.emailED)
        val nButton = findViewById<Button>(R.id.accessButton)

        nButton.setOnClickListener {
            val intent = Intent(this,DisplayMain::class.java)
        }

    }

}