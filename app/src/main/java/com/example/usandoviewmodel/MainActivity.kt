package com.example.usandoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 0
    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        showMyData()
        somaFromViewModel()
        somaFromView()
        showMyDataFromViewModel()
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
}