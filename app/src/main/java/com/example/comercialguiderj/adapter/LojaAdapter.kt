package com.example.comercialguiderj.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.comercialguiderj.R
import com.example.comercialguiderj.model.LojaDataClass

class LojaAdapter (private val listaDeLoja: ArrayList<LojaDataClass>)
    : RecyclerView.Adapter<LojaAdapter.LojaViewHolder>(){

    class LojaViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeLoja: TextView = itemView.findViewById(R.id.nomeLoja)
        val fotoLoja: ImageView = itemView.findViewById(R.id.fotoLoja)

        fun populaAdapterCom(loja: LojaDataClass){
            nomeLoja.text = loja.nome
            Glide.with(itemView.context).load(loja.foto).into(fotoLoja)
        }

    }

    /* Inflates view and returns HeaderViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LojaViewHolder {
        val lojaView = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_loja, parent, false)
        return LojaViewHolder(lojaView)
    }

    /* Binds number of flowers to the header. */
    override fun onBindViewHolder(holder: LojaViewHolder, position: Int) {
        holder.populaAdapterCom(listaDeLoja[position])
    }

    /* Returns number of items, since there is only one item in the header return one  */
    override fun getItemCount(): Int {
        return listaDeLoja.size
    }
}
