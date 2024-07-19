package com.m2pitunes.utils

import com.m2pitunes.model.ImImage

fun List<ImImage>.extractImage(): String? {
    return try {
        this.last().label
    }
    catch (e: Exception) {
        null
    }
}
