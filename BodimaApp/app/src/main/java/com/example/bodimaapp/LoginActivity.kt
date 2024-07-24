package com.example.bodimaapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Set the layout


        val nextButton = findViewById<Button>(R.id.loginhome)
        nextButton.setOnClickListener{

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val nextButton1 = findViewById<ImageView>(R.id.backbutton5)
        nextButton1.setOnClickListener {
            val intent = Intent(this, welcomeActivity::class.java)
            startActivity(intent)
        }
    }

}