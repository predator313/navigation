package com.example.navigationinandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.navigationinandroid.R
import com.example.navigationinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    supportFragmentManager.findFragmentById(R.id.news_nav_host_fragment)

    }
}