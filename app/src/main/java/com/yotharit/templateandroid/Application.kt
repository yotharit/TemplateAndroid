package com.yotharit.templateandroid

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.yotharit.templateandroid.manager.Contextor

class MainApplication : MultiDexApplication() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        Contextor.getInstance().init(applicationContext)
//        FirebaseApp.initializeApp(this)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}