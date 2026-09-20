// q1: Create a thread by extending the Thread class that prints even numbers from 2 to 20 with a 500ms delay between each number.
public class q1 extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        q1 thread = new q1();
        thread.start();
    }
}
