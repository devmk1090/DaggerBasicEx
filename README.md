# DaggerBasicEx
기본적인 dagger 사용 예제

@Inject : 의존성 주입을 요청
@Component : Moule을 이용하여 의존성 객체를 생성하며 Inject로 요청받은 인스턴스에 생성된 객체를 주입하는 Module과 Inject 사이의 다리역할
@SubComponent : Component의 하위 계층이라고 생각하면 됩니다. 처음 Inject로 주입을 요청받으면 SubComponet -> Component 순서로 의존성을 검색합니다.
@Module : Componet에 연결되어 의존성을 제공하는 메서드들을 가진 객체를 생성
@Provide : 모듈 내에서 언급된 의존성을 어떻게 구성 및 제공하는지 알려준다.
@Scope : 의존성 관련 객체의 생명주기 범위, Module에서 Scope를 보고 객체를 관리 Ex> @ActivityScope, @FragmentScope
