package com.example.mvi

import com.example.mvi.network.model.Post

data class PostState(
    val progressBar: Boolean = false,
    val posts: List<Post> = emptyList()
)