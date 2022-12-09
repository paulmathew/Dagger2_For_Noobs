package com.tutorials.daggerformedium

interface AnalyticsService {

    fun trackEven(evenName:String,eventType:String)
}

class Mixpanel:AnalyticsService{
    override fun trackEven(evenName: String, eventType: String) {
        println("Mix Panel")
    }

}

class FirebaseAnalytics:AnalyticsService{
    override fun trackEven(evenName: String, eventType: String) {
        println("Firebase Analytics")
    }

}