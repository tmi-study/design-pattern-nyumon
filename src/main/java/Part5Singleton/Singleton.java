package Part5Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        if (singleton != null) {
            throw new ExceptionInInitializerError(String.format("Already created singleton %s", singleton.toString()));
        }
        System.out.println("Singleton 인스턴스를 생성했습니다");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
