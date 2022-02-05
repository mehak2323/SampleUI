package com.example.testscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignInActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //fragment part of signup
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, loginFragment)
        transaction.commit()

    }

    /* Function called after button on click*/
    fun afterSignIn(view: View) {

        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }
}