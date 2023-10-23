package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_user)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, ProfileAkunActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}