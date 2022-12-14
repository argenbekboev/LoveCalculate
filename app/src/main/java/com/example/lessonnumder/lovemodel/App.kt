package com.example.lessonnumder.lovemodel

import android.app.Application
import com.example.lessonnumder.lovemodel.RetrofitService

class App: Application() {

    companion object{
        lateinit var api: LoveApi
    }

    override fun onCreate() {
        super.onCreate()
    }
}