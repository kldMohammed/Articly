package com.kldmohammed.articly.features.articles.data.sources.impl

import com.kldmohammed.articly.common.data.ApiService
import com.kldmohammed.articly.common.util.UiState
import com.kldmohammed.articly.common.util.asUiState
import com.kldmohammed.articly.features.articles.data.model.ArticleResponseDto
import com.kldmohammed.articly.features.articles.data.sources.ArticlesRemoteDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class ArticlesRemoteDataSource(private val apiService: ApiService) : ArticlesRemoteDataSource {
    
    override suspend fun getEverything(): UiState<ArticleResponseDto> {
        return apiService.everything().asUiState()
    }
}