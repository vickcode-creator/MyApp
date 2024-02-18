package com.example.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       val btnClickme = findViewById<Button>(R.id.mybtton)
        val tvMytextView = findViewById<TextView>(R.id.textView)
        var timesclicked = 0
        btnClickme.setOnClickListener(){
            timesclicked= timesclicked+ 1

            tvMytextView.text= timesclicked.toString()
            Toast.makeText(this,"Hey Iam victor ", Toast.LENGTH_LONG).show()

        }

    }
}