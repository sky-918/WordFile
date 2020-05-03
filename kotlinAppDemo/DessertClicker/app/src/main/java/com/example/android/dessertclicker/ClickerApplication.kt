package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/**
 *Created by TYY on 2020/5/3
 *Explain:
 */
class ClickerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //timber 日志初始化
        Timber.plant(Timber.DebugTree())
    }
}