package com.m2pitunes.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.m2pitunes.R
import com.m2pitunes.model.Album
import com.m2pitunes.utils.extractImage
import com.m2pitunes.utils.toReadableDate

@Composable
fun AlbumCard(
    albums: List<Album>,
    isList: Boolean,
    onAlbumCardClicked: (String) -> Unit,
) {
    AnimatedVisibility(
        visible = !isList,
        enter = fadeIn(),
        exit = fadeOut(),
    ) {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(items = albums) { album ->
                AlbumCardGrid(album = album, onAlbumCardClicked)
            }
        }
    }

    AnimatedVisibility(
        visible = isList,
        enter = fadeIn(),
        exit = fadeOut(),
    ) {
        LazyColumn {
            items(albums) { album ->
                AlbumCardList(album, onAlbumCardClicked)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlbumCardList(album: Album, onAlbumCardClicked: (String) -> Unit, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .testTag("AlbumCardList"),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        ),
        shape = RoundedCornerShape(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        ),
        onClick = {
                  onAlbumCardClicked(album.id.attributes.imId) //todo
        },
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = album.imImage.extractImage(),
                modifier = Modifier.padding(8.dp).testTag("RowItem"),
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                error = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Album cover",
                contentScale = ContentScale.Fit
            )
            Column {
                Text(
                    text = album.imName.label,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 8.dp, end = 16.dp),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = album.imArtist.label,
                    modifier = Modifier.padding(top = 4.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = album.imReleaseDate.label.toReadableDate(
                        conversionErrorMessage = stringResource(
                            R.string.unknown_release_date
                        )
                    ),
                    modifier = Modifier.padding(top = 4.dp, bottom = 8.dp),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlbumCardGrid(album: Album, onAlbumCardClicked: (String) -> Unit, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .testTag("AlbumCardGrid"),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        ),
        shape = RoundedCornerShape(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        ),
        onClick = {
                  onAlbumCardClicked(album.id.label) //todo
        },
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            AsyncImage(
                model = album.imImage.extractImage(),
                modifier = Modifier
                    .height(100.dp)
                    .padding(4.dp),
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                error = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Album cover",
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = album.imName.label,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(top = 8.dp),
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = album.imArtist.label,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(top = 4.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}