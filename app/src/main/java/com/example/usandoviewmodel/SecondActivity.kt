package com.example.usandoviewmodel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider

class SecondActivity : AppCompatActivity() {

    private lateinit var viewModel: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Estou no ", "SecondActivity - onCreate")

        setContentView(R.layout.activity_second)
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.i("Estou no ", "SecondActivity - onCreateView")
        return super.onCreateView(name, context, attrs)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Estou no ", "SecondActivity - onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Estou no ", "SecondActivity - onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Estou no ", "SecondActivity - onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Estou no ", "SecondActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Estou no ", "SecondActivity - onDestroy")
    }

    override fun finish() {
        super.finish()
        Log.i("Estou no ", "SecondActivity - finish")
    }
}