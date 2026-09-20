// q14: Write a program where two threads acquire two locks (lock1 and lock2) in opposite order, causing a deadlock. Then, fix the deadlock by using tryLock() with timeout.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class q14 {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        // This example demonstrates the FIX using tryLock
        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("T1: Acquired lock 1");
                        Thread.sleep(100);
                        if (lock2.tryLock(1, TimeUnit.SECONDS)) {
                            try { System.out.println("T1: Acquired lock 2"); } finally { lock2.unlock(); }
                        } else { System.out.println("T1: Could not get lock 2, releasing lock 1"); }
                    } finally { lock1.unlock(); }
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("T2: Acquired lock 2");
                        Thread.sleep(100);
                        if (lock1.tryLock(1, TimeUnit.SECONDS)) {
                            try { System.out.println("T2: Acquired lock 1"); } finally { lock1.unlock(); }
                        } else { System.out.println("T2: Could not get lock 1, releasing lock 2"); }
                    } finally { lock2.unlock(); }
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        t1.start();
        t2.start();
    }
}
