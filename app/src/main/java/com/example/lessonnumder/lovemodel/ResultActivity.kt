package com.example.lessonnumder.lovemodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessonnumder.R
import com.example.lessonnumder.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var result = intent.getSerializableExtra("data") as LoveModel

        binding.tvResult.text = result.toString()
    }
}