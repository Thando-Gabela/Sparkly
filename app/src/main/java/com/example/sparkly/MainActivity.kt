package com.example.sparkly

import android.adservices.ondevicepersonalization.ExecuteInput
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //declarations

    private lateinit var etTimeInput: EditText
    private lateinit var btnGetSpark: Button
    private lateinit var btnReset: Button
    private lateinit var tvresultDisplay: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etTimeInput=findViewById(R.id.etTimeInput)
        btnGetSpark=findViewById(R.id.btnGetSpark)
        btnReset=findViewById(R.id.btnReset)
        tvresultDisplay=findViewById(R.id.tvResultDisplay)







           }



       }



