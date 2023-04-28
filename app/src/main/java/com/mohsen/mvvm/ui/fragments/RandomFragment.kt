package com.mohsen.mvvm.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.mohsen.mvvm.recyclerView.RecyclerViewAdapter
import com.mohsen.mvvm.ui.fragments.base.BaseFragment
import com.mohsen.mvvm.viewModels.RandomViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class RandomFragment : BaseFragment() {


    private val viewModel: RandomViewModel by viewModels()
    override var recyclerViewAdapter: RecyclerViewAdapter = RecyclerViewAdapter(this)

    override fun initViewModel() {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.randomPage.collectLatest {
                recyclerViewAdapter.submitData(it)
            }
        }
    }
}