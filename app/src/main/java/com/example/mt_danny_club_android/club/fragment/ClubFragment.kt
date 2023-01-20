package com.example.mt_danny_club_android.club.fragment


import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.club.data.PostData
import com.example.mt_danny_club_android.club.util.PostAdapter
import com.example.mt_danny_club_android.databinding.FragmentClubBinding
import com.example.mt_danny_club_android.main.data.BestPostData
import com.example.mt_danny_club_android.main.data.IssueClubData

class ClubFragment : BaseFragment<FragmentClubBinding>(R.layout.fragment_club)  {

    private val postAdapter : PostAdapter by lazy { PostAdapter() }

    private val postDataSet = arrayListOf<PostData>().apply {
        add(PostData(1,"두카미가 최고다 ㅇㅈ?",3,"과라오오오",51,5,"12:12"))
        add(PostData(2,"바인드 15일자 논란",234,"파라오오오",1413,1345,"12:12"))
        add(PostData(3,"두카미가 최고다 ㅇㅈ?",3,"CHG",5,12,"12:12"))
        add(PostData(4,"아이고",3,"HIHIHIHI",51,5,"12:12"))
        add(PostData(5,"아이유 예쁘다",3,"닉네임임임",51,5,"12:12"))
        add(PostData(6,"이게 무저ㅣㅈ",3,"닉네이넥이멘ㄴ",51,5,"12:12"))
        add(PostData(7,"뭐 적지",3,"과라오오오",51,5,"12:12"))
        add(PostData(8,"채우기 귀찮다",3,"과라오오오",51,5,"12:12"))
        add(PostData(9,"하훙=ㅎ이ㅏㄴㄹ",3,"과라오오오",51,5,"12:12"))
        add(PostData(10,"가나다라마바사아자",3,"과라오오오",51,5,"12:12"))
        add(PostData(11,"Hello World!",3,"과라오오오",51,5,"12:12"))
    }

    override fun start() {
        binding.postRecyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            adapter = postAdapter
        }
        postAdapter.submitList(postDataSet)
    }
}