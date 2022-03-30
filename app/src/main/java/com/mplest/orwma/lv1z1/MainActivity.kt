package com.mplest.orwma.lv1z1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSpremi = findViewById<Button>(R.id.btnSpremi)
        val etUpper = findViewById<EditText>(R.id.etUpper)
        val etLower = findViewById<EditText>(R.id.etLower)


        btnSpremi.setOnClickListener {
            val tvUpper = findViewById<TextView>(R.id.tvUpper) as TextView
            tvUpper.setText(etUpper.text.toString())

            val tvLower = findViewById<TextView>(R.id.tvLower) as TextView
            tvLower.setText(etLower.text.toString())
        }
    }
}