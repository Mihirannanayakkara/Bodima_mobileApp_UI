package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class signupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup) // Set the layout

        val nextButton1 = findViewById<ImageView>(R.id.backbutton4)
        nextButton1.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
        }
    }
}