package com.example.usandoviewmodel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMyData()
        somaFromView()
        Log.i("Estou no ", "OnCreate")
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.i("Estou no ", "onCreateView")
        return super.onCreateView(name, context, attrs)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Estou no ", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Estou no ", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Estou no ", "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Estou no ", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Estou no ", "onDestroy")
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