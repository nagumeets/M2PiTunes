package com.m2pitunes.data.services

import com.m2pitunes.data.remote.TopAlbumsApiService
import com.m2pitunes.utils.ViewState
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FetchAlbumsFromApi @Inject constructor(private val service: TopAlbumsApiService) {
        fun fetchAlbums() = flow {
            emit(ViewState.Loading)
            try {
                emit(ViewState.Success(service.getTopAlbums().feed.album))
            } catch (exception: Exception) {
                emit(ViewState.Error)
            }
    }
}