package com.example.comercialguiderj.model

data class LojaDataClass(
    val nome: String,
    val foto: String,
    val categorias: String,
    val endereco: String = " ",
    val contato: Array<ContatoDataClass>
)