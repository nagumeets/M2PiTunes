package com.m2pitunes.utils

import com.m2pitunes.model.Attributes
import com.m2pitunes.model.ImImage
import org.junit.Assert
import org.junit.Test

class ImageUtilsTest {
    @Test
    fun `can get image correctly`() {
        val imImage = listOf(
            ImImage(
                label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/",
                attributes = Attributes(height = "55")
            ),
            ImImage(
                label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/",
                attributes = Attributes(height = "60")
            ),
            ImImage(
                label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/",
                attributes = Attributes(height = "170")
            )
        )

        val extractedImage = imImage.extractImage()

        Assert.assertEquals("https://is1-ssl.mzstatic.com/image/thumb/Music116/", extractedImage)
    }

    @Test
    fun `can return null if image list is empty`() {
        val imImage: List<ImImage> = listOf()

        val extractedImage = imImage.extractImage()

        Assert.assertNull(extractedImage)
    }

    @Test
    fun `can return null if image list has only 1 element`() {
        val imImage: List<ImImage> = listOf()

        val extractedImage = imImage.extractImage()

        Assert.assertNull(extractedImage)
    }
}