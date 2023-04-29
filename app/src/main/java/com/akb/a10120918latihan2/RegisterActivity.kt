package com.akb.a10120918latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

/**
 * Tanggal Pengerjaan : 29/04/2023
 * NIM : 10120918
 * Nama : Dennie Fuzi Alviyanies
 * Kelas : IF-10
 * */

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val almostThere = findViewById<MaterialButton>(R.id.btnRegister)
        almostThere.setOnClickListener {
            startActivity(Intent(this, AlmostThereActivity::class.java))
        }
    }
}