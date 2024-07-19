package com.m2pitunes.ui.top_albums

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.m2pitunes.data.services.FetchAlbumsFromApi
import com.m2pitunes.model.Album
import com.m2pitunes.utils.ViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TopAlbumsViewModel @Inject constructor(
    val fetchAlbumsFromApi: FetchAlbumsFromApi,
) : ViewModel() {
    private val _state = MutableStateFlow<ViewState>(ViewState.Loading)
    val state: StateFlow<ViewState> = _state
    private var albums: List<Album> = emptyList()

    fun getAlbums() {
        viewModelScope.launch {
            try {
                fetchAlbumsFromApi.fetchAlbums().collect { viewState ->
                    _state.emit(
                        when (viewState) {
                            ViewState.Error -> ViewState.Error
                            ViewState.Loading -> ViewState.Loading
                            is ViewState.Success -> {
                                if (viewState.entries.isEmpty()) ViewState.Error
                                else ViewState.Success(entries = viewState.entries)
                            }
                        }
                    )
                }
            } catch (e: Exception) {
                _state.value = ViewState.Error
                e.printStackTrace()
            }
        }
    }
    fun searchAlbums(query: String) {
        viewModelScope.launch {
            val filteredAlbums = if (query.isBlank()) {
                albums // Return all albums if query is empty
            } else {
                albums.filter { album ->
                    album.title.label.contains(query, ignoreCase = true) ||
                            album.imName.label.contains(query, ignoreCase = true) ||
                            album.imArtist.label.contains(query, ignoreCase = true)
                }
            }
            _state.value = ViewState.Success(entries = filteredAlbums)
        }
    }

}