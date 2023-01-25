package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseRecyclerviewAdapter
import com.example.mt_danny_club_android.databinding.ItemBestPostBinding
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.databinding.ItemRecommendClubBinding
import com.example.mt_danny_club_android.main.data.BestPostData
import com.example.mt_danny_club_android.main.data.IssueClubData
import com.example.mt_danny_club_android.main.data.RecommendClubData

class RecommendClubAdapter : BaseRecyclerviewAdapter<RecommendClubData,ItemRecommendClubBinding>(R.layout.item_recommend_club){
    override fun action(data: RecommendClubData, binding: ItemRecommendClubBinding) {
        binding.clubName.text = data.title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(ItemRecommendClubBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

}