package com.devkproject.daggereasyex

import javax.inject.Inject

class DieselEngine : Engine {

    @Inject
    constructor() {

    }

    override fun start() {
        println("Diesel engine started")
    }
}