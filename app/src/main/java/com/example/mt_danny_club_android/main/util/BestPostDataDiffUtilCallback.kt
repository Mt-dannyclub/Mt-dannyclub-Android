package com.example.mt_danny_club_android.main.util

import androidx.recyclerview.widget.DiffUtil
import com.example.mt_danny_club_android.main.data.BestPostData

object BestPostDataDiffUtilCallback : DiffUtil.ItemCallback<BestPostData>() {

    override fun areItemsTheSame(oldItem: BestPostData, newItem: BestPostData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BestPostData, newItem: BestPostData): Boolean {
        return oldItem == newItem
    }

}