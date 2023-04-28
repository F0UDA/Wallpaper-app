package com.mohsen.mvvm.recyclerView

import android.view.View
import com.mohsen.mvvm.databinding.ItemViewpagerBinding
import com.mohsen.mvvm.model.domain.Data

interface ViewPagerInterface{
    fun positionItem(data:Data, position:Int)
    fun onClickCategory(data : Data, view: View,binding: ItemViewpagerBinding)
}