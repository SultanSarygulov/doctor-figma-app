package com.example.figmadoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BusinessCard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business_card3)

        val makeAppButton = findViewById<FloatingActionButton>(R.id.facebook_button)
        makeAppButton.setOnClickListener{
            val intent = Intent(this, BusinessCard2::class.java)
            startActivity(intent)
        }
    }
}