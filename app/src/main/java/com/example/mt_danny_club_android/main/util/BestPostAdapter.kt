package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mt_danny_club_android.databinding.ItemBestPostBinding
import com.example.mt_danny_club_android.databinding.ItemIssueClubBinding
import com.example.mt_danny_club_android.main.data.BestPostData
import com.example.mt_danny_club_android.main.data.IssueClubData

class BestPostAdapter : ListAdapter<BestPostData,BestPostAdapter.BestPostViewHolder>(BestPostDataDiffUtilCallback){

    inner class BestPostViewHolder(private val binding : ItemBestPostBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : BestPostData ){

            binding.titleTxt.text = data.title
            binding.commentNumberTxt.text = "[" + data.commentNumber.toString() + "]"
            binding.extraContextTxt.text = data.writter + "   조회수 " + data.viewNumber.toString()




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestPostViewHolder {
        return BestPostViewHolder(
            ItemBestPostBinding.inflate( LayoutInflater.from(parent.context), parent,false )

        )
    }

    override fun onBindViewHolder(holder: BestPostViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }


}