package com.tutorials.daggerformedium

import javax.inject.Inject

class UserInteractionService @Inject constructor(
    private val userRepo: UserRepo,
    @SmsQualifiers private val notificationService: NotificationService // like this
) {

    fun registerUser(email: String, name: String) {
        userRepo.saveUser(name, email)
        notificationService.send(email, "Msg Body", "from_emailId@gmail.com")

    }
}