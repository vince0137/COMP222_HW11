/**
 * Class to monitor memory usage. Copied from the HashMap vs Trie Homework.
 */
public class MemoryMonitor implements Runnable {
    private final long intervalMillis;
    private volatile boolean running = true;
    private volatile long maxMemoryUsed = 0;

    MemoryMonitor(long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    void stop() {
        running = false;
    }

    long getMaxMemoryUsed() {
        return maxMemoryUsed;
    }

    @Override
    public void run() {
        Runtime runtime = Runtime.getRuntime();
        while (running) {
            long usedMemory = runtime.totalMemory() - runtime.freeMemory();
            if (usedMemory > maxMemoryUsed) {
                maxMemoryUsed = usedMemory;
            }
            //System.out.println("Current memory usage: " + (usedMemory / 1024 / 1024) + " MB");
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}