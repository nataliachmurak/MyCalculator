package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView//import android.support.v7.app.ActionBarActivity;


class MainActivity : AppCompatActivity() {



    internal var edit: EditText? = null

    internal var valueOne: Float = 0.toFloat()
    internal var valueTwo: Float = 0.toFloat()

    internal var addition: Boolean = false
    internal var substraction: Boolean = false
    internal var multiplication: Boolean = false
    internal var division: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button0 = findViewById<View>(R.id.button0) as Button
        var button1 = findViewById<View>(R.id.button1) as Button
        var button2 = findViewById<View>(R.id.button2) as Button
        var button3 = findViewById<View>(R.id.button3) as Button
        var button4 = findViewById<View>(R.id.button4) as Button
        var button5 = findViewById<View>(R.id.button5) as Button
        var button6 = findViewById<View>(R.id.button6) as Button
        var button7 = findViewById<View>(R.id.button7) as Button
        var button8 = findViewById<View>(R.id.button8) as Button
        var button9 = findViewById<View>(R.id.button9) as Button
        var buttonDot = findViewById<View>(R.id.buttonDot) as Button
        var buttonAdd = findViewById<View>(R.id.buttonAdd) as Button
        var buttonSubstract = findViewById<View>(R.id.buttonSubstract) as Button
        var buttonMultiply = findViewById<View>(R.id.buttonMultiply) as Button
        var buttonDivide = findViewById<View>(R.id.buttonDivide) as Button
        // buttonModulo = (Button) findViewById(R.id.buttonModulo);
        var buttonC = findViewById<View>(R.id.buttonC) as Button
        var buttonEqual = findViewById<View>(R.id.buttonEqual) as Button
        edit = findViewById<View>(R.id.edit) as EditText




        button1.setOnClickListener { edit!!.setText(edit!!.text.toString() + "1") }

        button2.setOnClickListener { edit!!.setText(edit!!.text.toString() + "2") }

        button3.setOnClickListener { edit!!.setText(edit!!.text.toString() + "3") }

        button4.setOnClickListener { edit!!.setText(edit!!.text.toString() + "4") }

        button5.setOnClickListener { edit!!.setText(edit!!.text.toString() + "5") }

        button6.setOnClickListener { edit!!.setText(edit!!.text.toString() + "6") }

        button7.setOnClickListener { edit!!.setText(edit!!.text.toString() + "7") }

        button8.setOnClickListener { edit!!.setText(edit!!.text.toString() + "8") }

        button9.setOnClickListener { edit!!.setText(edit!!.text.toString() + "9") }

        button0.setOnClickListener { edit!!.setText(edit!!.text.toString() + "0") }

        buttonAdd.setOnClickListener {
            if (edit == null) {
                edit!!.setText("")
            } else {
                valueOne = java.lang.Float.parseFloat(edit!!.text.toString() + "")
                addition = true
                edit!!.text = null
            }
        }

        buttonSubstract.setOnClickListener {
            valueOne = java.lang.Float.parseFloat(edit!!.text.toString() + "")
            substraction = true
            edit!!.text = null
        }

        buttonMultiply.setOnClickListener {
            valueOne = java.lang.Float.parseFloat(edit!!.text.toString() + "")
            multiplication = true
            edit!!.text = null
        }

        buttonDivide.setOnClickListener {
            valueOne = java.lang.Float.parseFloat(edit!!.text.toString() + "")
            division = true
            edit!!.text = null
        }

        buttonEqual.setOnClickListener {
            valueTwo = java.lang.Float.parseFloat(edit!!.text.toString() + "")


            if (addition == true) {
                edit!!.setText((valueOne + valueTwo).toString() + "")
                addition = false
            }

            if (substraction == true) {
                edit!!.setText((valueOne - valueTwo).toString() + "")
                substraction = false
            }

            if (multiplication == true) {
                edit!!.setText((valueOne * valueTwo).toString() + "")
                multiplication = false
            }

            if (division == true) {
                edit!!.setText((valueOne / valueTwo).toString() + "")
                division = false
            }
        }

        buttonC.setOnClickListener { edit!!.setText("") }

        buttonDot.setOnClickListener { edit!!.setText(edit!!.text.toString() + ".") }


    }


}
