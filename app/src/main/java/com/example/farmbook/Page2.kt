package com.example.farmbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    lateinit var btnOutput2: Button
    lateinit var btnBack1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castView2()
        onClick2()
    }


    fun castView2() {
        btnOutput2 = findViewById(R.id.btnOutput2)
        btnBack1=findViewById(R.id.btnBack1)

    }

    fun onClick2() {
        btnOutput2.setOnClickListener {
            val intent = Intent(baseContext, Page3::class.java)
            startActivity(intent)
        }
    }
}