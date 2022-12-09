package com.tutorials.daggerformedium

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepoModule {

    @Binds
    @ActivityScope
    abstract fun getRoomDBRepo(roomDBRepo: RoomDBRepo):UserRepo
}


