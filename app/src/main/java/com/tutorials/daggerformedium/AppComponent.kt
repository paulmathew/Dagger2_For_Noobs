package com.tutorials.daggerformedium

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {


    //fun getAnalyticsService(): AnalyticsService

    // the use of the above fn is to provide AnalyticsService object to the place it needs.

    /**  factory type
    //fun getUserInteractionComponentFactory():UserInteractionComponent.Factory
    // the reason for .Factory is we are using factory property in the Component interface
     */

    /** builder type */
    fun getUserInteractionComponentBuilder():UserInteractionComponent.Builder




}