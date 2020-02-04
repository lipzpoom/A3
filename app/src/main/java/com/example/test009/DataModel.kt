package com.example.test009

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DataModel(


    @Expose
    @SerializedName("title")
    val title: String? ="",
    @Expose
    @SerializedName("url")
    val url: String? =""
)


