class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " with priority " + getPriority() + " is running: Step " + i);
            try {
                Thread.sleep(100); // Small delay to simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
        System.out.println(getName() + " has completed.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create threads with different priorities
        PriorityThread thread1 = new PriorityThread("Low-Priority-Thread");
        PriorityThread thread2 = new PriorityThread("Normal-Priority-Thread");
        PriorityThread thread3 = new PriorityThread("High-Priority-Thread");

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        System.out.println("Starting all threads...");
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread continues
        System.out.println("Main thread is running with priority " + Thread.currentThread().getPriority());

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have completed. Main thread exiting.");
    }
}