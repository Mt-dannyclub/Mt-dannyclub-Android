package com.example.mt_danny_club_android.signup.fragment

import android.graphics.Paint
import com.example.mt_danny_club_android.R
import com.example.mt_danny_club_android.base.BaseFragment
import com.example.mt_danny_club_android.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding>(R.layout.fragment_sign_up)  {

    override fun start() {
        binding.tvLogin.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        binding.tvLogin.setOnClickListener{
            // login_fragment 로 이동
        }
    }
}