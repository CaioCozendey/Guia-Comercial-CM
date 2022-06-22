package com.example.comercialguiderj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class CardosoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardoso_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = "Cardoso Moreira1"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recyclerViewLoja = findViewById<RecyclerView>(R.id.listaCardoso)
    }
}