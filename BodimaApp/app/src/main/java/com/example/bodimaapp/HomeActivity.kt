package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // Set the layout

        val nextButton1 = findViewById<ImageView>(R.id.supportbutton1)
        nextButton1.setOnClickListener {

            val intent = Intent(this, supportActivity::class.java)
            startActivity(intent)
        }
        val nextButton2 = findViewById<ImageView>(R.id.addpostbutton1)
        nextButton2.setOnClickListener {

            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }
        val nextButton3 = findViewById<ImageView>(R.id.savebutton1)
        nextButton3.setOnClickListener {

            val intent = Intent(this, SavedActivity::class.java)
            startActivity(intent)
        }
        val nextButton4 = findViewById<ImageView>(R.id.profilebutton1)
        nextButton4.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val nextButton5 = findViewById<ImageView>(R.id.details2)
        nextButton5.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
        val nextButton6 = findViewById<LinearLayout>(R.id.details1)
        nextButton6.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }


    }

}