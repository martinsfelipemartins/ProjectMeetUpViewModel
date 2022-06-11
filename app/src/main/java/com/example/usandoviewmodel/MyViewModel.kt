package com.example.usandoviewmodel

import android.util.Log
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

    override fun onCleared() {
        super.onCleared()
        Log.i("Estou no ", "onCleared-ViewModel")
    }
}