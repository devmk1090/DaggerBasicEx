package com.devkproject.daggereasyex

import dagger.Component

//Module 을 이용하여 의존성 객체를 생성하며 Inject 로 요청받은 인스턴스에 생성된 객체를 주입하는
//Module 과 Inject 사이의 다리역할
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}