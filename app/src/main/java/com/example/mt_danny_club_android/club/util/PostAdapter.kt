package com.example.mt_danny_club_android.club.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.club.data.PostData
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.databinding.ItemPostBinding
import com.example.mt_danny_club_android.main.data.IssueClubData

class PostAdapter : ListAdapter<PostData,PostAdapter.PostViewHolder>(PostDataDiffUtilCallback){

    inner class PostViewHolder(private val binding : ItemPostBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : PostData ){

            binding.titleTxt.text = data.title
            binding.commentNumberTxt.text = data.commentNumber.toString()
            binding.extraContextTxt.text = data.writer + "  조회 " + data.viewNumber + " | 추천 " + data.recommendNumber
            binding.dateTxt.text = data.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            ItemPostBinding.inflate( LayoutInflater.from(parent.context), parent,false )

        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }


}