package com.example.rickandmorty

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetallePersonajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_personaje)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val speciesTextView = findViewById<TextView>(R.id.speciesTextView)
        val statusTextView = findViewById<TextView>(R.id.statusTextView)
        val characterImageView = findViewById<ImageView>(R.id.characterImageView)

        val character = intent.getSerializableExtra("character") as? Character

        if (character != null) {
            nameTextView.text = "Name: ${character.name}"
            speciesTextView.text = "Species: ${character.species}"
            statusTextView.text = "Status: ${character.status}"
            Glide.with(this).load(character.image).into(characterImageView)
        }
    }
}

