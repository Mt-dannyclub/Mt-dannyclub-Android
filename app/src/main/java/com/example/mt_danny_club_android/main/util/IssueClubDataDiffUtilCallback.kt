package com.example.mt_danny_club_android.main.util

import androidx.recyclerview.widget.DiffUtil
import com.example.mt_danny_club_android.main.data.IssueClubData

object IssueClubDataDiffUtilCallback : DiffUtil.ItemCallback<IssueClubData>() {

    override fun areItemsTheSame(oldItem: IssueClubData, newItem: IssueClubData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: IssueClubData, newItem: IssueClubData): Boolean {
        return oldItem == newItem
    }

}