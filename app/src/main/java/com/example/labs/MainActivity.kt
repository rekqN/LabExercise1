package com.example.labs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.openSecondActivityButton)
        buttonClick.setOnClickListener{
            val intent =  Intent(this, MainActivity2::class.java).apply {putExtra("name", "Pedro Freitas")}
            startActivity(intent)
            finish()
        }
    }
}