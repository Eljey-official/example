package com.example.figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_main)

        val surnameText = findViewById<TextView>(R.id.surnameTV)
        val firstNameText = findViewById<TextView>(R.id.firstNameTV)
        val emailText = findViewById<TextView>(R.id.emailTV)

        val intent : Intent = intent

        val surnameTextToDisplay = intent.getStringExtra("surname")
        surnameText.text = surnameTextToDisplay.toString()

        val firstNameTextToDisplay = intent.getStringExtra("firstname")
        firstNameText.text = firstNameTextToDisplay.toString()

        val emailTextToDisplay = intent.getStringExtra("email")
        emailText.text = emailTextToDisplay.toString()
    }
}