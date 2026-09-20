// q8: Create an inventory management program where multiple threads decrease the stock count of a product. Use a synchronized block to ensure stock updates are thread-safe.
public class q8 {
    static class Inventory {
        private int stock = 50;
        private final Object lock = new Object();

        public void reduceStock(String threadName) {
            synchronized (lock) {
                if (stock > 0) {
                    stock--;
                    System.out.println(threadName + " reduced stock. Remaining: " + stock);
                } else {
                    System.out.println("Out of stock!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                inventory.reduceStock(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
