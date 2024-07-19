package com.m2pitunes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.m2pitunes.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(
    isList: Boolean,
    onLayoutChangeRequested: () -> Unit,
    onSearchPerform: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchText by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current

    TopAppBar(
        title = { Text("Top 100 Albums") },
        actions = {
            // Search icon button
            IconButton(
                onClick = {
                    searchText = "" // Clear search text
                    onSearchPerform("")
                    isSearchActive = true // Activate search mode
                    keyboardController?.show() // Show keyboard when search is activated
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "search",
                )
            }

            // Layout change icon button
            IconButton(
                onClick = { onLayoutChangeRequested() },
                modifier = modifier.testTag("ChangeViewIcon")
            ) {
                if (!isList) {
                    Icon(
                        imageVector = Icons.Filled.List,
                        contentDescription = "list view",
                    )
                } else {
                    Icon(
                        imageVector = Icons.Filled.GridView,
                        contentDescription = "grid view",
                    )
                }
            }

            // More options icon button
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "more options",
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.primaryContainer),
    )

    // TextField for searching albums
    if (isSearchActive) {
        TextField(
            value = searchText,
            onValueChange = {
                searchText = it // Update search text
                onSearchPerform(it) // Perform search with new query
            },
            placeholder = { Text("Search albums") },
            singleLine = true,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .onFocusChanged { focusState ->
                    if (focusState.isFocused) {
                        keyboardController?.show() // Show keyboard when TextField gains focus
                    }
                }
        )

        // Clear search icon button
        IconButton(
            onClick = {
                isSearchActive = false // Deactivate search mode
                searchText = "" // Clear search text
                onSearchPerform("") // Perform search with empty query
                keyboardController?.hide() // Hide keyboard when search is deactivated
            },
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = "Clear search",
            )
        }
    }
}