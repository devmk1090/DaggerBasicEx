package com.devkproject.daggereasyex

import android.app.Application

class ExampleApp: Application() {

    private lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder()
            .powerCapacity(300)
            .engineCapacity(1000)
            .build()
    }

    fun carComponent(): CarComponent {
        return carComponent
    }
}