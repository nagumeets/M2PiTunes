package com.m2pitunes.data.services

import app.cash.turbine.test
import com.m2pitunes.data.TestDatasource
import com.m2pitunes.data.remote.TopAlbumsApiService
import com.m2pitunes.model.TopAlbums
import com.m2pitunes.utils.ViewState
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.IOException

class FetchAlbumsFromApiTest {
    @Test
    fun `can get albums from api`() = runTest {
        // given
        val feed = TestDatasource().getFeed()
        val fetchAlbumsService = mockk<TopAlbumsApiService> {
            coEvery { getTopAlbums() } returns TopAlbums(feed = feed)
        }
        val testSubject = FetchAlbumsFromApi(fetchAlbumsService)

        // when // then
        testSubject.fetchAlbums().test {
            assertEquals(ViewState.Loading, awaitItem())
            assertEquals(ViewState.Success(feed.album), awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun `can propagate exception when IOException thrown`() = runTest {
        val fetchAlbumsService = mockk<TopAlbumsApiService> {
            coEvery { getTopAlbums() } throws IOException("Network Error occurred")
        }
        val testSubject = FetchAlbumsFromApi(fetchAlbumsService)

        testSubject.fetchAlbums().test {
            assertEquals(ViewState.Loading, awaitItem())
            assertEquals(ViewState.Error, awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }
}