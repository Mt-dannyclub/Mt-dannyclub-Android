package com.example.mt_danny_club_android.main.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.databinding.FragmentMainBinding
import com.example.mt_danny_club_android.main.data.IssueClubData
import com.example.mt_danny_club_android.main.util.IssueClubAdapter

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main)  {

    private val issueClubAdapter : IssueClubAdapter by lazy{ IssueClubAdapter() }
    private val issueClubDataSet = arrayListOf<IssueClubData>().apply {
        add(IssueClubData(1,"두카미 동호회","dummy","두카미 짱짱맨",129))
        add(IssueClubData(2,"바인드 동호회","dummy","두카미 짱짱맨",8))
        add(IssueClubData(3,"CNS 동호회","dummy","두카미 짱짱맨",14))
        add(IssueClubData(4,"ALT 동호회","dummy","두카미 짱짱맨",1291))
        add(IssueClubData(5,"3D 동호회","dummy","두카미 짱짱맨",19))
        add(IssueClubData(6,"오늘하루 동호회","dummy","두카미 짱짱맨",29))
        add(IssueClubData(7,"모디 동호회","dummy","두카미 짱짱맨",58))
    }

    override fun start() {

        binding.issueClubRecyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
            adapter = issueClubAdapter
        }

        issueClubAdapter.submitList(issueClubDataSet)
    }

}