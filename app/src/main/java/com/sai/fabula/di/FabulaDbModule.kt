package com.sai.fabula.di

import com.sai.fabula.FabulaApp
import com.sai.fabula.database.FabulaNewsDatabase

class FabulaDbModule(private val application: FabulaApp) {

    //mengambil database
    fun getNewsDatabase() = FabulaNewsDatabase.getInstance(application)
}
