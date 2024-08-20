package ticketsystem;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportTicketSystem {
    private Queue<String> tickets;

    public CustomerSupportTicketSystem() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public String processTicket() {
        return tickets.poll();
    }

    public void displayPendingTickets() {
        for (String ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) {
        CustomerSupportTicketSystem system = new CustomerSupportTicketSystem();
        system.addTicket("Ticket 1");
        system.addTicket("Ticket 2");
        System.out.println("Processing: " + system.processTicket());
        system.displayPendingTickets();
    }
}
