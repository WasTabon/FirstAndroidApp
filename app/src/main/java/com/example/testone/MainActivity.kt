package com.example.testone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationAttributes
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Bon = Cat(getString(R.string.cat_name_Bon), getString(R.string.cat_description_Bon), R.drawable.baseline_sanitizer)
        val Ben = Cat(getString(R.string.cat_name_Ben), getString(R.string.cat_description_Ben), R.drawable.baseline_sanitizer)
        val Bin = Cat(getString(R.string.cat_name_Bin), getString(R.string.cat_description_Bin), R.drawable.baseline_sanitizer)

        val buttonDetailsBon = findViewById<Button>(R.id.CatOneDetails)
        val buttonDetailsBen = findViewById<Button>(R.id.CatTwoDetails)
        val buttonDetailsBin = findViewById<Button>(R.id.CatThreeDetails)

        buttonDetailsBon.setOnClickListener {
            val intent = Intent(this, DescActivity::class.java)
            startActivity(intent)
        }
    }

    

}