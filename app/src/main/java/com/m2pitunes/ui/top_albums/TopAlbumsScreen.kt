package com.m2pitunes.ui.top_albums

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.m2pitunes.R
import com.m2pitunes.model.Album
import com.m2pitunes.ui.components.AlbumCard
import com.m2pitunes.ui.components.HomeAppBar
import com.m2pitunes.ui.components.LoadingItem
import com.m2pitunes.utils.ViewState

@Composable
fun TopAlbumsScreen(
    topAlbumsViewModel: TopAlbumsViewModel = hiltViewModel(),
    onAlbumCardClicked: (String) -> Unit
) {
    var searchText by rememberSaveable { mutableStateOf("") }

    LaunchedEffect(Unit) {
        topAlbumsViewModel.getAlbums()
    }

    val result: ViewState = topAlbumsViewModel.state.collectAsState().value
    var isList by rememberSaveable { mutableStateOf(true) }

    // Handle search results and view state changes
    LaunchedEffect(searchText, isList) {
        if (searchText.isNotBlank()) {
            topAlbumsViewModel.searchAlbums(searchText)
        } else {
            topAlbumsViewModel.getAlbums()
        }
    }

    Scaffold(
        topBar = {
            HomeAppBar(
                isList = isList,
                onLayoutChangeRequested = { isList = !isList },
                onSearchPerform = { query ->
                    searchText = query
                }
            )
        },

        content = { padding ->
            Surface(
                modifier = Modifier
                    .padding(padding)
                    .testTag("TopAlbumsSurface"),
                color = MaterialTheme.colorScheme.background,
            ) {
                when (result) {
                    ViewState.Error -> Text(text = "Error fetching albums")
                    ViewState.Loading -> LoadingItem()
                    is ViewState.Success -> {
                        val albums = (result as ViewState.Success).entries
                        AlbumContent(albums = albums, isList = isList, onAlbumCardClicked)
                    }
                }
            }
        }
    )
}

@Composable
fun AlbumContent(
    albums: List<Album>,
    isList: Boolean,
    onAlbumCardClicked: (String) -> Unit
) {
    AlbumCard(albums = albums, isList = isList, onAlbumCardClicked)
}
