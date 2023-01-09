package com.example.relatielayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relativelayout)
        val inputField = findViewById<EditText>(R.id.fname)
        val enteredName = inputField.text.toString()
        val signInButton = findViewById<Button>(R.id.signin)
        val signUpButton = findViewById<Button>(R.id.signup)
        signInButton.setOnClickListener{
         var intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener{
            var intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}