package com.safahdz.kel9_mwspraktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

lateinit var btnLogin : Button
lateinit var etNPM : EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        etNPM = findViewById(R.id.etNPM)

        btnLogin.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("npm", etNPM.text.toString())
            startActivity(intent)
        }
    }
}