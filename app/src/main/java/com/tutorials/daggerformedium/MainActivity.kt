package com.tutorials.daggerformedium

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userInteractionService: UserInteractionService // fields injection

    lateinit var emailService1: EmailService
    lateinit var emailService2: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as MyApplication).appComponent
        val userInteractionComponent =
            appComponent.getUserInteractionComponentBuilder().setTitle("That title again").build()
//        emailService1=component.getEmailService()
//        val component2 = (application as MyApplication).userInteractionComponent
//        emailService2=component2.getEmailService()
//
//        component.inject(this)
        userInteractionComponent.inject(this)
        userInteractionService.registerUser("new_email@id.com", "Sample Name")
    }
}