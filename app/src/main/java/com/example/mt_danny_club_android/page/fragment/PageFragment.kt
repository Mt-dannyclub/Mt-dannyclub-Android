package com.example.mt_danny_club_android.page.fragment

import androidx.navigation.fragment.navArgs
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.club.fragment.ClubFragmentArgs
import com.example.mt_danny_club_android.databinding.FragmentPageBinding

class PageFragment : BaseFragment<FragmentPageBinding>(R.layout.fragment_page)  {

    override fun start() {

        val args: PageFragmentArgs by navArgs()
        var pageId = args.pageId

    }
}