package com.sai.fabula.api.model

import com.squareup.moshi.Json

//TODO 2: class data web api
//mengimport data dari url info
//dengan mengubah json response menjadi class  melalalui pojo
//dengan generate name newsResult
data class NewsResult(
    @field:Json(name = "status") var status: String? = null,
    @field:Json(name = "totalResults") var totalResults: Int? = null,
    @field:Json(name = "articles") var articles: List<Article>? = null
)
