package com.example.figmadoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BusinessCard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val olegProfileLink = findViewById<TextView>(R.id.dr_oleg_may)
        olegProfileLink.setOnClickListener {
            val intent = Intent(this, BusinessCard3::class.java)
            startActivity(intent)
        }

        val makeAppButton = findViewById<Button>(R.id.make_an_app)
        makeAppButton.setOnClickListener{
            val intent = Intent(this, BusinessCard2::class.java)
            startActivity(intent)
        }
    }
}