package com.harivansh.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.harivansh.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var firstNum = 0.0
    private var secondNum = 0.0
    private var op = 0.toChar()
    private var result = 0.0


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // Number Buttons
        binding.num1.setOnClickListener {
            var operand: String = binding.num1.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num2.setOnClickListener {
            var operand: String = binding.num2.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num3.setOnClickListener {
            var operand: String = binding.num3.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num4.setOnClickListener {
            var operand: String = binding.num4.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num5.setOnClickListener {
            var operand: String = binding.num5.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num6.setOnClickListener {
            var operand: String = binding.num6.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num7.setOnClickListener {
            var operand: String = binding.num7.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num8.setOnClickListener {
            var operand: String = binding.num8.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num9.setOnClickListener {
            var operand: String = binding.num9.getText().toString().trim()
            handleClickNumber(operand)
        }

        binding.num0.setOnClickListener {
            var operand: String = binding.num0.getText().toString().trim()
            handleClickNumber(operand)
        }


        // Operator Buttons
        binding.add.setOnClickListener {

            handleClickOperator('+')

        }

        binding.minus.setOnClickListener {
            handleClickOperator('-')
        }

        binding.mul.setOnClickListener {
            handleClickOperator('*')
        }

        binding.div.setOnClickListener {
            handleClickOperator('/')
        }


        // Clear Button

        binding.clear.setOnClickListener {
//            var r: String = binding.calscreen.getText().toString()
//            r = r.substring(0, r.length - 1)
//            binding.calscreen.setText(r)

            firstNum = 0.0;
            secondNum = 0.0;
            result = 0.0;
            binding.calscreen.setText("");
        }



        // Equal Button


        binding.equal.setOnClickListener {
            handleClickEqual()
        }





    }


    // Displaying the number on the label on every click
    private fun handleClickNumber(operand : String) {

        val r: String = binding.calscreen.getText().toString()
        binding.calscreen.setText(r + operand)
    }


    // Save the firstNum and operator
    private fun handleClickOperator(c: Char) {
        val num: String = binding.calscreen.getText().toString()
        if (num != "") {
            firstNum = num.toDouble()
        }
        op = c
        binding.calscreen.setText("")
    }


    // Save the Second number and calulate the result
    private fun handleClickEqual() {
        val num: String = binding.calscreen.getText().toString()
        secondNum = num.toDouble()
        when (op) {
            '+' -> result = firstNum + secondNum
            '-' -> result = firstNum - secondNum
            '*' -> result = firstNum * secondNum
            '/' -> result = firstNum / secondNum
            '%' -> result = firstNum % secondNum
            else -> {

            }
        }
        binding.calscreen.setText(result.toString() + "")
    }


}