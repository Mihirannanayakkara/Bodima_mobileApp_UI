package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class welcomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logindashboard)

        val nextButton1 = findViewById<Button>(R.id.signup1)
        nextButton1.setOnClickListener {

            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }

        val nextButton2 = findViewById<Button>(R.id.login1)
        nextButton2.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val nextButton3 = findViewById<ImageView>(R.id.backbutton6)
        nextButton3.setOnClickListener {
            val intent = Intent(this, OnboardingScreen3Activity::class.java)
            startActivity(intent)
        }
        val nextButton4 = findViewById<TextView>(R.id.logintohome)
        nextButton4.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }

}