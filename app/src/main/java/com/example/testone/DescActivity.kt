package com.example.testone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DescActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)

        val args = intent.extras

        val textName = findViewById<TextView>(R.id.catName)
        val textDesc = findViewById<TextView>(R.id.catDescription)

        textName.text = args?.getString("catName")
        textDesc.text = args?.getString("catDescription")
    }
}