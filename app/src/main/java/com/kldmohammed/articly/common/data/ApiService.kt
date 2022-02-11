package com.kldmohammed.articly.common.data

import com.kldmohammed.articly.features.articles.data.model.ArticleResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("everything")
    fun everything(
        @Query("q") query: String = "Kotlin"
    ): Call<ArticleResponseDto>
}