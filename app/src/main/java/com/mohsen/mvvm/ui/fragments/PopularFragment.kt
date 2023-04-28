package com.mohsen.mvvm.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.mohsen.mvvm.recyclerView.RecyclerViewAdapter
import com.mohsen.mvvm.ui.fragments.base.BaseFragment
import com.mohsen.mvvm.viewModels.PopularViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class PopularFragment : BaseFragment ()  {
    private val viewModel: PopularViewModel by viewModels()
    override var recyclerViewAdapter: RecyclerViewAdapter = RecyclerViewAdapter(this)

    override fun initViewModel() {
        lifecycleScope.launch  {
            viewModel.popularPage.collectLatest {
                recyclerViewAdapter.submitData(it)
            }
        }

    }



}