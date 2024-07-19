package com.m2pitunes.utils

import com.m2pitunes.model.Album


sealed class ViewState {
    object Loading: ViewState()
    object Error: ViewState()
    data class Success(val entries: List<Album>): ViewState()
}