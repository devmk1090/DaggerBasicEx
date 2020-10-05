package com.devkproject.daggereasyex

import dagger.Module
import dagger.Provides

//Component 에 연결되어 의존성을 제공하는 메서드들을 가진 객체를 생성
@Module
class PetrolEngineModule {

    @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine) : Engine {
        return petrolEngine
    }
}