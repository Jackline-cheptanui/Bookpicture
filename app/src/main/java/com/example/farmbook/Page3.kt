package com.example.farmbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    lateinit var btnOutput3: Button
    lateinit var btnNumber1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        castView()
        click()
        onClick()

    }


    fun castView() {
        btnOutput3 = findViewById(R.id.btnOutput3)
        btnNumber1 = findViewById(R.id.btnNumber1)

    }

    fun click() {
        btnOutput3.setOnClickListener {
            val intent = Intent(baseContext, Page4::class.java)
            startActivity(intent)
        }
    }

    fun onClick() {
        btnNumber1.setOnClickListener {
            val intent = Intent(baseContext, Page2::class.java)
            startActivity(intent)
        }
    }

}