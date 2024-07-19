package com.m2pitunes.top_albums

import app.cash.turbine.test
import com.m2pitunes.data.TestDatasource
import com.m2pitunes.data.remote.TopAlbumsApiService
import com.m2pitunes.data.services.FetchAlbumsFromApi
import com.m2pitunes.helpers.MainCoroutineRule
import com.m2pitunes.model.TopAlbums
import com.m2pitunes.ui.top_albums.TopAlbumsViewModel
import com.m2pitunes.utils.ViewState
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class TopAlbumsViewModelTest {

    @get:Rule
    val testCoroutineRule = MainCoroutineRule()

    @Test
    fun `getAlbums can get albums`() = runTest {
        // given
        val feed = TestDatasource().getFeed()
        val fetchAlbumsService = mockk<TopAlbumsApiService> {
            coEvery { getTopAlbums() } returns TopAlbums(feed = feed)
        }
        val fetchAlbumsFromApiTest = FetchAlbumsFromApi(fetchAlbumsService)
        val testSubject = TopAlbumsViewModel(fetchAlbumsFromApi = fetchAlbumsFromApiTest)

        // when
        testSubject.getAlbums()

        //then
        testSubject.state.test {
            assertEquals(ViewState.Loading, awaitItem())
            assertEquals(ViewState.Success(entries = feed.album), awaitItem())
        }
    }

    @Test
    fun `can return error state when getAlbums fails`() = runTest {
        // given
        val fetchAlbumsService = mockk<TopAlbumsApiService>()
        val fetchAlbumsFromApiTest = FetchAlbumsFromApi(fetchAlbumsService)
        val testSubject = TopAlbumsViewModel(fetchAlbumsFromApi = fetchAlbumsFromApiTest)

        // when
        testSubject.getAlbums()

        //then
        testSubject.state.test {
            assertEquals(ViewState.Loading, awaitItem())
            assertEquals(ViewState.Error, awaitItem())
        }
    }

    @Test
    fun `can return error state when entry value is null`() = runTest {
        // given
        val feed = TestDatasource().getFeed().copy(album = listOf())
        val fetchAlbumsService = mockk<TopAlbumsApiService> {
            coEvery { getTopAlbums() } returns TopAlbums(feed = feed)
        }
        val fetchAlbumsFromApiTest = FetchAlbumsFromApi(fetchAlbumsService)
        val testSubject = TopAlbumsViewModel(fetchAlbumsFromApi = fetchAlbumsFromApiTest)

        // when
        testSubject.getAlbums()

        //then
        testSubject.state.test {
            assertEquals(ViewState.Loading, awaitItem())
            assertEquals(ViewState.Error, awaitItem())
        }
    }
}