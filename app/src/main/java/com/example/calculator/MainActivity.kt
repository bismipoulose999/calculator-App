package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition(view: View) {
        intent= Intent(this,additionactivity::class.java)
        startActivity(intent)
    }

    fun Subtraction(view: View) {
        intent= Intent(this,Subtractionactivity::class.java)
        startActivity(intent)
    }

    fun multiplication(view: View) {
        intent= Intent(this,multiplicationactivity::class.java)
        startActivity(intent)
    }

    fun division(view: View) {
        intent= Intent(this,Divisionactivity::class.java)
        startActivity(intent)
    }
}