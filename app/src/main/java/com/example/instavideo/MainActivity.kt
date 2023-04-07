package com.example.instavideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        var posts = ArrayList<Post>()


        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))
        posts.add(Post("Vijay","My Data", listOf("images url","url"), listOf("video","url","url","url","url","url","url")))



        recyclerView.adapter = PostAdapter(this,posts)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}