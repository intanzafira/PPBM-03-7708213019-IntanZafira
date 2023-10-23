package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FavoritActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorit)

        val beranda = findViewById<Button>(R.id.beranda)
        beranda.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val promoharga = findViewById<Button>(R.id.promo)
        promoharga.setOnClickListener {
            val intent = Intent(this, PromoHargaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val profileakun = findViewById<Button>(R.id.profileakun)
        profileakun.setOnClickListener {
            val intent = Intent(this, ProfileAkunActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}