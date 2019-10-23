package com.lmf.appkoin

import android.app.Application
import com.lmf.appkoin.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApp)
            modules(mainModule)
        }
    }
}