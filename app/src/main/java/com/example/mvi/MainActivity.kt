package com.example.mvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import org.orbitmvi.orbit.compose.collectAsState
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ativity_main)

        val viewModel by viewModels<PostsViewModel>()
//        val state by viewModel.collectAsState()
    }
}