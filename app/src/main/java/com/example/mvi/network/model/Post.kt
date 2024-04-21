package com.example.mvi.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val postId: Int,
    val id: Int,
    val title: String,
    val body: String
)