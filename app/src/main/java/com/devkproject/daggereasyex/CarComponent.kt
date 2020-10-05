package com.devkproject.daggereasyex

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

//Module 을 이용하여 의존성 객체를 생성하며 Inject 로 요청받은 인스턴스에 생성된 객체를 주입하는
//Module 과 Inject 사이의 다리역할
@Singleton
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun powerCapacity(@Named("power")powerCapacity: Int): Builder
        //두개의 다른 인자를 전달하려면 @Named 를 써야함.
        @BindsInstance
        fun engineCapacity(@Named("engine")engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}