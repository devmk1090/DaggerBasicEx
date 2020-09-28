package com.devkproject.daggereasyex

import javax.inject.Inject

class PetrolEngine  : Engine {

    //의존성 주입을 요청
    @Inject
    constructor() {

    }

    override fun start() {
        println("Petrol engine started")
    }

}