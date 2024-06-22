# 파사드 
1. > 파사드 패턴은 서브시스템의 인터페이스를 통합하여 하나의 통합된 인터페이스를 제공하는 패턴이다.
2. > 서브 객체들을 묶어서 하나의 기능으로 제공 직관적인 인터페이스를 제공한다.
3. > - 복잡한 시스템에서 서브 시스템을 감추고, 클라이언트에게 단순한 인터페이스를 제공한다
   > - 클라이언트가 서브 시스템을 직접 사용하는 것이 아니라, 파사드를 통해 간접적으로 사용한다.
   > - 결합도가 매우 높아져 모든 의존성이 하나로 향하는 단점이 생길수도 있다 
   > - 하지만 그로 인해서 수정 포인트가 한정되어 예측하기 쉬워진다는 장점도 있다고 생각된다.