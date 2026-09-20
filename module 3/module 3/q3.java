// q3: Create a program that creates two threads. The first thread should print "Thread 1" every 1 second, and the second thread should print "Thread 2" every 2 seconds.
public class q3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        t1.start();
        t2.start();
    }
}
