package com.sai.fabula.api.model

import com.squareup.moshi.Json

//data diambil dari url dengan pojo
//dari json response
//dengan variabel name
data class Source(
    @field:Json(name = "name") var name: String? = null
)
