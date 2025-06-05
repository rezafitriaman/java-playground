package synchrnization.processSynchronization;

import java.util.concurrent.CompletableFuture;

public class Kitchen {
    private static final Object grill = new Object();
    private static final Object knife = new Object();

    public static void main(String[] args) {
        CompletableFuture<Void>  steakTask = CompletableFuture.runAsync(() -> {
            synchronized (grill) {
                System.out.println("Sous-chef1: Grilling steak");
                sleep(2000);
                System.out.println("Sous-chef: Grilling steak");
            }
        });

        CompletableFuture<Void> saladTask = CompletableFuture.runAsync(() -> {
            synchronized (knife) {
                System.out.println("Sous-chef: Chopping salad");
            }
        });

        CompletableFuture.allOf(steakTask, saladTask).join();
        System.out.println("Head chef: All task done!");
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
