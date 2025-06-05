package synchrnization;

public class Counter2 {
    private int counter = 0;

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public int get() {
        return counter;
    }
}

class Geeks2 {
    public static void main(String[] args) {
        Counter2 counter = new Counter2(); // shared resource

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 4000; i++) {
               counter.increment();
            }
        });

        // Start Both threads
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + counter.get());
    }
}
