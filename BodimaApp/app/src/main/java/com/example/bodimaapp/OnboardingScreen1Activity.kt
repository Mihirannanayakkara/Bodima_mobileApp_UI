package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_1) // Set the layout

        val nextButton = findViewById<Button>(R.id.Next_button)
        nextButton.setOnClickListener {
            // Navigate to OnboardingScreen2Activity
            val intent = Intent(this, OnboardingScreen2Activity::class.java)
            startActivity(intent)
        }
        val nextButton1 = findViewById<TextView>(R.id.skip2)
        nextButton1.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
        }
    }
}
