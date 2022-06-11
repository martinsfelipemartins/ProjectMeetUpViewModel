package com.example.usandoviewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        Log.i("Estou no ", "SecondViewModel - onCleared")
    }
}