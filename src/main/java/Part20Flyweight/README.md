# Part20 Flyweight
- 인스턴스를 최대한 공유해서 쓰는 것
- Flyweight
  - 공유할 무언가
  - 이부분을 변경하면 이걸 공유하여 사용하는 여러 곳에 영향을 미친다
- FlyweightFactory
  - Flyweight를 만드는 공장
  - 이 공장이 Flyweight를 최대한 공유해서 쓰려고 한다
- Client
  - FlyweightFactory를 사용하여 Flyweight를 만들고 이용한다
