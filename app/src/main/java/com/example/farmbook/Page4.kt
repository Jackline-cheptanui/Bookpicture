package com.example.farmbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    lateinit var btnOutput4:Button
    lateinit var btnBack3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castView()
        onClick()
     onClick()
    }
    fun castView() {
        btnOutput4 = findViewById(R.id.btnOutput4)
        btnBack3=findViewById(R.id.btnNumber1)

    }
    fun onClick() {
        btnOutput4.setOnClickListener {
            val intent = Intent(baseContext, Page5::class.java)
            startActivity(intent)
        }

    fun onClick2(){
        btnBack3.setOnClickListener {
            val intent= Intent(baseContext,Page3::class.java)
            startActivity(intent)
        }
    }

}}
