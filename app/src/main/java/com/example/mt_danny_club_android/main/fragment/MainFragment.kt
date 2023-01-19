package com.example.mt_danny_club_android.main.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.databinding.FragmentMainBinding
import com.example.mt_danny_club_android.main.data.BestPostData
import com.example.mt_danny_club_android.main.data.IssueClubData
import com.example.mt_danny_club_android.main.data.RecommendClubData
import com.example.mt_danny_club_android.main.util.BestPostAdapter
import com.example.mt_danny_club_android.main.util.IssueClubAdapter
import com.example.mt_danny_club_android.main.util.RecommendClubAdapter

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main)  {

    private val issueClubAdapter : IssueClubAdapter by lazy{ IssueClubAdapter() }
    private val bestPostAdapter : BestPostAdapter by lazy{ BestPostAdapter() }
    private val recommendClubAdapter :  RecommendClubAdapter by lazy{ RecommendClubAdapter() }


    private val issueClubDataSet = arrayListOf<IssueClubData>().apply {
        add(IssueClubData(1,"두카미 동호회","dummy","두카미 짱짱맨",129))
        add(IssueClubData(2,"바인드 동호회","dummy","두카미 짱짱맨",8))
        add(IssueClubData(3,"CNS 동호회","dummy","두카미 짱짱맨",14))
        add(IssueClubData(4,"ALT 동호회","dummy","두카미 짱짱맨",1291))
        add(IssueClubData(5,"3D 동호회","dummy","두카미 짱짱맨",19))
        add(IssueClubData(6,"오늘하루 동호회","dummy","두카미 짱짱맨",29))
        add(IssueClubData(7,"모디 동호회","dummy","두카미 짱짱맨",58))
    }

    private val bestPostDataSet = arrayListOf<BestPostData>().apply {
        add(BestPostData(1,"두카미가 최고다 ㅇㅈ?","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(2,"바인드 15일자 논란","dummy",98,"ㄱㅇㄹ",620))
        add(BestPostData(3,"두카미가 최고다 ㅇㅈ?","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(4,"아이고","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(5,"아이유 예쁘다","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(6,"이게 무저ㅣㅈ","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(7,"뭐 적지","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(8,"채우기 귀찮다","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(9,"하훙=ㅎ이ㅏㄴㄹ","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(10,"가나다라마바사아자","dummy",12,"ㄱㅇㄹ",100))
        add(BestPostData(11,"Hello World!","dummy",12,"ㄱㅇㄹ",100))


    }

    private val recommendClubDataSet = arrayListOf<RecommendClubData>().apply {
        add(RecommendClubData(1,"두카미"))
        add(RecommendClubData(2,"바인드"))
        add(RecommendClubData(3,"1-1"))
        add(RecommendClubData(4,"인공지능"))
        add(RecommendClubData(5,"CNS"))
        add(RecommendClubData(6,"ALT"))
        add(RecommendClubData(7,"겁나게 긴 무언가"))

    }

    override fun start() {

        binding.issueClubRecyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
            adapter = issueClubAdapter
        }
        binding.bestPostRecyclerview.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = bestPostAdapter
        }
        binding.recommendRecyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
            adapter = recommendClubAdapter
        }

        issueClubAdapter.submitList(issueClubDataSet)
        bestPostAdapter.submitList(bestPostDataSet)
        recommendClubAdapter.submitList(recommendClubDataSet)
    }

}