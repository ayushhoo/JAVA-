// q11: Write a program where two threads print numbers from 1 to 20 alternately: one prints odd numbers, and the other prints even numbers. Use wait() and notify() for synchronization.
public class q11 {
    private static int count = 1;
    private static final int MAX = 20;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            while (count <= MAX) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                    }
                    if (count <= MAX) {
                        System.out.println("Odd: " + count++);
                        lock.notify();
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (count <= MAX) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                    }
                    if (count <= MAX) {
                        System.out.println("Even: " + count++);
                        lock.notify();
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
