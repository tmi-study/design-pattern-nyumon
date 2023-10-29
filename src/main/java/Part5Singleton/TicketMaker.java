package Part5Singleton;

public class TicketMaker {
    private int ticketNumber = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("Make TicketMaker");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        addTicketNumber();
        return ticketNumber;
    }

    private void addTicketNumber() {
        ticketNumber += 1;
    }
}
