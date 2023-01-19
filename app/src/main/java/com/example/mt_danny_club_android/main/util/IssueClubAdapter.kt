package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.main.data.IssueClubData

class IssueClubAdapter : ListAdapter<IssueClubData,IssueClubAdapter.IssueClubViewHolder>(IssueClubDataDiffUtilCallback){

    inner class IssueClubViewHolder(private val binding : ItemIssueClubBinding ) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : IssueClubData ){

            binding.contextTxt.text = data.context
            binding.titleTxt.text = data.title
            binding.peopleNumberTxt.text = data.personNumber.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssueClubViewHolder {
        return IssueClubViewHolder(
            ItemIssueClubBinding.inflate( LayoutInflater.from(parent.context), parent,false )

        )
    }

    override fun onBindViewHolder(holder: IssueClubViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }


}