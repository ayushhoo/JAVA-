// q4: Write a program where one thread prints a countdown from 10 to 1 (1-second delay), while another thread simultaneously prints "Tick..." every half a second.
public class q4 {
    public static void main(String[] args) {
        Thread countdown = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Blast off!");
        });

        Thread ticker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Tick...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        countdown.start();
        ticker.start();

        try {
            countdown.join();
            ticker.interrupt(); // Stop ticker once countdown is done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
