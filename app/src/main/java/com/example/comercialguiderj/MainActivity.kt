package com.example.comercialguiderj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = "Guia Comercial"

        val buttonCardoso = findViewById<Button>(R.id.buttonCardoso)

        buttonCardoso.setOnClickListener {
            val intent = Intent(this, CardosoMainActivity::class.java)
            startActivity(intent)
        }
    }
}