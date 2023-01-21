package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.databinding.ItemBestPostBinding
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.databinding.ItemRecommendClubBinding
import com.example.mt_danny_club_android.main.data.BestPostData
import com.example.mt_danny_club_android.main.data.IssueClubData
import com.example.mt_danny_club_android.main.data.RecommendClubData

class RecommendClubAdapter : ListAdapter<RecommendClubData,RecommendClubAdapter.RecommendClubViewHolder>(RecommendClubDataDiffUtilCallback){

    inner class RecommendClubViewHolder(private val binding : ItemRecommendClubBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : RecommendClubData ){

            binding.clubName.text = data.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendClubViewHolder {
        return RecommendClubViewHolder(
            ItemRecommendClubBinding.inflate( LayoutInflater.from(parent.context), parent,false )

        )
    }

    override fun onBindViewHolder(holder: RecommendClubViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }


}