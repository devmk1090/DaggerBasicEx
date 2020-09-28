package com.devkproject.daggereasyex

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    //모듈 내에서 언급된 의존성을 어떻게 구성 및 제공하는지 알려줌
    @Provides
    fun providesRims(): Rims {
        println("rims created")
        return Rims()
    }

    @Provides
    fun providesTires(): Tires {
        println("tires created")
        return Tires()
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        println("Wheel module")
        return Wheels(rims, tires)
    }
}