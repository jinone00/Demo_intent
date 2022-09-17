package com.example.demo_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.mainBtn?.setOnClickListener{

            val intent = Intent(this, MainActivity2::class.java )
            startActivity((intent))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}