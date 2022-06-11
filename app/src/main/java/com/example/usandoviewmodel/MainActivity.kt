package com.example.usandoviewmodel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 0
    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Estou no ", "onCreate")
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        showMyData()
        somaFromViewModel()
        somaFromView()
        showMyDataFromViewModel()
        goNextScreen()
    }

    private fun goNextScreen() {
        btnNextScreen.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
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

    //________________Pegando da viewModel____________

    private fun updateMyDataFromViewModel() {
        val myValorUpdated = viewModel.updateSoma().toString()
        receivedMessage.text = myValorUpdated
    }

    private fun showMyDataFromViewModel() {
        val myInitialValor = viewModel.initialValor().toString()
        receivedMessage.text = myInitialValor
    }

    private fun somaFromViewModel() {
        btnSoma.setOnClickListener {
            updateMyDataFromViewModel()
        }
    }

    //________________Estados da View____________

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

    override fun finish() {
        super.finish()
        Log.i("Estou no ", "SecondActivity - finish")
    }
}