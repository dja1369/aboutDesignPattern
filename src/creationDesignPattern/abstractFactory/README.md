# 추상 팩토리 
1. > 추상 팩토리는 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체의 구상 클래스를 생성하는 패턴이다
2. > 팩토리 메소드와 다른 점은 팩토리 메소드는 객체 생성을 서브클래스에서 결정하지만, 추상 팩토리는 객체 생성을 인터페이스로 추상화하여, 서로 연관된 객체를 생성한다
3. > 생성을 위한 인터페이스를 우선 제공해 인터페이스를 구현한 객체가 생성을 담당하고 팩토리 메소드와 다르게 객체 생성 부분이 구현체로 먼저 제공되지 않는다
4. > 즉 조금 더 유연하다 
5. > - 단일책임원칙: 객체를 생성하는 방법을 캡슐화하여, 객체의 생성과 사용을 분리한다
   > - 개방폐쇄원칙: 기존 객체 생성 방식을 수정하지 않고, 새로운 객체 생성 방식을 추가할수 있다
   > - 의존성 역전 원칙: 객체 생성을 위한 인터페이스를 제공하여, 객체 생성을 위한 구상 클래스에 의존하지 않도록 한다
   > - 인터페이스가 많아져 코드가 필요 이상으로 복잡해질수도..
   