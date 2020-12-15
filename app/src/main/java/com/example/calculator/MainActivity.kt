package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var first :EditText = findViewById(R.id.first)
        var second:EditText = findViewById(R.id.second)
        var result:TextView= findViewById(R.id.result)
        var plus:Button = findViewById(R.id.plus)
        var minus:Button = findViewById(R.id.minus)
        var multiple:Button =findViewById(R.id.multiple)
        var divide:Button = findViewById(R.id.divide)
        var clear:Button = findViewById(R.id.clear)
        var exit:Button = findViewById(R.id.exit)
        var first_num:Int
        var second_num:Int
        var total:Int
        plus.setOnClickListener {
            first_num = first.text.toString().toInt()
            second_num = second.text.toString().toInt()
            total = first_num+second_num
            result.text = total.toString()
            first.text.clear()
            second.text.clear()
        }
        minus.setOnClickListener {
            first_num = first.text.toString().toInt()
            second_num = second.text.toString().toInt()
            total = first_num-second_num
            result.text = total.toString()
            first.text.clear()
            second.text.clear()
        }
        multiple.setOnClickListener {
            first_num = first.text.toString().toInt()
            second_num = second.text.toString().toInt()
            total = first_num*second_num
            result.text = total.toString()
            first.text.clear()
            second.text.clear()
        }
        divide.setOnClickListener {
            first_num = first.text.toString().toInt()
            second_num = second.text.toString().toInt()
            total = first_num/second_num
            result.text = total.toString()
            first.text.clear()
            second.text.clear()
        }
        clear.setOnClickListener {
            result.text = "0"
            first.text.clear()
            second.text.clear()
        }
        exit.setOnClickListener {
            finish()
        }

    }
}