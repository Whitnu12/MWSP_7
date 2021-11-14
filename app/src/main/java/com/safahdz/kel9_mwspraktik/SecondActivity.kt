package com.safahdz.kel9_mwspraktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

lateinit var btnPresensi : Button
lateinit var btnKuesioner : Button
class SecondActivity : AppCompatActivity() {
    lateinit var tvNPM : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnPresensi = findViewById(R.id.btnPresensi)
        btnKuesioner = findViewById(R.id.btnKuesioner)
        tvNPM = findViewById(R.id.tvNPM)

        btnPresensi.setOnClickListener(){
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "activity : onCreate()", Toast.LENGTH_SHORT).show();
        }
        tvNPM.setText(intent.getStringExtra("npm"))

        btnKuesioner.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.flFragment,FragmentTwo())
            fr.commit()
        }

        var fr = supportFragmentManager.beginTransaction()
        fr.add(R.id.flFragment,FragmentOne())
        fr.commit()

        Log.i("Main Activity", "onCreate")
    }
    }


