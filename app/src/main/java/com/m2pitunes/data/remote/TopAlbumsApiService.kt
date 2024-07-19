package com.m2pitunes.data.remote

import com.m2pitunes.model.TopAlbums
import retrofit2.http.GET

interface TopAlbumsApiService {

    @GET("us/rss/topalbums/limit=100/json")
    suspend fun getTopAlbums(): TopAlbums
}
