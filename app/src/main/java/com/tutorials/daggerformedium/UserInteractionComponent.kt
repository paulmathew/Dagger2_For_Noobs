package com.tutorials.daggerformedium

import dagger.BindsInstance
import dagger.Subcomponent


@ActivityScope
@Subcomponent(modules = [UserRepoModule::class, NotificationServiceModule::class])
interface UserInteractionComponent {

    fun inject(mainActivity: MainActivity)

    fun getEmailService(): EmailService

    /**  factory way of passing data.
    @Subcomponent.Builder
    interface Factory{
    fun create(@BindsInstance title:String):UserInteractionComponent

    } */
    @Subcomponent.Builder
    interface Builder {
        fun build(): UserInteractionComponent
        fun setTitle(@BindsInstance title: String): Builder


    }
}