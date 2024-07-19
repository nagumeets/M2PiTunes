package com.m2pitunes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.m2pitunes.ui.album_details.AlbumDetailsScreen
import com.m2pitunes.ui.components.HomeAppBar
import com.m2pitunes.ui.theme.M2PiTunesTheme
import com.m2pitunes.ui.top_albums.TopAlbumsScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            M2PiTunesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppUI()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    M2PiTunesTheme {
        Scaffold(
            topBar = {
                HomeAppBar(isList = true, onLayoutChangeRequested = { }, onSearchPerform = {})
            },
            content = { padding ->
                Surface(
                    modifier = Modifier.padding(padding),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    AppUI()
                }
            }
        )
    }
}

@Composable
fun AppUI() {
    val navController = rememberNavController()
    SetupNavigation(navController = navController)
}

@Composable
private fun SetupNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "top_albums",
    ) {
        composable(
            route = "top_albums",
            arguments = listOf(navArgument("id") { type = NavType.StringType })
        ) {
            TopAlbumsScreen(
                onAlbumCardClicked = { albumId ->
                    navController.navigate("album_details" + "/${albumId}")
                }
            )
        }
        composable(route = "album_details/{id}")
        { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getString("id")
            AlbumDetailsScreen(album = id,navController)
        }
    }
}