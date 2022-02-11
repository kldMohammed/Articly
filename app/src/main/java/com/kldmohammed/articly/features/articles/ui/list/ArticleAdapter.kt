package com.kldmohammed.articly.features.articles.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.kldmohammed.articly.R
import com.kldmohammed.articly.common.util.formatToDate
import com.kldmohammed.articly.common.util.formatToTime
import com.kldmohammed.articly.features.articles.data.model.ArticleResponseDto

class ArticleAdapter(private val articles: MutableList<ArticleResponseDto.Article>) :
    RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.article_list_item, parent, false)
        )
    }

    override fun getItemCount() = articles.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(articles[position])


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: ArticleResponseDto.Article) = with(itemView) {
            with(itemView) {
                val image: ImageView = findViewById(R.id.articlesImage)
                val title: TextView = findViewById(R.id.articleTitleTxt)
                val date: TextView = findViewById(R.id.dateTxt)
                val time: TextView = findViewById(R.id.timeTxt)

                image.load(item.urlToImage)
                title.text = item.title
                date.text = item.publishedAt?.formatToDate()
                time.text = item.publishedAt?.formatToTime()

            }

        }
    }
}