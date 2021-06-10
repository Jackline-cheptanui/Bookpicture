package com.example.farmbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnOutput:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView()
        onClick()



    }
    fun castView(){
        btnOutput=findViewById(R.id.btnOutput)

    }
    fun onClick(){
        btnOutput.setOnClickListener {
            val intent=Intent(baseContext,Page2::class.java)
            startActivity(intent)
        }


    }
}