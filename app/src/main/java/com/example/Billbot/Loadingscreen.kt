package com.example.Billbot

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.coinomy.R

class Loadingscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loadingscreen)

        // Delay for 2 seconds, then navigate to Login activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish() // Close Loadingscreen so it doesn't remain in the back stack
        }, 2000) // 2000ms = 2 seconds
    }

}