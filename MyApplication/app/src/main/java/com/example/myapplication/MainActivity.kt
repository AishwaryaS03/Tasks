package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.VisibleActivityCallback
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etName)
        val submitButton = findViewById<Button>(R.id.submit)
        val offersButton = findViewById<Button>(R.id.btnOffers)
        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()

            if (enteredName == "") {
                offersButton.visibility = INVISIBLE
                greetingTextView.text = " "
                Toast.makeText(
                    this@MainActivity,
                    "Please Enter your name",
                    Toast.LENGTH_SHORT
                ).show()


            } else {
                val message = "Hi $enteredName "
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility = VISIBLE

            }
        }
        offersButton.setOnClickListener{
            val intent = Intent(this,SEcondActivity::class.java)
            startActivity(intent)
        }


    }
}