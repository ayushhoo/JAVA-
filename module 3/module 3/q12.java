// q12: Write a program that simulates a file download in a thread (printing "Downloading chunk X"). Allow the download to stop gracefully when a stop flag is set to false.
public class q12 {
    static class Downloader extends Thread {
        private volatile boolean running = true;

        public void stopDownload() {
            running = false;
        }

        @Override
        public void run() {
            int chunk = 1;
            while (running) {
                System.out.println("Downloading chunk " + chunk + "...");
                chunk++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Download stopped gracefully.");
        }
    }

    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        downloader.start();

        try {
            Thread.sleep(3000); // let it download for 3 seconds
        } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Main thread requesting stop...");
        downloader.stopDownload();
    }
}
