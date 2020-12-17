package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Divisionactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divisionactivity)
    }

    fun Divevent(view: View) {
        var getnum1=findViewById<EditText>(R.id.num1)
        var getnum2=findViewById<EditText>(R.id.num2)
        var res=findViewById<TextView>(R.id.div1)
        var result=getnum1.text.toString().toInt()/getnum2.text.toString().toInt()
        //Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show()
        res.text=result.toString()

    }

    fun hom(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}