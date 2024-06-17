package com.ssj.databinding_simplified

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ssj.databinding_simplified.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DataClass1("Hello World")

    }

}