package com.example.mt_danny_club_android.club.util

import androidx.recyclerview.widget.DiffUtil
import com.example.mt_danny_club_android.club.data.PostData
import com.example.mt_danny_club_android.main.data.IssueClubData

object PostDataDiffUtilCallback : DiffUtil.ItemCallback<PostData>() {

    override fun areItemsTheSame(oldItem: PostData, newItem: PostData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: PostData, newItem: PostData): Boolean {
        return oldItem == newItem
    }

}