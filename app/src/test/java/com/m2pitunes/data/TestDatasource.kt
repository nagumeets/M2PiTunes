package com.m2pitunes.data

import com.m2pitunes.data.local.Datasource
import com.m2pitunes.model.Author
import com.m2pitunes.model.Feed
import com.m2pitunes.model.Icon
import com.m2pitunes.model.Id2
import com.m2pitunes.model.Name
import com.m2pitunes.model.Rights2
import com.m2pitunes.model.Title2
import com.m2pitunes.model.Updated
import com.m2pitunes.model.Uri
import com.m2pitunes.model.Album

class TestDatasource {
    private fun getEntries(): List<Album> {
        return Datasource().loadEntries()
    }

    fun getFeed(): Feed {
        return Feed(
            album = getEntries(),
            author = Author(Name(""), Uri("")),
            id = Id2(""),
            icon = Icon(""),
            link = listOf(),
            title = Title2(""),
            rights = Rights2(""),
            updated = Updated(""),
        )
    }
}