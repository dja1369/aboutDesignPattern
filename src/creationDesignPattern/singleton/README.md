# 싱글톤
1.  >싱글톤 패턴은 객체를 하나만 생성하도록 보장하는 패턴이다.
2.  >객체를 하나만 생성하도록 보장하면, 메모리 낭비를 방지할 수 있고, 객체가 여러 개 생성되는 것을 방지할 수 있다.
3.  >전역적으로 객체에 대한 접근을 제공한다 
4.  >대신 싱글톤 패턴은 전역 변수의 사용을 증가시키므로, 다른 객체들 간의 결합도가 높아져 객체 지향 설계 원칙에 어긋날 수 있다.
5.  > - 단일책임 원칙: 클래스는 단 하나의 책임을 가져야 한다.
    > - 싱글톤 패턴은 객체 생성과 객체의 역할을 분리하지 않고, 객체 생성과 객체의 역할을 동시에 처리한다.
    > - 따라서 단일책임 원칙을 위배할 수 있다.
    > - 예: 데이터베이스 커넥션