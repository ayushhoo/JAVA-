// q5: Write a Java program that creates three threads: "Worker-1", "Worker-2", and "Worker-3". Assign different priorities and print messages from each thread showing their execution order.
public class q5 {
    static class Worker extends Thread {
        public Worker(String name, int priority) {
            super(name);
            setPriority(priority);
        }

        @Override
        public void run() {
            System.out.println("Running " + getName() + " with priority " + getPriority());
        }
    }

    public static void main(String[] args) {
        Worker w1 = new Worker("Worker-1", Thread.MIN_PRIORITY);
        Worker w2 = new Worker("Worker-2", Thread.NORM_PRIORITY);
        Worker w3 = new Worker("Worker-3", Thread.MAX_PRIORITY);

        w1.start();
        w2.start();
        w3.start();
    }
}
