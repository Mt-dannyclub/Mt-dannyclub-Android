package com.example.mt_danny_club_android.main.util

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mt_danny_club_android.R
//import com.example.mt_danny_club_android.base.BaseRecyclerViewAdapter
import com.example.mt_danny_club_android.base.BaseRecyclerviewAdapter
//import com.example.mt_danny_club_android.base.BaseViewHolder
import com.example.mt_danny_club_android.databinding.ItemBestPostBinding
import com.example.mt_danny_club_android.main.data.BestPostData

//class BestPostAdapter : ListAdapter<BestPostData,BestPostAdapter.BestPostViewHolder>(BestPostDataDiffUtilCallback){
//
//    inner class BestPostViewHolder(private val binding : ItemBestPostBinding) : RecyclerView.ViewHolder(binding.root){
//        fun bind(data : BestPostData ){
//
//            binding.titleTxt.text = data.title
//            binding.commentNumberTxt.text = "[" + data.commentNumber.toString() + "]"
//            binding.extraContextTxt.text = data.writter + "   조회수 " + data.viewNumber.toString()
//
//
//
//
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestPostViewHolder {
//        return BestPostViewHolder(
//            ItemBestPostBinding.inflate( LayoutInflater.from(parent.context), parent,false )
//
//        )
//    }
//
//    override fun onBindViewHolder(holder: BestPostViewHolder, position: Int) {
//        return holder.bind(getItem(position))
//    }
//
//
//}


class BestPostAdapter : BaseRecyclerviewAdapter<BestPostData,ItemBestPostBinding>(R.layout.item_best_post){
    override fun action(data: BestPostData, binding: ItemBestPostBinding) {
        binding.titleTxt.text = data.title
        binding.commentNumberTxt.text = "[${data.commentNumber}]"
        binding.extraContextTxt.text = data.writter + "   조회수 " + data.viewNumber.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(ItemBestPostBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
}