package com.sai.fabula.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sai.fabula.database.NewsRepository
import com.sai.fabula.utils.ArticleListState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

//TODO 6:Class VIEW model
class MainViewModel(private val newsRepository: NewsRepository) : ViewModel() {

    private val _newsLiveData = MutableLiveData<ArticleListState>()

    val newsLiveData: LiveData<ArticleListState>
        get() = _newsLiveData

    //mendapatkan data article dengan menampilkan
    //secara caroutine dengan repository
    fun getNews() {
        viewModelScope.launch {
            newsRepository.getNews().collect {
                _newsLiveData.value = it
            }
        }
    }
}
