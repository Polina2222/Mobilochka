package com.example.sixlab.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.sixlab.NodeApplication
import com.example.sixlab.databinding.ActivityMainBinding
import com.example.sixlab.viewmodels.NodeViewModel
import com.example.sixlab.viewmodels.NodeFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = ViewModelProviders.of(
            this,
            NodeFactory((application as NodeApplication).repository)
        )[NodeViewModel::class.java]
    }
}