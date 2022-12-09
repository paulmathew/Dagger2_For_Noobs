package com.tutorials.daggerformedium

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, body: String, from: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, body: String, from: String) {
        println("Email Send")
    }
}

// updated
class SmsService(private val title: String) : NotificationService {
    override fun send(to: String, body: String, from: String) {
        Log.e("Title is ", title)
        println("SMS Send")
    }

}