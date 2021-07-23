package com.example.kotlinhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kotlinhw1.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.god_button)
        var tv1: TextView = findViewById(R.id.first_class)
        var tv2: TextView = findViewById(R.id.second_class)

        var first = First()
        button.setOnClickListener {
            tv1.text = first.toString()
            tv2.text = Second.Companion.copyClass().toString()
            test()
            secondTest()
            thirdTest()
        }

    }

    private fun test() {
        val array = arrayListOf<String>()
        array.add("Happy")
        array.add("Smile")
        array.add("Word")
        array.add("Object")

        for (String in array) {
            print(array)
        }
    }

    private fun secondTest() {
        for (i in 1..10) {
            print("Hello homework")
        }
    }

    private fun thirdTest() {
        for (i in 10 downTo 1 step 2) {
            print("Hello homework")
        }
    }
}

