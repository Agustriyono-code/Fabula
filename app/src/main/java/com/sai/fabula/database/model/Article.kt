package com.sai.fabula.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sai.fabula.database.model.Article.Companion.TABLE_NAME

//class entitass
//sebagaitabel untuk database
@Entity(tableName = TABLE_NAME)
data class Article(

    //isi kolom dari tabel
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var author: String? = null,
    var source: String? = null,
    var url: String? = null,
    var imageUrl: String? = null
) {
    companion object {
        //nama tabel yang bersangkutan
        const val TABLE_NAME = "fabula_articles"
    }
}
