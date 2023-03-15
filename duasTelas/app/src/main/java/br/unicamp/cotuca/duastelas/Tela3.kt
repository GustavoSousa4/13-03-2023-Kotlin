package br.unicamp.cotuca.duastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val btnBack = findViewById(R.id.btnVoltar3)as Button
        btnBack.setOnClickListener{
            this.finish()
        }
        val btnBackAll = findViewById(R.id.btnBack1) as Button
        btnBackAll.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }
}