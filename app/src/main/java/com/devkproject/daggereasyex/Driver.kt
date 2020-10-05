package com.devkproject.daggereasyex

import javax.inject.Inject
import javax.inject.Singleton

//@Singleton 을 붙이면 car1, car2 의 driver 값이 통일됨. 안붙이면 다르게 나옴.
//Component 에도 붙여야함
@Singleton
class Driver {
    @Inject
    constructor() {

    }
}