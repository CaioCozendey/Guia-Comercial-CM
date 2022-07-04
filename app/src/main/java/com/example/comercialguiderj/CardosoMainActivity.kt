package com.example.comercialguiderj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comercialguiderj.adapter.LojaAdapter
import com.example.comercialguiderj.model.LojaDataClass

class CardosoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardoso_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = "Cardoso Moreira"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val categoriasDeLoja = arrayListOf(
            "Advogado",
            "Distribuidor de Bebida",
            "Drogaria",
            "Loja de Roupa",
            "Mercado",
            "Padaria",
            "Restaurante",
            "")

        val loja = LojaDataClass(
            "Brasileiras Centro",
            "https://img.freepik.com/fotos-gratis/flores-amarelas-usam-fot-fundo_34836-1369.jpg",
            categoriasDeLoja[2],
            "dksajdksa",
            arrayOf()
        )

        val listaDeLoja = arrayListOf(loja)
        val recyclerViewLoja = findViewById<RecyclerView>(R.id.listaCardoso)
        recyclerViewLoja.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = LojaAdapter(listaDeLoja)
        }
    }
}