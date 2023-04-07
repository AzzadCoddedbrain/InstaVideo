package com.example.instavideo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val context: Context, private val posts: List<Post>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]
        holder.bind(post)
    }

    override fun getItemCount(): Int {
        return posts.size
    }
//
//    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(post: Post) {
//            // bind post data to views in post_item layout
//        }
//    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imagesRecyclerView = itemView.findViewById<RecyclerView>(R.id.imagesRecyclerView)
        private val videosRecyclerView = itemView.findViewById<RecyclerView>(R.id.videosRecyclerView)

        fun bind(post: Post) {
            // bind post data to views in post_item layout

            val imagesAdapter = ImagesAdapter(post.images)
            imagesRecyclerView.adapter = imagesAdapter
            imagesRecyclerView.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)

            val videosAdapter = VideosAdapter(post.videos)
            videosRecyclerView.adapter = videosAdapter
            videosRecyclerView.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)

        }
    }
}
