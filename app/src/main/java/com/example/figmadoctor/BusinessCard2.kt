package com.example.figmadoctor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.figmadoctor.databinding.ActivityBusinessCard2Binding

class BusinessCard2 : AppCompatActivity() {

    private lateinit var binding: ActivityBusinessCard2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessCard2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.callCard.setOnClickListener{
            val callIntent: Intent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:"+"+996 774 678 876")

            startActivity(callIntent)
        }

        binding.whatsappCard.setOnClickListener{
            Toast.makeText(getApplicationContext(),"Unable to contact to Whatsapp", Toast.LENGTH_LONG).show()
        }

        binding.emailCard.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:"+"oleg.mayami93@gmail.com")

            startActivity(emailIntent)
        }

        binding.websiteCard.setOnClickListener{
            val websiteIntent = Uri.parse("https://dental.com")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage) }

            startActivity(websiteIntent)
        }

        binding.telegramCard.setOnClickListener {
            val telegramIntent = Uri.parse("https://t.me/oleg_mayamy")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage)}

            startActivity(telegramIntent)
        }

        binding.contactCard.setOnClickListener {
            Toast.makeText(getApplicationContext(),"Unable to save contact", Toast.LENGTH_LONG).show()
        }

        binding.mapTextLink.setOnClickListener{
            val mapIntent = Uri.parse("https://go.2gis.com/yrbxc")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage) }

            startActivity(mapIntent)
        }
    }
}