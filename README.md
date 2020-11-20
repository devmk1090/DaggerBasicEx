# DaggerBasicEx
기본적인 dagger 예제 및 설명

@Module 과 @Provide   
- Module 은 클래스에만 붙이며 Provide 는 반드시 Module 클래스안에 선언된 메소드에만 붙인다.
- Module 클래스는 의존성 주입에 필요한 객체들을 Provide 메소드를 통해 관리한다. 
- Module 은 Component 에 연결되어 의존성을 제공하는 메소드들을 가진 객체를 생성한다.
- Provide 는 Module 내에서 언급된 의존성을 어떻게 구성하고 제공할지 알려준다.

@Inject
- Field, Constructor, Method 에 붙여 Component 로부터 객체를 주입받을 수 있게 한다.
   
@Component
- Interface 또는 abstract 클래스에 붙일 수 있다. 
- Moule 을 이용하여 의존성 객체를 생성하며 Inject 로 요청받은 인스턴스에 생성된 객체를 주입하는 Module 과 Inject 사이의 다리역할을 함.   
   
@SubComponent : Component 의 하위 계층. 처음 Inject 로 주입을 요청받으면 SubComponet > Component 순서로 의존성을 검색.   
   
@Scope : 의존성 관련 객체의 생명주기 범위, Module에서 Scope를 보고 객체를 관리 ex) @ActivityScope, @FragmentScope   
