package com.example.translator_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.translator_app.R

class TranslateActivity : AppCompatActivity() {

    private lateinit var viewModel: TranslateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        viewModel = ViewModelProvider(this).get(TranslateViewModel::class.java)
    }
}