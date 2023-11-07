# Part7 Builder
- 전체를 구성하는 각 부분을 만들고 단계를 밟아가며 만드는 패턴
- Builder : 인스턴스의 각 부분을 만드는 메소드 준비
- Director : Builder의 메소드만 사용하여 Builder의 구현체에 의존하지 않게 함
- Client : Builder 패턴 사용, 여기선 Main 클래스, Director의 메소드만 사용
- 기타 디자인패턴 개선
  - if -> Map
  - builder.getResult -> builder.result
  - director.construct() 할 때 파일 쓰는 메소드 실행시켜도 되는가
- Builder를 이용해 각 부분을 만들고, Director를 이용하여 사용하는 패턴