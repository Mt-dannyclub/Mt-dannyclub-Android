package com.example.mt_danny_club_android.login.fragment

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login)  {

    // data_binding 설정은 따로 안해도 되는건가?
    // 여기에 OnCreateView 에 들어갈 코드를 짜면 되는건가?
    override fun start() {
        binding.tvSignUp.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        binding.tvSignUp.setOnClickListener{
            // sign_up_fragment 로 이동
        }
    }
}