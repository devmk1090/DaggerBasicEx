package com.devkproject.daggereasyex

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity: Int

    //의존성 주입을 요청
    @Inject
    constructor(@Named("power")powerCapacity: Int, @Named("engine")engineCapacity: Int) {
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        println("Petrol engine started: powerCapacity: $powerCapacity engineCapacity: $engineCapacity")
    }

}