// q7: Create a ticket booking system where multiple users (threads) attempt to book tickets simultaneously. Use synchronization to prevent overselling of tickets.
public class q7 {
    static class TicketSystem {
        private int availableTickets = 5;

        public synchronized void bookTicket(String userName) {
            if (availableTickets > 0) {
                System.out.println(userName + " successfully booked a ticket.");
                availableTickets--;
            } else {
                System.out.println("Sorry " + userName + ", no tickets available.");
            }
        }
    }

    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        Runnable bookingTask = () -> {
            String name = Thread.currentThread().getName();
            system.bookTicket(name);
        };

        for (int i = 1; i <= 8; i++) {
            new Thread(bookingTask, "User-" + i).start();
        }
    }
}
