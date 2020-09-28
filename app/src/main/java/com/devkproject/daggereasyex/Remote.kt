package com.devkproject.daggereasyex

import javax.inject.Inject

class Remote {

    lateinit var car: Car

    //@Inject 표시를 한 constructor 가 있어야 dagger 에서 class 를 만들 수 있다. 없으면 error
    @Inject
    constructor() {

    }
    fun provideCar(car: Car) {
        println("providing car to remote")
        this.car = car
    }
}