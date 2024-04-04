package com.example.retro

import com.google.gson.annotations.SerializedName

data class CatFact(
    @SerializedName("fact")
    val fact: String,
    @SerializedName("length")
    val length: Int
)