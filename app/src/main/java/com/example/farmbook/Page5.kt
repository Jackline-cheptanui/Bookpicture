package com.example.farmbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5 : AppCompatActivity() {
    lateinit var btnBack4:Button
   // lateinit var btnOutput5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        onClick5()
        castView()
    }

    fun castView() {
       //btnOutput5 = findViewById(R.id.btnOutput5)
        btnBack4=findViewById(R.id.btnBack)

    }
    fun onClick5() {
       btnBack4.setOnClickListener {
            val back = Intent(baseContext, MainActivity::class.java)
            startActivity(back)
       }

    }

}
