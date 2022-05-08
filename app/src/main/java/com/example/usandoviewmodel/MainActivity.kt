package com.example.usandoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int=0
    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
       // showMyData()
        soma()
        showMyDataFromViewModel()
    }

    private fun soma() {
        btnSoma.setOnClickListener {
            //number += 1
          //  updateMyData()
            updateMyDataFromViewModel()
        }
    }

    private fun showMyData(){
         receivedMessage.text = number.toString()
    }

    private fun updateMyData(){
         receivedMessage.text = number.toString()
    }

    //________________Pegando da viewModel____________

    private fun updateMyDataFromViewModel(){
        val myValorUpdated = viewModel.updateSoma().toString()
        receivedMessage.text = myValorUpdated
    }

    private fun showMyDataFromViewModel(){
        val myInitialValor = viewModel.initialValor().toString()
        receivedMessage.text = myInitialValor
    }

}