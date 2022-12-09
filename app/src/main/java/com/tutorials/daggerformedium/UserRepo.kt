package com.tutorials.daggerformedium

import javax.inject.Inject

interface UserRepo{
    fun saveUser(name: String, email: String)
}
@ActivityScope
class RoomDBRepo @Inject constructor(private val analyticsService: AnalyticsService):UserRepo {

    override fun saveUser(name: String, email: String) {
        println("User added to roomdb")
        analyticsService.trackEven("Save USer DB","Create")
    }
}
class ServerDBRepo(private val analyticsService: AnalyticsService):UserRepo{
    override fun saveUser(name: String, email: String) {
        println("User added to Server DB")
        analyticsService.trackEven("Save USer Server","Create")

    }

}