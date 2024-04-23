package com.example.design

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginTop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val container = findViewById<LinearLayout>(R.id.container)

//        container.orientation = LinearLayout.VERTICAL
//        container.setPadding(10, 10, 10, 10)
//
//        val element1 = TextView(this)
//        element1.text = "Element 1"
//        element1.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            50
//        )
//        container.addView(element1)
//
//        val element2 = TextView(this)
//        element2.text = "Element 2"
//        element2.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            50
//        ).apply {
//            topMargin = 25
//        }
//        container.addView(element2)
//
//        val element3 = TextView(this)
//        element3.text = "Element 3"
//        element3.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            50
//        ).apply {
//            topMargin = 25
//        }
//        container.addView(element3)
//
//        val button = Button(this)
//        button.text = "Click me!"
//        button.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            50
//        ).apply {
//            topMargin = 25
//        }
//        container.addView(button)
//
//        container.gravity = Gravity.CENTER_VERTICAL

    }
}