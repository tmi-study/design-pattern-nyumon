# Part13 Visitor
- 처리하는 방식이 여러개 있을 때, 데이터 구조에서 처리를 분리하여 방문자를 만든다
- 더블 디스패치 : element가 visitor를 accept하고, visitor는 element를 visit하는 것처럼 서로가 서로를 호출하는 방식
- 장점
  - Visitor 역할 추가가 쉽다. FileFindVisitor, SizeVisitor 등 처리에 관한 로직을 추가할 수 있다
- 단점
  - Element 역할 추가가 어렵다. Element를 추가하면 Visitor도 해당 Element에 대한 visit을 추가해야한다
