// q2: Create a thread by implementing the Runnable interface that takes a string "MULTITHREADING" and prints its characters in reverse order one by one.
public class q2 {
    static class ReversePrinter implements Runnable {
        private String text;

        public ReversePrinter(String text) {
            this.text = text;
        }

        @Override
        public void run() {
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.println(text.charAt(i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ReversePrinter runnable = new ReversePrinter("MULTITHREADING");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
