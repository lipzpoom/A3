package com.example.test009

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("albums/9/photos")
    fun getPhotos(): Call<List<DataModel>>

}
