package com.tutorials.daggerformedium

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() { // removed the param from the constructor

    @ActivityScope
    @SmsQualifiers
    @Provides
    fun getSMSService(title:String): NotificationService { // added the title param into the function itself.
        return SmsService(title)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}