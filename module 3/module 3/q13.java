// q13: Write a Java program using the ReentrantLock class to create a simple counter that can be safely incremented by multiple threads. Compare the result with the version that does not use a lock.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class q13 {
    static class LockedCounter {
        int count = 0;
        Lock lock = new ReentrantLock();
        public void inc() {
            lock.lock();
            try { count++; } finally { lock.unlock(); }
        }
    }

    static class UnlockedCounter {
        int count = 0;
        public void inc() { count++; }
    }

    public static void main(String[] args) throws InterruptedException {
        LockedCounter lc = new LockedCounter();
        UnlockedCounter uc = new UnlockedCounter();

        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                lc.inc();
                uc.inc();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Locked Counter: " + lc.count);
        System.out.println("Unlocked Counter: " + uc.count);
        System.out.println("Note: Unlocked counter often results in a lower value due to race conditions.");
    }
}
