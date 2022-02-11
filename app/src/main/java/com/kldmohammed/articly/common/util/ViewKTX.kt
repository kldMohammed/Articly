package com.kldmohammed.articly.common.util

import android.view.View


fun View.show() {
    animate().alpha(1.0f).duration = 300
    visibility = View.VISIBLE
}

fun View.gone() {
    animate().alpha(0.0f).duration = 300
    visibility = View.GONE
}


fun View.enable() {
    isEnabled = true
}

fun View.disable() {
    isEnabled = false
}
