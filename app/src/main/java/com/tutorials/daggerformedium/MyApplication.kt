package com.tutorials.daggerformedium

import android.app.Application

class MyApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.builder().build()
        //userInteractionComponent=DaggerUserInteractionComponent.factory().create("That title string")
    }

}