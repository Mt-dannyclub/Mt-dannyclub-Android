package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseRecyclerviewAdapter
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.main.data.IssueClubData

class IssueClubAdapter : BaseRecyclerviewAdapter<IssueClubData,ItemIssueClubBinding>(R.layout.item_issue_club){
    override fun action(data: IssueClubData, binding: ItemIssueClubBinding) {
        binding.contextTxt.text = data.context
        binding.titleTxt.text = data.title
        binding.peopleNumberTxt.text = data.personNumber.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(ItemIssueClubBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

}

