package com.devkproject.daggereasyex

import javax.inject.Inject

class Car {
    lateinit  var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    @Inject
    fun provideCarToRemote(remote: Remote) {
        remote.provideCar(this)
    }

    fun start() {
        engine.start()
        println("driving...")
    }
}