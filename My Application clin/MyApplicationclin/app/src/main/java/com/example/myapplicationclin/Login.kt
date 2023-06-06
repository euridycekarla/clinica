package com.example.myapplicationclin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun cadastrar(view: View){
        val intent= Intent(this,Cadastro::class.java)
        startActivity(intent)
    }
    fun login(view: View){
        val intent= Intent(this,Avaliacao::class.java)
        startActivity(intent)
    }
}