package synchrnization;

public class Counter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized int getCount() {
        return c;
    }
}

class Geeks {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared resource

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i =0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 11000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter value
        System.out.println(counter.getCount());
    }
}
