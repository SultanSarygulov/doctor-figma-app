package com.example.figmadoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BusinessCard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makeAppButton = findViewById<Button>(R.id.make_an_app)
        makeAppButton.setOnClickListener{
            val intent = Intent(this, BusinessCard3::class.java)
            startActivity(intent)
        }
    }
}