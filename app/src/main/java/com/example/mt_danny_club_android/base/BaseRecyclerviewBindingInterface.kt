package com.example.mt_danny_club_android.base

import androidx.databinding.ViewDataBinding

interface BaseRecyclerviewBindingInterface<VDB : ViewDataBinding,T : Any> {

    fun bindData(binder : VDB,model : T)


}


