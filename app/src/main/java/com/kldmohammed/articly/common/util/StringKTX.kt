package com.kldmohammed.articly.common.util

import java.text.SimpleDateFormat
import java.util.*

fun String.formatToDate(): String {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())

    val sdf = SimpleDateFormat("yyyy MMM dd", Locale.getDefault())
    val date = simpleDateFormat.parse(this)
    return sdf.format(date!!)
}

fun String.formatToTime(): String {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())

    val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
    val date = simpleDateFormat.parse(this)
    return sdf.format(date!!)
}