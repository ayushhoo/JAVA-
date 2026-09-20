// q9: Simulate a simple Dining Philosophers problem where two philosophers try to pick up chopsticks (resources) and create a deadlock situation.
public class q9 {
    static class Chopstick {
        public synchronized void pickUp(String philosopher) {
            System.out.println(philosopher + " picked up a chopstick.");
            try {
                // Simulate thinking/eating time
                Thread.sleep(100);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        final Chopstick c1 = new Chopstick();
        final Chopstick c2 = new Chopstick();

        Thread p1 = new Thread(() -> {
            synchronized (c1) {
                System.out.println("Philosopher 1: Picked up Chopstick 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (c2) {
                    System.out.println("Philosopher 1: Picked up Chopstick 2");
                }
            }
        });

        Thread p2 = new Thread(() -> {
            synchronized (c2) {
                System.out.println("Philosopher 2: Picked up Chopstick 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (c1) {
                    System.out.println("Philosopher 2: Picked up Chopstick 1");
                }
            }
        });

        p1.start();
        p2.start();
    }
}
