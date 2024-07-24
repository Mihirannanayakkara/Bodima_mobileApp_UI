package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SavedActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved) // Set the layout {

        val nextButton1 = findViewById<ImageView>(R.id.homebutton1)
        nextButton1.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val nextButton2 = findViewById<ImageView>(R.id.addpostbutton1)
        nextButton2.setOnClickListener {

            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }
        val nextButton3 = findViewById<ImageView>(R.id.supportbutton1)
        nextButton3.setOnClickListener {

            val intent = Intent(this, supportActivity::class.java)
            startActivity(intent)
        }
        val nextButton4 = findViewById<ImageView>(R.id.profilebutton1)
        nextButton4.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

}