package com.example.usandoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMyData()
        somaFromView()
    }

    private fun somaFromView() {
        btnSomaView.setOnClickListener {
            number ++
            updateMyData()
        }
    }

    private fun showMyData() {
        receivedMessageView.text = number.toString()
    }

    private fun updateMyData() {
        receivedMessageView.text = number.toString()
    }
}