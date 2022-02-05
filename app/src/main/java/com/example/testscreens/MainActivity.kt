package com.example.testscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fragment part of signup
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragment_container, loginFragment)
//        transaction.commit()
    }
}