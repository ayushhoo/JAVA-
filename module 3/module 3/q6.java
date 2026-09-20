// q6: Write a Java program where a daemon thread continuously writes "Auto-Save in progress..." every 3 seconds, while the main thread performs a file processing task.
public class q6 {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Auto-Save in progress...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemon.setDaemon(true); // Make it a daemon thread
        daemon.start();

        System.out.println("Main thread: Starting file processing task...");
        try {
            // Simulate file processing for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread: Processing complete. Program ending.");
    }
}
