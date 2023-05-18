package com.example.recyleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.klosess,
                "Miroslav Klose",
                "Contoh"
            ),
            Superhero(
                R.drawable.haaland,
                "Erling Haaland",
                "emm"
            ),
            Superhero(
                R.drawable.jokowiii,
                "IR.Jokowi Widodo",
                "presiden Ri pertama"
            ),
            Superhero(
                R.drawable.saitamaa,
                "Saitama The One Puch Man",
                "aifaoifha"
            ),
            Superhero(
                R.drawable.yoriichi,
                "Yoriichi Tsugikuni",
                "Hasira yang paling Kuat Pada era Sengoku"
            ),
            Superhero(
                R.drawable.zenitzuu,
                "Zenitzu Agatsuma",
                "pilar Petir yang paling hebat pada Era Taisho"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}