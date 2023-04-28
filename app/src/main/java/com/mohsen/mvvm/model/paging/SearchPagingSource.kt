package com.mohsen.mvvm.model.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.mohsen.mvvm.model.domain.Data
 import com.mohsen.mvvm.model.networking.RetroService

class SearchPagingSource(private val apiService: RetroService, private val search:  String ) :
    PagingSource<Int, Data>() {
    override fun getRefreshKey(state: PagingState<Int, Data>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int,  Data> {
        return try {
            val nextPage = params.key ?: FIRST_PAGE_INDEX
            val responsePopular = apiService.searchFromApi(nextPage,search)
            LoadResult.Page(
                data = responsePopular.data,
                prevKey = null,
                nextKey = responsePopular.pagination?.next?.page,
            )


        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    companion object {
        private const val FIRST_PAGE_INDEX = 1
    }

}