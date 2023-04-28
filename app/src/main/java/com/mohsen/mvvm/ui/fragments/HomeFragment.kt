package com.mohsen.mvvm.ui.fragments


import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.mohsen.mvvm.recyclerView.RecyclerViewAdapter
import com.mohsen.mvvm.ui.fragments.base.BaseFragment
import com.mohsen.mvvm.viewModels.HomeViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class HomeFragment : BaseFragment (
)  {

    private val viewModel: HomeViewModel by viewModels()

    override fun initViewModel() {
        lifecycleScope.launch {
            viewModel.homePage.collectLatest {
                recyclerViewAdapter.submitData(it)
            }
        }
    }


    override var recyclerViewAdapter: RecyclerViewAdapter = RecyclerViewAdapter(this)




}
