// q10: Implement a producer-consumer scenario where one thread (producer) produces data and another thread (consumer) consumes it. Use the wait() and notify() methods for synchronization.
import java.util.LinkedList;
import java.util.Queue;

public class q10 {
    static class Buffer {
        private Queue<Integer> queue = new LinkedList<>();
        private final int CAPACITY = 5;

        public synchronized void produce(int value) throws InterruptedException {
            while (queue.size() == CAPACITY) {
                wait();
            }
            queue.add(value);
            System.out.println("Produced: " + value);
            notifyAll();
        }

        public synchronized int consume() throws InterruptedException {
            while (queue.isEmpty()) {
                wait();
            }
            int value = queue.poll();
            System.out.println("Consumed: " + value);
            notifyAll();
            return value;
        }
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) buffer.produce(i);
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) buffer.consume();
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        producer.start();
        consumer.start();
    }
}
