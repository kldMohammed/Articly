package com.kldmohammed.articly

import android.app.Application
import com.kldmohammed.articly.common.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AkhbaryApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AkhbaryApp)
            modules(appModule)
        }
    }
}