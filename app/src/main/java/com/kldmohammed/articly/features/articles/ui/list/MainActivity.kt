package com.kldmohammed.articly.features.articles.ui.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kldmohammed.articly.features.articles.data.model.ArticleResponseDto
import com.kldmohammed.articly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var articleAdapter: ArticleAdapter
    private var articles: MutableList<ArticleResponseDto.Article> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        articleAdapter = ArticleAdapter(articles)

        with(binding.articleRecyclerView) {
            hasFixedSize()
            adapter = articleAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }

}