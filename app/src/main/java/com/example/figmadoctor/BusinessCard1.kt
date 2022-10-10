package com.example.figmadoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.figmadoctor.databinding.ActivityMainBinding

class BusinessCard1 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.makeAnApp.setOnClickListener{
            val intent = Intent(this, BusinessCard2::class.java)
            startActivity(intent)
        }

        binding.olegStatusButton.setOnClickListener {
            val intent = Intent(this, BusinessCard3::class.java)
            startActivity(intent)
        }
    }
}