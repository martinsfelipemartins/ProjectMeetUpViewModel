package com.example.usandoviewmodel

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
   private var number = 0

    fun initialValor(): Int {

        return number
    }

    fun updateSoma(): Int{

        number++
        return number
    }
}