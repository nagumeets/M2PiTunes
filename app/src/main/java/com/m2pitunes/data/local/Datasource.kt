package com.m2pitunes.data.local

import com.m2pitunes.model.Album
import com.m2pitunes.model.Attributes
import com.m2pitunes.model.Attributes2
import com.m2pitunes.model.Attributes3
import com.m2pitunes.model.Attributes4
import com.m2pitunes.model.Attributes5
import com.m2pitunes.model.Attributes6
import com.m2pitunes.model.Attributes7
import com.m2pitunes.model.Attributes8
import com.m2pitunes.model.Attributes9
import com.m2pitunes.model.Category
import com.m2pitunes.model.Id
import com.m2pitunes.model.ImArtist
import com.m2pitunes.model.ImContentType
import com.m2pitunes.model.ImContentType2
import com.m2pitunes.model.ImImage
import com.m2pitunes.model.ImItemCount
import com.m2pitunes.model.ImName
import com.m2pitunes.model.ImPrice
import com.m2pitunes.model.ImReleaseDate
import com.m2pitunes.model.Link
import com.m2pitunes.model.Rights
import com.m2pitunes.model.Title

class Datasource() {
    fun loadEntries(): List<Album> {
        return listOf(
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845538")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
        Album(
            imName = ImName("Red (Taylor's Version) [Deluxe]"),
            imArtist = ImArtist("Taylor Swift", Attributes7("")),
            imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
            imImage = listOf(
                ImImage(
                    label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                    attributes = Attributes(height = "55")
                ),
                ImImage(
                    label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                    attributes = Attributes(height = "60")
                ),
                ImImage(
                    label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                    attributes = Attributes(height = "170")
                )
            ),
            imItemCount = ImItemCount("22"),
            imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
            imContentType = ImContentType(
                ImContentType2(Attributes3("Album", "Album")),
                Attributes4("Music", "Music")
            ),
            rights = Rights("℗ 2023 Taylor Swift"),
            title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
            link = Link(
                Attributes5(
                    "alternate",
                    "text/html",
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                )
            ),
            id = Id(
                "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                Attributes6("1713845538")
            ),
            category = Category(Attributes8("", "", "", "")),
        )
        )
    }

    fun loadManyEntries(): List<Album> {
        return loadEntries() + listOf(
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845537")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845566")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845524")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845546")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845552")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845590")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845577")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845526")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845533")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845557")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845531")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845512")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845514")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845245")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845498")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845543")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("1989 (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713845589")
                ),
                category = Category(Attributes8("", "", "", "")),
            ),
            Album(
                imName = ImName("Red (Taylor's Version) [Deluxe]"),
                imArtist = ImArtist("Taylor Swift", Attributes7("")),
                imReleaseDate = ImReleaseDate("2023-10-20T00:00:00-07:00", Attributes9("")),
                imImage = listOf(
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/55x55bb.png",
                        attributes = Attributes(height = "55")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/60x60bb.png",
                        attributes = Attributes(height = "60")
                    ),
                    ImImage(
                        label = "https://is1-ssl.mzstatic.com/image/thumb/Music116/v4/8e/35/6c/8e356cc2-0be4-b83b-d29e-b578623df2ac/23UM1IM34052.rgb.jpg/170x170bb.png",
                        attributes = Attributes(height = "170")
                    )
                ),
                imItemCount = ImItemCount("22"),
                imPrice = ImPrice("$13.99", Attributes2("13.99", "USD")),
                imContentType = ImContentType(
                    ImContentType2(Attributes3("Album", "Album")),
                    Attributes4("Music", "Music")
                ),
                rights = Rights("℗ 2023 Taylor Swift"),
                title = Title("1989 (Taylor's Version) [Deluxe] - Taylor Swift"),
                link = Link(
                    Attributes5(
                        "alternate",
                        "text/html",
                        "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2"
                    )
                ),
                id = Id(
                    "https://music.apple.com/us/album/1989-taylors-version-deluxe/1713845538?uo=2",
                    Attributes6("1713856538")
                ),
                category = Category(Attributes8("", "", "", "")),
            )
        )
    }
}