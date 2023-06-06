package com.example.myapplicationclin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)
    }
    fun BotaoAva(view: View){
        val intent= Intent(this,Avaliacao::class.java)
        startActivity(intent)
    }
    fun BotaoCons(view: View){
        val intent= Intent(this,Consulta::class.java)
        startActivity(intent)
    }
}