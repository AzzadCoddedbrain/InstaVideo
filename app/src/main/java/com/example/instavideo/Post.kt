package com.example.instavideo

data class Post(
    val user: String,
    val caption: String,
    val images: List<String>,
    val videos: List<String>
)