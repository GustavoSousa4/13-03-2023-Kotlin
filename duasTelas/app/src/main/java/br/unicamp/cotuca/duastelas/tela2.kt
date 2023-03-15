package br.unicamp.cotuca.duastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela2 : AppCompatActivity() {

    //lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnBack = findViewById(R.id.btnVoltar) as Button
        btnBack.setOnClickListener{
            this.finish()
        }

        val btnNext = findViewById(R.id.btnGoTo3) as Button
        btnNext.setOnClickListener {
            val intent = Intent(this, Tela3::class.java)
            startActivity(intent)
        }
    }
}