package com.example.mt_danny_club_android.main.util

import androidx.recyclerview.widget.DiffUtil
import com.example.mt_danny_club_android.main.data.IssueClubData
import com.example.mt_danny_club_android.main.data.RecommendClubData

object RecommendClubDataDiffUtilCallback : DiffUtil.ItemCallback<RecommendClubData>() {

    override fun areItemsTheSame(oldItem: RecommendClubData, newItem: RecommendClubData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: RecommendClubData, newItem: RecommendClubData): Boolean {
        return oldItem == newItem
    }

}