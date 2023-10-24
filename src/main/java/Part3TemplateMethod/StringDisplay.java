package Part3TemplateMethod;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private char lineChar = '-';
    private char cornerChar = '+';

    public StringDisplay(String string) {
        this.string = string;
    }
    @Override
    public void open() {
        printEdge();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printEdge();
    }

    private void printEdge() {
        System.out.print(cornerChar);
        for (int i = 0; i < string.length(); i++) {
            System.out.print(lineChar);
        }
        System.out.print(cornerChar);
        System.out.println();
    }
}
