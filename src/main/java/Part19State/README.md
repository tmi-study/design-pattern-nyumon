# Part19 State
- 상태를 클래스로 표현한 패턴
- 상태를 체크할 때 if문을 쓰게되면?
  - 특정 상태인지 아닌지 비교하는 if문이 여러개 필요하다
  - 특정 상태일 때 해야하는 행동을 빼먹을 수 있다
- 상태를 클래스로 표현하면?
  - 클래스 그 자체가 상태를 나타내기 때문에 특정 상태인지 아닌지 비교하는 if문이 필요없다
  - 상태에 따라 다른 행동을 추상화하여 호출할 때 편하다
  - 새로운 상태를 추가하는 것은 간단하지만, 상태 의존 처리를 추가하려면 기존 모든 상태에 메소드를 추가해야한다
  - 인터페이스가 구체클래스에 메소드 구현을 강제하여 빠진 구현을 찾기 쉽다
