package com.example.figmadoctor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.figmadoctor.databinding.ActivityBusinessCard2Binding
import com.example.figmadoctor.databinding.ActivityBusinessCard3Binding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BusinessCard3 : AppCompatActivity() {

    private lateinit var binding: ActivityBusinessCard3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessCard3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners(){
        val buttonList: List<View> = listOf(
            binding.instagramButton,
            binding.facebookButton,
            binding.linkedinButton,
            binding.textButton,
            binding.callButton,
            binding.emailButton,
        )

        for (button in buttonList){
            button.setOnClickListener { createIntent(it) }
        }
    }

    private fun createIntent(view: View){
        when (view.id){
            R.id.instagram_button -> startInstaIntent()
            R.id.facebook_button -> startFacebookIntent()
            R.id.linkedin_button -> startLinkedinIntent()
            R.id.text_button -> startTextIntent()
            R.id.call_button -> startCallIntent()
            R.id.email_button -> startEmailIntent()
        }
    }

    private fun startInstaIntent(){
        binding.instagramButton.setOnClickListener{
            val instaIntent: Intent = Uri.parse("https://instagram.com/oleg_mayami_?igshid=YmMyMTA2M2Y=")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage) }
            instaIntent.action = Intent.ACTION_VIEW

            startActivity(instaIntent)
        }
    }

    private fun startFacebookIntent(){
        binding.facebookButton.setOnClickListener{
            val facebookIntent: Intent = Uri.parse("https://www.facebook.com/miamioleg.official/")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage) }

            startActivity(facebookIntent)
        }
    }

    private fun startLinkedinIntent(){
        binding.linkedinButton.setOnClickListener{
            val linkedinIntent: Intent = Uri.parse("https://www.linkedin.com/in/oleg-miami-7b547b208")
                .let{ webpage -> Intent(Intent.ACTION_VIEW, webpage) }

            startActivity(linkedinIntent)
        }
    }

    private fun startTextIntent(){
        // TODO:
    }

    private fun startEmailIntent(){
        binding.emailButton.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:"+"oleg.mayami93@gmail.com")

            startActivity(emailIntent)
        }
    }

    private fun startCallIntent(){
        binding.callButton.setOnClickListener{
            val callIntent: Intent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:"+"+996 774 678 876")

            startActivity(callIntent)
        }
    }
}