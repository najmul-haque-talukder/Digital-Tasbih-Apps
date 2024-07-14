package com.example.tasbih

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private lateinit var clickButton: Button
    private lateinit var subButton: Button
    private lateinit var restartButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        clickButton = findViewById(R.id.clickButton)
        subButton = findViewById(R.id.SubtractButton)
        restartButton = findViewById(R.id.RestartButton)

        var count = 0
        clickButton.setOnClickListener {
            count++
            clickButton.setText("$count")
        }

        subButton.setOnClickListener {
            count--
            clickButton.setText("$count")
        }

        restartButton.setOnClickListener {
            count = 0
            clickButton.setText("$count")
        }



    }
}