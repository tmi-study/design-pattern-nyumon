# Part17 Observer
- 관찰 대상의 상태가 변화하면 관찰자에게 알린다(subject에서 알려준다, publish-subscribe 패턴)
- observer의 행위가 subject에 변화를 줄 때 주의해야한다(subject가 변화하면 또 observer가 호출되면서 무한반복될 수 있다)
- mvc 패턴의 model과 view는 subject와 observer 관계에 해당된다