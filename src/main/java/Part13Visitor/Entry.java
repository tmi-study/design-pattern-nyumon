package Part13Visitor;

public abstract class Entry implements Element{
    public abstract String getName();

    public abstract int getSize();

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + "B)";
    }
}
