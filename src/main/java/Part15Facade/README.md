# Part15 Facade
- 복잡한 세부내용은 내부로 숨기고 시스템 외부에 간단한 인터페이스만 보여주는 것
- 필요하면 더 큰 단위로 계속 Facade 역을 생성할 수 있다
```java
// Main, 외부에서 makeWelcomePage만 보인다
public static void main(String[] args) {
    PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
}
// PageMaker, 내부엔 Database.getProperties, mailprop.getProperty, writer.title 등 세부내용이 있다
public static void makeWelcomePage(String mailaddr, String filename) {
    try {
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title(username + "'s web page");
        writer.paragraph("Welcome to " + username + "'s web page!");
        writer.paragraph("Nice to meet you!");
        writer.mailto(mailaddr, username);
        writer.close();
        System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```