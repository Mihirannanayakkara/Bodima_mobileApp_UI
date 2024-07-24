package com.example.bodimaapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handler for delayed navigation
        val handler = Handler()

        // Runnable task to navigate to onboarding screen
        val navigateToOnboarding = Runnable {
            val intent = Intent(this, OnboardingScreen1Activity::class.java)
            startActivity(intent)
        }

        // Post a delayed task with 2 seconds delay (adjust as needed)
        handler.postDelayed(navigateToOnboarding, 2000)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
