package Part14ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);

        alice.setNext(bob);
        
        alice.support(new Trouble(10));
    }
}
