package com.example.testingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener() {
            Toast.makeText(applicationContext, "Hey! how are you?", Toast.LENGTH_SHORT).show()
        }
    }
    fun second(){

    }
}