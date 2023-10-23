package com.example.intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class BerandaActivity : AppCompatActivity() {

    val Ruangan = arrayOf("A4","A3","A2")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Ruangan)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected Ruangan is =" +  Ruangan[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val fav = findViewById<Button>(R.id.favorit)
        fav.setOnClickListener {
            val intent = Intent(this, FavoritActivity::class.java)
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