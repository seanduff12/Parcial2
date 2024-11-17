package com.example.rickandmorty

import java.io.Serializable

data class Character(
    val id: Int,
    val name: String,
    val species: String,
    val status: String,
    val image: String
) : Serializable
