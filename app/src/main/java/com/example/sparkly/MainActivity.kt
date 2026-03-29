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


        //Declarations
        private lateinit var etTimeInput: EditText
        private lateinit var btnGetSpark: Button
        private lateinit var btnReset: Button
        private lateinit var tvResultDisplay: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // 2. Initializing (Matchy matching my XML IDs)
            etTimeInput = findViewById(R.id.etTimeInput)
            btnGetSpark = findViewById(R.id.btnGetSpark)
            btnReset = findViewById(R.id.btnReset)
            tvResultDisplay = findViewById(R.id.tvResultDisplay)

            // 3. Sparky Button Logic
            btnGetSpark.setOnClickListener {
                val userEntry = etTimeInput.text.toString().lowercase().trim()

                if (userEntry == "morning") {
                    tvResultDisplay.text = "Send a 'Good morning' text to a family member. ☀️"
                } else if (userEntry == "mid-morning") {
                    tvResultDisplay.text = "Reach out to a Oom Piet with a quick 'Take your pills.' ✨"
                } else if (userEntry == "afternoon") {
                    tvResultDisplay.text = "Share tiktok for streak with a friend. 🍦"
                } else if (userEntry == "afternoon snack time") {
                    tvResultDisplay.text = "Send a quick 'thinking of you' message. 🍩"
                } else if (userEntry == "dinner") {
                    tvResultDisplay.text = "Call a friend or relative for a 5-minute catch-up. 📞"
                } else if (userEntry == "night" || userEntry == "after dinner") {
                    tvResultDisplay.text = "Leave a quote or bible verse on insta story. 🌙"
                } else {
                    tvResultDisplay.text = "Please enter a valid time of day! ✨"
                }
            }

            // 4. Reset Button Logic
            btnReset.setOnClickListener {
                etTimeInput.text.clear()
                tvResultDisplay.text = ""
            }
        }
    }

