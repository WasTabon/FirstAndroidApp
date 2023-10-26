package com.example.testone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationAttributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val john = Cat("John", 3)
        val bob: Animal = Cat("Bob", 1)

        val dir = GetDirestion()

        when(dir)
        {
            Direction.NORTH -> Double(4)
            Direction.WEST -> Double(4)
            Direction.SOUTH -> Double(4)
            Direction.EAST -> Double(4)

            else -> Double(5)
        }
    }

    private fun Double(x: Int) : Int
    {
        return x * 2
    }

    private fun GetDirestion() : Direction
    {
        return Direction.NORTH
    }
}