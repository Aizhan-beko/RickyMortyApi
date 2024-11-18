package com.geeks.rickymortyapi.ui.p.application

import android.app.Application
import com.geeks.rickymortyapi.ui.p.data.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}