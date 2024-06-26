# 반복자 
1. > 반복자 패턴은 컬렉션의 내부 구조를 노출하지 않고 컬렉션의 요소에 접근하는 방법을 제공하는 패턴이다.
2. > 컬렉션 혹은 컨테이너 타입은 가장 많이 사용되는 자료구조이나 가끔은 트리 혹은 스택, 그래프 등의 구조를 사용하기도 한다.
3. > 모든 반복자들은 같은 인터페이스를 구현하고 있어야 하고 추가적으로 특별한 방법이 필요하면 새 반복자 클래스를 만들면 된다. 
4. > - 개방폐쇄원칙: 새로운 유형의 컬렉션을 추가하더라도 기존의 코드를 수정하지 않고도 새로운 반복자를 추가할 수 있다.
   > - 단일책임원칙: 반복자는 컬렉션의 요소에 접근하는 역할만 한다.
   > - 단순한 컬렉션의 경우에는 반복자를 사용하지 않고 직접 접근하는것이 더 효율적일 수 있다.
   > - 예: Java의 Iterator, ListIterator, Enumeration
   > - 예: Python의 __iter__(), __next__() 