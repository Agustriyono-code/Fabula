package com.sai.fabula.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sai.fabula.database.model.Article
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

//akses data dari fabulanews dari database
@ExperimentalCoroutinesApi
@Dao
interface ArticlesDao {

    //query untuk tindakan dari database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(articles: List<Article>)

    @Query("DELETE FROM ${Article.TABLE_NAME}")
    suspend fun deleteAllPosts()

    @Query("SELECT * FROM ${Article.TABLE_NAME}")
    suspend fun getAllArticles(): List<Article>
}
