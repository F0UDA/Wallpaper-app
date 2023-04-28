package com.mohsen.mvvm.recyclerView

import android.view.View
import com.mohsen.mvvm.model.domain.Data

interface WallInteractionListener {
    fun onClickItem(data : Data, view: View)
}