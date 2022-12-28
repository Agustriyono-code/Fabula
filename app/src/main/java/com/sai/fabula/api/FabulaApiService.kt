package com.sai.fabula.api

import com.sai.fabula.utils.ArticlesResponse
import retrofit2.http.GET

//untuk mengambil berita atau datadari news api
interface FabulaApiService {

    //mendapatkan data dari news api
    @GET("top-headlines?country=us&apiKey=bc3c5392175a47509e3de5c96024e920")
    suspend fun getNewsArticles(): ArticlesResponse

    //url yang digunkan sebagia rujukan data
    //dari news api
    companion object {
        const val NEWS_API_URL = "https://newsapi.org/v2/"
    }
}
