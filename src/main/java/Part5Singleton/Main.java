package Part5Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (System.identityHashCode(obj1) == System.identityHashCode(obj2)){
            System.out.println("obj1, obj2는 같은 인스턴스");
        } else {
            System.out.println("obj1, obj2는 다른 인스턴스");
        }
    }
}
