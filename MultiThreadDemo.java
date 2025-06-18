class MyThread extends Thread {
    private String threadName;
    private int delay;

    // Constructor to initialize thread name and delay
    public MyThread(String name, int delay) {
        this.threadName = name;
        this.delay = delay;
    }

    // Override run method to define thread's task
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: Step " + i);
            try {
                // Simulate some work with sleep
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has completed.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        // Create three threads with different names and delays
        MyThread thread1 = new MyThread("Thread-1", 500);
        MyThread thread2 = new MyThread("Thread-2", 300);
        MyThread thread3 = new MyThread("Thread-3", 700);

        // Start the threads
        System.out.println("Starting all threads...");
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread continues
        System.out.println("Main thread is running.");

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