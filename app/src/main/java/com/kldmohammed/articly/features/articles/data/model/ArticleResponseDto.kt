package com.kldmohammed.articly.features.articles.data.model


import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Keep
@Parcelize
data class ArticleResponseDto(
    @SerializedName("articles")
    @Expose
    val articles: List<Article?>?,
    @SerializedName("status")
    @Expose
    val status: String?,
    @SerializedName("totalResults")
    @Expose
    val totalResults: Int? = 277
) : Parcelable {
    @Keep
    @Parcelize
    data class Article(
        @SerializedName("author")
        @Expose
        val author: String? = "",
        @SerializedName("content")
        @Expose
        val content: String?,
        @SerializedName("description")
        @Expose
        val description: String?,
        @SerializedName("publishedAt")
        @Expose
        val publishedAt: String? = "2021-11-19T15:08:00Z",
        @SerializedName("source")
        @Expose
        val source: Source? = Source(),
        @SerializedName("title")
        @Expose
        val title: String? = "#AndroidDevSummit ‘21: 3 things to know for Modern Android Development",
        @SerializedName("url")
        @Expose
        val url: String? = "https://android-developers.googleblog.com/2021/11/ads21-modern-android-development.html",
        @SerializedName("urlToImage")
        @Expose
        val urlToImage: String? = ""
    ) : Parcelable {
        @Keep
        @Parcelize
        data class Source(
            @SerializedName("id")
            @Expose
            val id: String? = "",
            @SerializedName("name")
            @Expose
            val name: String? = "Googleblog.com"
        ) : Parcelable
    }
}