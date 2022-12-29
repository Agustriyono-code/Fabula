package com.sai.fabula.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.sai.fabula.database.model.Article
import com.sai.fabula.databinding.ItemArticleBinding
import com.sai.fabula.ui.viewholder.ArticleViewHolder
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject

//TODO 7:Class Adapter
class NewsAdapter : ListAdapter<Article, ArticleViewHolder>(DIFF_CALLBACK) {

    private val clickSubject: PublishSubject<String> = PublishSubject.create()

    private val articleList = mutableListOf<Article>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder = createArticleViewHolder(parent)

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) = holder.bind(articleList[position])

    override fun getItemCount() = articleList.size

    //untuk mengambil list article
    fun setArticles(articles: List<Article>) {
        this.articleList.clear()
        this.articleList.addAll(articles)
        notifyDataSetChanged()
    }

    fun getClickObservable() = clickSubject as Observable<String>

    //perintah selanjut nya selha objeck di klik
    private fun createArticleViewHolder(parent: ViewGroup): ArticleViewHolder =
        ArticleViewHolder(
            ItemArticleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            clickSubject
        )

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean =
                oldItem == newItem
        }
    }
}
