package org.example;

public class BankAccount {
    private int balance;
    private final Object lock = new Object();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdrawSynchronized(int amount) {
        if (amount > 0 && amount <= balance) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(amount + " => Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(amount + " =>Withdrawal failed. Insufficient funds.");
        }
    }

    public void withDrawWithoutSynchronized(int amount) {
        if (amount > 0 && amount <= balance) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(amount + " => Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(amount + " =>Withdrawal failed. Insufficient funds.");
        }
    }

    public void withLock(int amount) {
        synchronized (lock) {
            if (amount > 0 && amount <= balance) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                balance -= amount;
                System.out.println(amount + " => Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println(amount + " =>Withdrawal failed. Insufficient funds.");
            }
        }//end of synchronized lock
    }

    public int getBalance() {
        return balance;
    }
}
