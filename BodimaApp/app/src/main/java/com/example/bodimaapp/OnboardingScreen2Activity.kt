package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_2) // Set the layout

        val nextButton = findViewById<Button>(R.id.Next_button1)
        nextButton.setOnClickListener {
            // Navigate to OnboardingScreen2Activity
            val intent = Intent(this, OnboardingScreen3Activity::class.java)
            startActivity(intent)
        }
        val nextButton1 = findViewById<ImageView>(R.id.backbutton1)
        nextButton1.setOnClickListener {
            val intent = Intent(this, OnboardingScreen1Activity::class.java)
            startActivity(intent)
        }
        val nextButton2 = findViewById<TextView>(R.id.skip2)
        nextButton2.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
        }
    }
}


