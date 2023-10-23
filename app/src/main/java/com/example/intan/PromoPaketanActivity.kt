package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PromoPaketanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo_paketan)

        val beranda = findViewById<Button>(R.id.beranda)
        beranda.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val fav = findViewById<Button>(R.id.favorit)
        fav.setOnClickListener {
            val intent = Intent(this, FavoritActivity::class.java)
            startActivity(intent)
            finish()
        }

        val profileakun = findViewById<Button>(R.id.profileakun)
        profileakun.setOnClickListener {
            val intent = Intent(this, ProfileAkunActivity::class.java)
            startActivity(intent)
            finish()
        }

        val harga = findViewById<Button>(R.id.button1)
        harga.setOnClickListener {
            val intent = Intent(this, PromoHargaActivity::class.java)
            startActivity(intent)
            finish()
        }
        val gratis = findViewById<Button>(R.id.button2)
        gratis.setOnClickListener {
            val intent = Intent(this, GratisProdukActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}