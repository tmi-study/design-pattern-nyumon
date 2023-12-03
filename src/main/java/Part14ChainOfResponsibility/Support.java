package Part14ChainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
            return;
        }
        if (next == null) {
            fail(trouble);
        }
        next.support(trouble);
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

    private void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected abstract boolean resolve(Trouble trouble);
}
