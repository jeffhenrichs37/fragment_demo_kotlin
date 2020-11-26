package com.example.kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Create an instance of the two fragments
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        //2. Create a Fragment trasaction - this is so we can replace our fragments
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, firstFragment)
            commit() //To apply the changes
        }

        btnFragment1.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, firstFragment)
                commit()
            }
        }

        btnFragment2.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, secondFragment)
                commit()
            }
        }
    }


}