package com.akb.a10120918latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val almostThere = findViewById<MaterialButton>(R.id.btnRegister)
        almostThere.setOnClickListener {
            startActivity(Intent(this, VerifyActivity::class.java))
        }
    }
}