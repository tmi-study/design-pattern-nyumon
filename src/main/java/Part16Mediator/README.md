# Part16 Mediator
- 멤버는 서로의 작업에 참견하지 않고 중재자에게만 보고하고, 중재자는 멤버에게 지시 내리는 패턴
```java
// 각 멤버가 Mediator에 상태변화를 알리는 코드
public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged();
}
public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged();
}
// 중재자 코드
public void colleagueChanged() {
    if (checkGuest.getState()) {
        textUser.setColleagueEnabled(false);
        textPass.setColleagueEnabled(false);
        buttonOk.setColleagueEnabled(true);
    } else {
        ...
    }
}
```