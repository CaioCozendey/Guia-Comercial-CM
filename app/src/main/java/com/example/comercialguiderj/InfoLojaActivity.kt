package com.example.comercialguiderj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InfoLojaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_loja)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}