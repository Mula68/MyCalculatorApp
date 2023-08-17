package com.mula68.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.my_image)
        val firstNumberField = findViewById<EditText>(R.id.first_number)
        val secondNumberField = findViewById<EditText>(R.id.second_number)
        val sumButton = findViewById<Button>(R.id.sum_button)
        val subtractButton = findViewById<Button>(R.id.subtract_button)
        val multiplyButton = findViewById<Button>(R.id.multiplication_button)
        val divideButton = findViewById<Button>(R.id.division_button)
        val result:TextView = findViewById(R.id.result)

        sumButton.setOnClickListener {
            val firstNumber = firstNumberField.text.toString().toDouble()
            val secondNumber = secondNumberField.text.toString().toDouble()
            val sum = firstNumber + secondNumber
            result.text = "= $sum"
        }

        subtractButton.setOnClickListener {
            val firstNumber = firstNumberField.text.toString().toDouble()
            val secondNumber = secondNumberField.text.toString().toDouble()
            val subtraction = firstNumber - secondNumber
            result.text = "= $subtraction"
        }

        multiplyButton.setOnClickListener {
            val firstNumber = firstNumberField.text.toString().toDouble()
            val secondNumber = secondNumberField.text.toString().toDouble()
            val product = firstNumber * secondNumber
            result.text = "= $product"
        }

        divideButton.setOnClickListener {
            val firstNumber = firstNumberField.text.toString().toDouble()
            val secondNumber = secondNumberField.text.toString().toDouble()
            val division = firstNumber / secondNumber
            result.text = "= $division"
        }

    }
}