package com.example.comercialguiderj.model

import android.graphics.drawable.Drawable

data class LojaDataClass (
    val nome: String,
    val foto: Drawable,
    val celUm: String = " ",
    val celDois: String = " ",
    val celTres: String = " ",
    val emailUm: String = " ",
    val emailDois: String = " ",
    val endereco: String = " "
)