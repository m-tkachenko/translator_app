package com.example.translator_app.ui

import android.util.Log
import androidx.lifecycle.ViewModel

class TranslateViewModel : ViewModel() {
    init {
        Log.e("LOG", "VM created")
    }

    override fun onCleared() {
        Log.e("LOG", "VM cleared")
        super.onCleared()
    }
}