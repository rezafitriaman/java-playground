package synchrnization.processSynchronization;

// Process Synchronization in Java
// Process Synchronization is a technique used to coordinate the execution of multiple processes.
// It ensures that the shared resources are safe and in order.
public class BankAccount {
    private int balance = 5000;

    // Synchronized method for deposit operation
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited:" + amount + ", Balance: " + balance);
    }

    // Synchronized method for withdrawal operation
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(); // Shared resources

        // Thread 1 to deposit money into the account
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bankAccount.deposit(200);

                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bankAccount.withdraw(1000);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + bankAccount.getBalance());
    }
}
