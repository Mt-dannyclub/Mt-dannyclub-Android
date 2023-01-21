package com.example.mt_danny_club_android.start.fragment

import androidx.navigation.fragment.findNavController
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.databinding.FragmentStartBinding

class StartFragment : BaseFragment<FragmentStartBinding>(R.layout.fragment_start)  {

    override fun start() {
        binding.mainBtn.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_mainFragment)
        }
    }
}