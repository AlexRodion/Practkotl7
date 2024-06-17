package com.example.practkotln

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var buttonCounter: Button
    lateinit var textViewer: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            textViewer.text = "Привет, друг"
        }
        buttonCounter.setOnClickListener{
            var counter = textViewer.text.toString().toInt()
            textViewer.text = "Я нажал на кнопку ${++counter} раз"
        }

    }
}