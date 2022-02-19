package com.kldmohammed.articly.features.articles.data.sources

import com.kldmohammed.articly.common.util.UiState
import com.kldmohammed.articly.features.articles.data.model.ArticleResponseDto

interface ArticlesRemoteDataSource {
    
    suspend fun getEverything(): UiState<ArticleResponseDto>
}